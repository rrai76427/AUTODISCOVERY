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
@Table(name = "NMS_NE_HDD")
@XmlRootElement
@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NmsNeHdd implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected NmsNeHddPK nmsNeHddPK;

    @Basic(optional = false)
    @Column(name = "HDDNO")
    private int hddno;

    @Column(name = "FILESYSNAME")
    private String filesysname;

    @Column(name = "TOTALSIZE")
    private String totalsize;

    @Basic(optional = false)
    @Column(name = "USAGE_PERCENT")
    private String usagePercent;

    @Column(name = "DISKUTIL")
    private String diskutil;

    @Column(name = "MOUNTON")
    private String mounton;

    @JoinColumn(name = "NEKEY", referencedColumnName = "NEKEY")
    @ManyToOne(optional = false)
    private NmsNeDetail nekey;

    @JoinColumn(name = "NODE_KEY", referencedColumnName = "NODE_KEY")
    @ManyToOne
    private NodeDefinition nodeKey;
}
