package  com.crl.nms.databases;

import java.io.Serializable;
import java.math.BigInteger;
import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.*;

/**
 *
 * @author ashwinimehta
 */
@Entity
@Table(name = "NMS_TRAP_CONFIGURATION")
@XmlRootElement
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NmsTrapConfiguration implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected NmsTrapConfigurationPK nmsTrapConfigurationPK;

    @Column(name = "NE_TYPE")
    private Short neType;

    @Column(name = "TRAP_TYPE")
    private Short trapType;

    @Column(name = "SEVERITY")
    private Short severity;

    @Column(name = "NOTIFY")
    private Short notify;

    @Column(name = "AUDIO")
    private Short audio;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "LOG_MESG")
    private String logMesg;

    @Column(name = "NWKEY")
    private BigInteger nwkey;

    @Column(name = "ADDC_NW_ID")
    private Short addcNwId;

    @Basic(optional = false)
    @Column(name = "ALARM_ID")
    private short alarmId;

    @Column(name = "NODE_KEY")
    private Integer nodeKey;

    @JoinColumn(name = "NEKEY", referencedColumnName = "NEKEY", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private NmsNeDetail nmsNeDetail;

}
