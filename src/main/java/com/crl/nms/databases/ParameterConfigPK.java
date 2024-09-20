package com.crl.nms.databases;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

/**
 * @author Sneha Prajapati
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Embeddable
public class ParameterConfigPK {

    @Column(name = "PARAMETER_ID")
    private Integer parameterId;

    @Column(name = "WIDGET_CONFIG_ID")
    private Integer widgetConfigId;

}
