package  com.crl.nms.databases;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
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
public class EnterpriseParamTemplatePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "TEMPLATE_NAME")
    private String templateName;

    @Basic(optional = false)
    @Column(name = "NEKEY")
    private String nekey;
}
