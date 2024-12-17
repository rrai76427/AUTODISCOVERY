package  com.crl.nms.databases;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import jakarta.persistence.*;
import lombok.*;

/**
 *
 * @author meenuchhindra
 */
@Entity
@Table(name = "NODE_NE_CONFIG_DETAILS")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NodeNeConfigDetails implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected NodeNeConfigDetailsPK nodeNeConfigDetailsPK;

    @Column(name = "NE_TYPE")
    private Short neType;

    @Column(name = "NE_IP")
    private String neIp;

    @Column(name = "STATUS")
    private BigInteger status;

    @Column(name = "UPDATEDON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedon;

    @JoinColumn(name = "TEMPLATE_ID", referencedColumnName = "TEMPLATE_ID")
    @ManyToOne(optional = false)
    private NodeNeTemplate templateId;
}
