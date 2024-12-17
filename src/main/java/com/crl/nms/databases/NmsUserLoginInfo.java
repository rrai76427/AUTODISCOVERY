package  com.crl.nms.databases;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.*;

/**
 *
 * @author meenuchhindra
 */
@Entity
@Table(name = "NMS_USER_LOGIN_INFO")
@XmlRootElement
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NmsUserLoginInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "LOGIN_STATE")
    private Short loginState;

    @Basic(optional = false)
    @Column(name = "USERNAME")
    private String username;

    @Basic(optional = false)
    @Column(name = "ROLE")
    private short role;

    @Column(name = "LOGIN_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date loginTimestamp;

    @Column(name = "ENABLED")
    private Short enabled;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "MOBILE_NO")
    private Long mobileNo;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "NMS_USER_ID_SEQ_NO_P")
    @SequenceGenerator(sequenceName = "NMS_USER_ID_SEQ_NO_P", initialValue = 1, allocationSize = 1, name = "NMS_USER_ID_SEQ_NO_P")
    @Id
    @Basic(optional = false)
    @Column(name = "USER_ID")
    private Integer userId;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "LOGOUT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date logoutTimestamp;

    @Basic(optional = false)
    @Column(name = "OWS_INDEX")
    private short owsIndex;
}
