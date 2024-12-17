package  com.crl.nms.databases;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.*;

/**
 *
 * @author ashwinimehta
 */
@Embeddable
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NmsPerfIftablePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "NEKEY")
    private String nekey;

    @Basic(optional = false)
    @Column(name = "IFINDEX")
    private int ifindex;
}
