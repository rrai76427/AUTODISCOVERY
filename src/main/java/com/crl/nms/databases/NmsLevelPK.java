package  com.crl.nms.databases;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.*;

/**
 *
 * @author ashwinimehta
 */
@Embeddable
@Builder
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NmsLevelPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "NODE_ID")
    private int nodeId;

    @Basic(optional = false)
    @Column(name = "NMS_IP")
    private String nmsIp;
}
