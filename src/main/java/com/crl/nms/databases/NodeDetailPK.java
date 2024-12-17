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
public class NodeDetailPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "NODE_ID")
    private String nodeId;

    @Basic(optional = false)
    @Column(name = "PARENT_ID")
    private String parentId;
}
