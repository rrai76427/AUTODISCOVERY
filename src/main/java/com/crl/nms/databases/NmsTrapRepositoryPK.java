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
@NoArgsConstructor
@AllArgsConstructor
public class NmsTrapRepositoryPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "OID")
    private String oid;

    @Basic(optional = false)
    @Column(name = "GENERIC_VALUE")
    private short genericValue;

    @Basic(optional = false)
    @Column(name = "SPECIFIC_VALUE")
    private long specificValue;
}
