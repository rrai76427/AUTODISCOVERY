package  com.crl.nms.databases;

import java.io.Serializable;
import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.*;

/**
 *
 * @author meenuchhindra
 */
@Entity
@Table(name = "NMS_DEVICE_LINK")
@XmlRootElement
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NmsDeviceLink implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "NEKEY")
    private String nekey;

    @Column(name = "DEVICE_LINK")
    private String deviceLink;

    @JoinColumn(name = "NEKEY", referencedColumnName = "NEKEY", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private NmsNeDetail nmsNeDetail;
}
