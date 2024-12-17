package  com.crl.nms.databases;

import java.io.Serializable;
import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.*;

/**
 *
 * @author ashwinimehta
 */
@Entity
@Table(name = "NMS_INFO_EVENTS")
@XmlRootElement
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NmsInfoEvents implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected NmsInfoEventsPK nmsInfoEventsPK;

    @Column(name = "NEKEY")
    private String nekey;

    @Column(name = "ACTIVITY_DESC")
    private String activityDesc;

    @Column(name = "ACK_FLAG")
    private Short ackFlag;

    @Column(name = "FIRSTNAME")
    private String firstname;

    @Column(name = "LAST_NAME")
    private String lastname;
}
