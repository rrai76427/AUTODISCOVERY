package com.crl.nms.databases;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "nms_snmp_ifoutnucastpkts")
@Data
@AllArgsConstructor
@Builder
@Setter
@Getter
@Embeddable
public class IfOutNUcastPkts {

    @Id
    public IfOutNUcastPktsPK ifOutNUcastPktsPK;

    @Column(name = "param_name")
    private String paramName;

    @Column(name = "param_value")
    private String paramValue;




    public IfOutNUcastPkts() {
    }
}
