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
 * @author meenuchhindra
 */
@Entity
@Table(name = "NMS_ALARMS")
@XmlRootElement
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NmsAlarms implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "NEKEY")
    private String nekey;

    @JoinColumn(name = "NODE_ID", referencedColumnName = "NODE_KEY")
    @ManyToOne
    private NodeDefinition nodeId;

    @JoinColumn(name = "NE_TYPE", referencedColumnName = "NE_TYPE")
    @ManyToOne
    private NmsNeTypes neType;

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
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    @Getter
    @Column(name = "RDT_FLAG")
    private Short rdtFlag;

    @Column(name = "ALARM_ID")
    private String alarmId;

    @JoinColumns({
            @JoinColumn(name = "LOCATION_CODE", referencedColumnName = "locationCode"),
            @JoinColumn(name = "LINE_ID", referencedColumnName = "lineId")
    })
    @ManyToOne
    private LocationData locationData;


    @JoinColumn(name = "NEKEY", referencedColumnName = "NEKEY", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private NmsNeDetail nmsNeDetail;
}
