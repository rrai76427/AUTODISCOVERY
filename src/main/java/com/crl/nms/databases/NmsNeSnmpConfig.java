package  com.crl.nms.databases;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.*;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "NMS_NE_SNMP_CONFIG")
@XmlRootElement
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NmsNeSnmpConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected NmsNeSnmpConfigPK nmsNeSnmpConfigPK;

    @Basic(optional = false)
    @Column(name = "UPDATED_ON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedOn;
    
    @JoinColumn(name = "PROFILE_ID", referencedColumnName = "PROFILE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SnmpProfileTemplate snmpProfileTemplate;
}
