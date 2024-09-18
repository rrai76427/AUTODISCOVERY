package com.crl.nms.databases;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "nms_snmp_ifdescr")
@Data
@AllArgsConstructor
@Builder
@Setter
@Getter
@Embeddable
public class IfDescription {
    @Id
    public IfDescriptionPK ifDescriptionPK;

    @Column(name = "param_name")
    private String paramName;

    @Column(name = "param_value")
    private String paramValue;




    public IfDescription() {
    }
}
