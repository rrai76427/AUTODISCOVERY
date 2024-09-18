package com.crl.nms.databases;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "nms_snmp_iflnoctets")
@Data
@AllArgsConstructor
@Builder
@Setter
@Getter
@Embeddable
public class IfInOctets {

    @Id
    public IfInOctetsPK ifInOctetsPK;

    @Column(name = "param_name")
    private String paramName;

    @Column(name = "param_value")
    private String paramValue;




    public IfInOctets() {
    }
}
