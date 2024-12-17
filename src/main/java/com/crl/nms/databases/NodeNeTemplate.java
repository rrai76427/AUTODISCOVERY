package  com.crl.nms.databases;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import jakarta.persistence.*;
import lombok.*;

/**
 *
 * @author meenuchhindra
 */
@Entity
@Table(name = "NODE_NE_TEMPLATE")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NodeNeTemplate implements Serializable {

    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "NODE_NE_TEMPLATE_ID_SEQ_NO")
    @SequenceGenerator(sequenceName = "NODE_NE_TEMPLATE_ID_SEQ_NO", initialValue = 1, allocationSize = 1, name = "NODE_NE_TEMPLATE_ID_SEQ_NO")
    @Id
    @Basic(optional = false)
    @Column(name = "TEMPLATE_ID")
    private Integer templateId;

    @Basic(optional = false)
    @Column(name = "TEMPLATE_NAME")
    private String templateName;

    @Column(name = "CPU_THRESHOLD")
    private String cpuThreshold;

    @Column(name = "RAM_THRESHOLD")
    private String ramThreshold;

    @Column(name = "HDD_THRESHOLD")
    private String hddThreshold;

    @Column(name = "UPDATED_ON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedOn;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "templateId")
    private Collection<NodeNeConfigDetails> nodeNeConfigDetailsCollection;

}
