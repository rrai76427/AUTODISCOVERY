package  com.crl.nms.databases;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.*;

/**
 *
 * @author ashwinimehta
 */
@Entity
@Table(name = "NMS_NE_PROCESSES")
@XmlRootElement
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NmsNeProcesses implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected NmsNeProcessesPK nmsNeProcessesPK;

    @Column(name = "PROCNO")
    private Integer procno=0;

    @Column(name = "PROCSTATUS")
    private Short procstatus=0;

    @Column(name = "PROCPATH")
    private String procpath="NA";

    @Column(name = "PROCSIZE")
    private String procsize="NA";

    @Column(name = "PROCCKSUM")
    private String proccksum="NA";

    @Column(name = "RUN_DURATION")
    private String runDuration="NA";

    @Column(name = "CPU_PERCENT")
    private BigDecimal cpuPercent=BigDecimal.valueOf(0);

    @Column(name = "MEM_PERCENT")
    private BigDecimal memPercent=BigDecimal.valueOf(0);

    @Column(name = "IOREAD_BYTES")
    private String ioreadBytes="NA";

    @Column(name = "IOWRITE_BYTES")
    private String iowriteBytes="NA";

    @Column(name = "PROCSTATE")
    private Short procstate=0;

    @JoinColumn(name = "NEKEY", referencedColumnName = "NEKEY", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private NmsNeDetail nmsNeDetail;

    @JoinColumn(name = "NODE_KEY", referencedColumnName = "NODE_KEY")
    @ManyToOne
    private NodeDefinition nodeKey;

    @Column(name = "UPDATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatetime;
}
