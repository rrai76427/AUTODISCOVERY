package com.crl.nms.service;

import com.crl.nms.CDTAUTODISCOVERY.Constants;
import com.crl.nms.CDTAUTODISCOVERY.Global;
import com.crl.nms.messages.IpRange;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * @author root
 */
@Service
public class NePingSubPollThreadService extends Thread implements Constants {

    private static final Logger logger = LoggerFactory.getLogger(NePingSubPollThreadService.class);
    //  private final DbHandler dbObj;
    StringBuilder sb;
    IpRange ipRange;
    // @Autowired
    private DbHandlerService dbHandlerService;

    //  private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(NePingSubPollThread.class);
    NePingSubPollThreadService() {

    }

    NePingSubPollThreadService(StringBuilder sb, DbHandlerService dbHandlerService, IpRange ipRange) {
        this.sb = sb;
        this.dbHandlerService = dbHandlerService;
        this.ipRange = ipRange;
    }

    @Override
    public void run() {

        logger.info("NePingSubPollThread Running" + Thread.currentThread().getName());
        Runtime runtime = Runtime.getRuntime();
        String cmd = sb.toString();
        String inputLine;
        Process process = null;
        List linelist;
        ArrayList<String> liveIpList = new ArrayList();
        try {
            process = runtime.exec(cmd);
            process.waitFor();
            linelist = IOUtils.readLines(process.getInputStream());
            try {
                process.getInputStream().close();
                process.getOutputStream().close();
            } catch (IOException | NullPointerException | ArrayIndexOutOfBoundsException e) {

            }

            for (int i = linelist.size() - 1; i >= 0; i--) {
                inputLine = (String) linelist.remove(i);
                liveIpList.add(inputLine);
                if (inputLine.length() > 4) {
                    System.out.println(inputLine + " " + inputLine.length());
                    StringBuilder sb = new StringBuilder("  nmap -A -T4 ").append(inputLine);
                    System.out.println(sb.toString());

                    NeDetailPollThreadService worker = new NeDetailPollThreadService(sb, dbHandlerService, ipRange);
                    Global.neDetailscheduledThreadPool.submit(worker);//schedule(w

                }


            }
        } catch (InterruptedException | IOException | NullPointerException | ArrayIndexOutOfBoundsException e) {
            logger.info("function:executeFping  Exception=" + e.getMessage());

        } finally {
            if (process != null) {
                process.destroy();
                process.destroyForcibly();
                process = null;
            }
            if (runtime != null) {
                runtime = null;
            }
        }
        checkChangeInAliveHosts(liveIpList);

    }

    private void checkChangeInAliveHosts(ArrayList<String> liveIpList) {
        try {

            boolean aliveFlg = false;
            if (!liveIpList.isEmpty()) {
                aliveFlg = liveIpList.contains("is alive");
            }
            if (liveIpList.stream().count() > 4) {
                System.out.println(liveIpList);
            }


        } catch (Exception ex) {
            logger.info("NePollingThread checkChangeInAliveHosts=" + ex.getMessage());
        }
    }

}
