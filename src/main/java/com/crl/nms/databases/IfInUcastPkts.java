package com.crl.nms.databases;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "nms_snmp_ifinucastpkts")
@Data
@AllArgsConstructor
@Builder
@Setter
@Getter
@Embeddable
public class IfInUcastPkts {

    @Id
    public IfInUcastPktsPK ifInUcastPktsPK;

    @Column(name = "param_name")
    private String paramName;

    @Column(name = "param_value")
    private String paramValue;


    public IfInUcastPkts() {
    }
}
