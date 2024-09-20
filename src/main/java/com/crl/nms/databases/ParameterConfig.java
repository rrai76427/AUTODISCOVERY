package com.crl.nms.databases;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

/**
 * @author Sneha Prajapati
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "NMS_PARAMETER_CONFIG")
public class ParameterConfig {

    @EmbeddedId
    protected ParameterConfigPK parameterConfigPK;

    @Column(name = "PARAMETER")
    private String parameter;


}
