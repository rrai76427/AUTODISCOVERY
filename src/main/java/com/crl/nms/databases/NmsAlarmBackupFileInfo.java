package  com.crl.nms.databases;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.*;

/**
 *
 * @author ashwinimehta
 */
@Entity
@Table(name = "NMS_ALARM_BACKUP_FILE_INFO")
@XmlRootElement
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
}
