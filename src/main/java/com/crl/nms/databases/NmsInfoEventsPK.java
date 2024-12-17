package  com.crl.nms.databases;

import java.io.Serializable;
import java.util.Date;
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
public class NmsInfoEventsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "RECV_DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date recvDatetime;

    @Basic(optional = false)
    @Column(name = "EMAIL")
    private String email;
}
