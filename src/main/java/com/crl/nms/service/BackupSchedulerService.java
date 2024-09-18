package com.crl.nms.service;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class BackupSchedulerService {

    private final BackupService backupService;

    public BackupSchedulerService(BackupService backupService) {
        this.backupService = backupService;
    }

    @Scheduled(cron = "0 0 2 * * *") // Every day at 2 AM
    public void performScheduledBackup() {
        backupService.createBackup();
    }
}

