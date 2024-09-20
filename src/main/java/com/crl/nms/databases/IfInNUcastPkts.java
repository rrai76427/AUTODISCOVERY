package com.crl.nms.databases;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "nms_snmp_ifinnucastpkts")
@Data
@AllArgsConstructor
@Builder
@Setter
@Getter
@Embeddable
public class IfInNUcastPkts {

    @Id
    public IfInNUcastPktsPK ifInNUcastPktsPK;

    @Column(name = "param_name")
    private String paramName;

    @Column(name = "param_value")
    private String paramValue;


    public IfInNUcastPkts() {
    }
}
