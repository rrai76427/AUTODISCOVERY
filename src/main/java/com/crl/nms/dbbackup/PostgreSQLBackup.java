package com.crl.nms.dbbackup;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PostgreSQLBackup {

    // Database configuration
    private static final String containerName = "postgres-local-15"; // Docker container name
    private static final String dbHost = "192.168.110.33"; // Database host inside Docker
    private static final String dbPort = "5433"; // Default PostgreSQL port
    private static final String dbName = "nmsdb";
    private static final String dbUser = "postgres";
    private static final String dbPassword = "postgres";
    private static final String backupDir = "/home/crl/"; // Local backup directory

    public static void main(String[] args) {
        try {
            createBackup();
            System.out.println("Backup completed successfully.");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Backup failed.");
        }
    }

    public static void createBackup() throws IOException {
        // Ensure backup directory exists
        if (!Files.isDirectory(Paths.get(backupDir))) {
            throw new IOException("Backup directory does not exist: " + backupDir);
        }

        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        String backupFileName = String.format("backup_%s.backup", timestamp);
        String containerBackupPath = String.format("/home/crl/%s", backupFileName);
        String localBackupPath = String.format("%s/%s", backupDir, backupFileName);

        // Construct Docker exec command to perform the backup inside the container
        String dockerExecCommand = String.format(
                "docker exec %s sh -c \"PGPASSWORD=%s pg_dump -h %s -p %s -U %s -F c -b -v -f %s %s\"",
                containerName,
                dbPassword,
                dbHost,
                dbPort,
                dbUser,
                containerBackupPath,
                dbName
        );

        // Construct Docker cp command to copy the backup from the container to the host
        String dockerCpCommand = String.format(
                "docker cp %s:%s %s",
                containerName,
                containerBackupPath,
                localBackupPath
        );

  /*      try {
            Process process = Runtime.getRuntime().exec(new String[]{"/bin/sh", "-c", dockerExecCommand});
            process.waitFor();
            Process process1 = Runtime.getRuntime().exec(new String[]{"/bin/sh", "-c", dockerCpCommand});
            process1.waitFor();
            // Optionally handle output and errors
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }*/

        try {
            // Execute Docker exec command
            executeCommand(dockerExecCommand);

            // Execute Docker cp command
            executeCommand(dockerCpCommand);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            throw new IOException("Backup process failed", e);
        }
    }

    private static void executeCommand(String command) throws IOException, InterruptedException {
        Process process = Runtime.getRuntime().exec(new String[]{"/bin/sh", "-c", command});

        try (BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
             BufferedReader stdError = new BufferedReader(new InputStreamReader(process.getErrorStream()))) {

            // Read and log the output from the command
            String s;
            while ((s = stdInput.readLine()) != null) {
                System.out.println("OUTPUT: " + s);
            }

            // Read and log any errors from the command
            while ((s = stdError.readLine()) != null) {
                System.err.println("ERROR: " + s);
            }
        }

        process.waitFor(); // Ensure the process completes
        if (process.exitValue() != 0) {
            throw new IOException("Command failed with exit code " + process.exitValue());
        }
    }
}
