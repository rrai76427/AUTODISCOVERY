package com.crl.nms.databases;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "nms_snmp_ifmtu")
@Data
@AllArgsConstructor
@Builder
@Setter
@Getter
@Embeddable
public class IfMtu {

    @Id
    public IfMtuPK ifMtuPK;

    @Column(name = "param_name")
    private String paramName;

    @Column(name = "param_value")
    private String paramValue;




    public IfMtu() {
    }
}
