#!/bin/bash

# Configuration
USER="postgres"                  # PostgreSQL username
DATABASE="nmsdb"                      # Name of the database to backup
BACKUP_DIR="/dumpfile/backup"          # Directory where backups will be stored
DATE=$(date +"%F_%H-%M-%S")           # Date format for backup filename
BACKUP_FILE="$BACKUP_DIR/nmsDB_backup_$DATE.sql"  # Full path for the backup file
CRON_JOB="0 2 * * * ../backup_postgres.sh"   # Cron job entry to run the script daily at 2 AM

# Ensure the backup directory exists
mkdir -p "$BACKUP_DIR"

# Create backup
echo "Starting backup..."
pg_dump -U $USER $DATABASE > "$BACKUP_FILE"

# Check if the backup was successful
if [ $? -eq 0 ]; then
    echo "Backup successful: $BACKUP_FILE"
else
    echo "Backup failed"
    exit 1
fi

# Add cron job if not already present
if ! crontab -l 2>/dev/null | grep -F "$CRON_JOB" > /dev/null; then
    (crontab -l 2>/dev/null; echo "$CRON_JOB") | crontab -
    echo "Cron job added: $CRON_JOB"
else
    echo "Cron job already exists: $CRON_JOB"
fi
