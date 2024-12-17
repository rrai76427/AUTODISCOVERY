package com.crl.nms.databases;

import jakarta.persistence.*;
import lombok.*;

/**
 *
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
