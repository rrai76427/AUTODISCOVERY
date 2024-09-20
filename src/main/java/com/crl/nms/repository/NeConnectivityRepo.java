/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crl.nms.repository;


import com.crl.nms.databases.NeConnectivity;
import com.crl.nms.databases.NeConnectivityPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Sneha Prajapati
 */
public interface NeConnectivityRepo extends JpaRepository<NeConnectivity, NeConnectivityPK> {

    List<NeConnectivity> findByneConnectivityPKDestNekey(String destNekey);

    List<NeConnectivity> findBysrcNodeid(String srcNodeid);

    List<NeConnectivity> findByDestNodeid(String destNodeid);

    List<NeConnectivity> findBySrcNodeidAndNeConnectivityPKSrcNekeyIn(String srcNodeid, List<String> srcNekeyList);

    List<NeConnectivity> findByDestNodeidAndNeConnectivityPKDestNekeyIn(String destNodeid, List<String> destNekeyList);


//    @Modifying
//    @Query("DELETE FROM NeConnectivity nc WHERE (nc.srcNeIp = :destIp AND nc.srcPort = 0) OR (nc.destNeIp = :destIp AND nc.destPort = 0)")
//    void deleteByDestIpAndPort(String destIp);

  /*  @Modifying
    @Query("DELETE FROM NeConnectivity nc WHERE nc.srcNeIp = :srcIp AND nc.srcPort = :srcPort AND nc.destNeIp = :destIp AND nc.destPort = :destPort")
    void deleteBySrcAndDest(String srcIp, String srcPort, String destIp, String destPort);*/

}
