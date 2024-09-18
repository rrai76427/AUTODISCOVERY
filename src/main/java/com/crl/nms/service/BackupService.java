package com.crl.nms.service;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class BackupService {

    private final String dbHost = "postgres"; // Docker service name
    private final String dbPort = "5433"; // Default PostgreSQL port
    private final String dbName = "nmsdb";
    private final String dbUser = "postgres";
    private final String dbPassword = "postgres";
    private final String backupDir = "/home/crl/PROJECT/TELECOM/CBTCDEMO/backup"; // This should be a volume-mounted path

    public void createBackup() {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        String backupFilePath = String.format("%s/backup_%s.backup", backupDir, timestamp);

        // Use pg_dump command
        String backupCommand = String.format(
                "PGPASSWORD=%s pg_dump -h %s -p %s -U %s -F c -b -v -f %s %s",
                dbPassword,
                dbHost,
                dbPort,
                dbUser,
                backupFilePath,
                dbName
        );

        try {
            Process process = Runtime.getRuntime().exec(new String[]{"/bin/sh", "-c", backupCommand});
            process.waitFor();
            // Optionally handle output and errors
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
