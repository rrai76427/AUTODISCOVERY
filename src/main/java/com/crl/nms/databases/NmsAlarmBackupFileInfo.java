package  com.crl.nms.databases;
import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ashwinimehta
 */
@Entity
@Table(name = "NMS_ALARM_BACKUP_FILE_INFO")
@XmlRootElement

public class NmsAlarmBackupFileInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "BACKUP_PATH")
    private String backupPath;
    @Column(name = "FILENAME")
    private String filename;
    @Id
    @Basic(optional = false)
    @Column(name = "BACKUPTIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date backuptime;

    public NmsAlarmBackupFileInfo() {
    }

    public NmsAlarmBackupFileInfo(Date backuptime) {
        this.backuptime = backuptime;
    }

    public String getBackupPath() {
        return backupPath;
    }

    public void setBackupPath(String backupPath) {
        this.backupPath = backupPath;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Date getBackuptime() {
        return backuptime;
    }

    public void setBackuptime(Date backuptime) {
        this.backuptime = backuptime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (backuptime != null ? backuptime.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NmsAlarmBackupFileInfo)) {
            return false;
        }
        NmsAlarmBackupFileInfo other = (NmsAlarmBackupFileInfo) object;
        if ((this.backuptime == null && other.backuptime != null) || (this.backuptime != null && !this.backuptime.equals(other.backuptime))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "shm_bo.NmsAlarmBackupFileInfo[ backuptime=" + backuptime + " ]";
    }
    
}
