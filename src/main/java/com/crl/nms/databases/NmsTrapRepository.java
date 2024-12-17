package  com.crl.nms.databases;

import java.io.Serializable;
import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.*;

/**
 *
 * @author ashwinimehta
 */
@Entity
@Table(name = "NMS_TRAP_REPOSITORY")
@XmlRootElement
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NmsTrapRepository implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected NmsTrapRepositoryPK nmsTrapRepositoryPK;

    @Basic(optional = false)
    @Column(name = "TYPE")
    private short type;

    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;

    @Basic(optional = false)
    @Column(name = "SEVERITY")
    private short severity;

    @Basic(optional = false)
    @Column(name = "NOTIFICATION")
    private short notification;

    @Basic(optional = false)
    @Column(name = "DESCRIPTION")
    private String description;

    @Basic(optional = false)
    @Column(name = "LOG_MESG")
    private String logMesg;

    @Basic(optional = false)
    @Column(name = "FWD_VALUE")
    private short fwdValue;

    @Basic(optional = false)
    @Column(name = "ALARM_ID")
    private short alarmId;

    @Basic(optional = false)
    @Column(name = "NE_TYPE")
    private short neType;
}
