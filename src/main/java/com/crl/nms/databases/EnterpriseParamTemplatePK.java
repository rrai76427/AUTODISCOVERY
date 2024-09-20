package com.crl.nms.databases;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

/**
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
