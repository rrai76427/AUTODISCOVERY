#!/bin/bash
mkdir -p /dumpfile/backup
pg_dump -U postgres nmsdb > /dumpfile/backup/nmsDB_backup_2024-08-12_16-24-50.sql
if [ $? -eq 0 ]; then
    echo "Backup successful: /dumpfile/backup/nmsDB_backup_2024-08-12_16-24-50.sql"
else
    echo "Backup failed"
fi
