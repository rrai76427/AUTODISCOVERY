package  com.crl.nms.databases;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author satwikanmol
 */
@Entity
@Table(name = "NMS_NE_RAM")
@XmlRootElement
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NmsNeRam implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    NmsNeRamPK nmsNeRamPK;

    @Column(name = "RAMUSAGE")
    private BigDecimal ramusage;

    @Column(name = "RAM_PERCENTUSAGE")
    private BigDecimal ramPercentusage;

    @JoinColumn(name = "NEKEY", referencedColumnName = "NEKEY", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private NmsNeDetail nmsNeDetail;

    @JoinColumn(name = "NODE_KEY", referencedColumnName = "NODE_KEY")
    @ManyToOne
    private NodeDefinition nodeKey;
}
