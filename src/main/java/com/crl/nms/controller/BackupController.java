package com.crl.nms.controller;

import com.crl.nms.service.BackupService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/backup")
public class BackupController {

    private final BackupService backupService;

    public BackupController(BackupService backupService) {
        this.backupService = backupService;
    }

    @GetMapping("/manual")
    public String manualBackup() {
        backupService.createBackup();
        return "Backup initiated.";
    }
}
