package  com.crl.nms.databases;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.*;

/**
 *
 * @author Administrator
 */
@Embeddable
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NmsNeSnmpConfigPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "NEKEY")
    private String nekey;

    @Basic(optional = false)
    @Column(name = "PROFILE_ID")
    private short profileId;
}
