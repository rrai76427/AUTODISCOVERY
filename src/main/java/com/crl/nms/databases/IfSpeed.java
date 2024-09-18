package com.crl.nms.databases;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "nms_snmp_ifspeed")
@Data
@AllArgsConstructor
@Builder
@Setter
@Getter
@Embeddable
public class IfSpeed {

    @Id
    public IfSpeedPK ifSpeedPK;

    @Column(name = "param_name")
    private String paramName;

    @Column(name = "param_value")
    private String paramValue;




    public IfSpeed() {
    }
}
