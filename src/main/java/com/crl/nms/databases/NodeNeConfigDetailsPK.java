package  com.crl.nms.databases;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.*;

/**
 *
 * @author meenuchhindra
 */
@Embeddable
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NodeNeConfigDetailsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "NODE_ID")
    private int nodeId;

    @Basic(optional = false)
    @Column(name = "NE_NAME")
    private String neName;
}
