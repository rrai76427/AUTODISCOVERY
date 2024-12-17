package  com.crl.nms.databases;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.*;

/**
 *
 * @author ashwinimehta
 */
@Entity
@Table(name = "NMS_LEVEL")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NmsLevel implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected NmsLevelPK nmsLevelPK;

    @Basic(optional = false)
    @Column(name = "NODE_TYPE")
    private short nodeType;

    @JoinColumn(name = "NODE_KEY", referencedColumnName = "NODE_KEY")
    @ManyToOne
    private NodeDefinition nodeKey;
}
