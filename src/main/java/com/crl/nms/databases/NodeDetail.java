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
@Table(name = "NODE_DETAIL")
@XmlRootElement
@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NodeDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected NodeDetailPK nodeDetailPK;

    @Basic(optional = false)
    @Column(name = "NMS_IP")
    private String nmsIp;

    @Basic(optional = false)
    @Column(name = "NODE_STATUS")
    private short nodeStatus;

    @Basic(optional = false)
    @Column(name = "LINK_STATUS")
    private short linkStatus;

    @Basic(optional = false)
    @Column(name = "LOCATION")
    private String location;

    @Basic(optional = false)
    @Column(name = "RESERVE_TWO")
    private String reserveTwo;

    @Basic(optional = false)
    @Column(name = "UPDATED_ON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedOn;

    @Basic(optional = false)
    @Column(name = "UPDATED_BY")
    private String updatedBy;

    @Column(name = "POLL_INTERVAL")
    private Long pollInterval;

    @JoinColumn(name = "NODE_KEY", referencedColumnName = "NODE_KEY")
    @ManyToOne(optional = false)
    private NodeDefinition nodeKey;
}
