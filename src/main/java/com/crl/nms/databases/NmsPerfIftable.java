package  com.crl.nms.databases;
import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.*;

/**
 *
 * @author ashwinimehta
 */
@Entity
@Table(name = "NMS_PERF_IFTABLE")
@XmlRootElement
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NmsPerfIftable implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected NmsPerfIftablePK nmsPerfIftablePK;

    @Column(name = "IFDESCR")
    private String ifdescr;

    @Column(name = "IFTYPE")
    private String iftype;

    @Column(name = "IFMTU")
    private String ifmtu;

    @Column(name = "IFSPEED")
    private String ifspeed;

    @Column(name = "IFPHYSADDRESS")
    private String ifphysaddress;

    @Column(name = "IFADMINSTATUS")
    private String ifadminstatus;

    @Column(name = "IFOPERSTATUS")
    private String ifoperstatus;

    @Column(name = "IFLASTCHANGE")
    private String iflastchange;

    @Column(name = "IFINOCTETS")
    private String ifinoctets;

    @Column(name = "IFINUCASTPKTS")
    private String ifinucastpkts;

    @Column(name = "IFINNUCASTPKTS")
    private String ifinnucastpkts;

    @Column(name = "IFINDISCARDS")
    private String ifindiscards;

    @Column(name = "IFINERRORS")
    private String ifinerrors;

    @Column(name = "IFINUNKNOWNPROTOS")
    private String ifinunknownprotos;

    @Column(name = "IFOUTOCTETS")
    private String ifoutoctets;

    @Column(name = "IFOUTUCASTPKTS")
    private String ifoutucastpkts;

    @Column(name = "IFOUTNUCASTPKTS")
    private String ifoutnucastpkts;

    @Column(name = "IFOUTDISCARDS")
    private String ifoutdiscards;

    @Column(name = "IFOUTERRORS")
    private String ifouterrors;

    @Column(name = "IFOUTQLEN")
    private String ifoutqlen;

    @Column(name = "IFSPECIFIC")
    private String ifspecific;

    @Column(name = "PORTOCCUPIED")
    private String portoccupied;

    @Column(name = "SLOTNO")
    private String slotno;

    @Column(name = "PORTNO")
    private String portno;

    @Column(name = "UPDATEDON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedon;

    @JoinColumn(name = "NEKEY", referencedColumnName = "NEKEY", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private NmsNeDetail nmsNeDetail;
}
