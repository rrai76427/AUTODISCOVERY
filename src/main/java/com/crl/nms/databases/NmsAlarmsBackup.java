package  com.crl.nms.databases;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.*;

/**
 *
 * @author ashwinimehta
 */
@Entity
@Table(name = "NMS_ALARMS_BACKUP")
@XmlRootElement
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NmsAlarmsBackup implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "NEKEY")
    private String nekey;

    @Column(name = "NODE_ID")
    private Integer nodeId;
    
    @Column(name = "ALARM_ID")
    private Short alarmId;

    @Column(name = "SEVERITY")
    private Short severity;

    @Column(name = "ALARM_DESC")
    private String alarmDesc;

    @Column(name = "RECEIVING_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date receivingDateTime;

    @Column(name = "CLEARING_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date clearingDateTime;

    @Column(name = "FAULT_STATUS")
    private Short faultStatus;

    @Id
    @Basic(optional = false)
    @Column(name = "TAGNO")
    private BigDecimal tagno;

    @Column(name = "ACK_FLG")
    private Short ackFlg;

    @Column(name = "ALARM_COUNT")
    private BigInteger alarmCount;

    @Column(name = "NOTIFY")
    private Short notify;

    @Column(name = "SUPPRESSION")
    private Short suppression;

    @Column(name = "REMARK")
    private String remark;

    @Column(name = "TRAP_OID")
    private String trapOid;

    @Column(name = "NODE_KEY")
    private Integer nodeKey;

    @Column(name = "RDT_CLOSE_REMARK")
    private String rdtCloseRemark;

    @Column(name = "RDT_REMADIAL_ACTION")
    private String rdtRemadialAction;

    @Column(name = "RDT_FLAG")
    private Short rdtFlag;
}
