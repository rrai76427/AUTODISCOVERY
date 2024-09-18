package com.crl.nms.databases;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "nms_snmp_ifoutucastpkts")
@Data
@AllArgsConstructor
@Builder
@Setter
@Getter
@Embeddable
public class IfOutUcastPkts {

    @Id
    public IfOutUcastPktsPK ifOutUcastPktsPK;

    @Column(name = "param_name")
    private String paramName;

    @Column(name = "param_value")
    private String paramValue;



    public IfOutUcastPkts() {
    }
}
