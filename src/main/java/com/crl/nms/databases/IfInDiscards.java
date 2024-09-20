package com.crl.nms.databases;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "nms_snmp_ifindiscards")
@Data
@AllArgsConstructor
@Builder
@Setter
@Getter
@Embeddable
public class IfInDiscards {

    @Id
    public IfInDiscardsPK ifInDiscardsPK;

    @Column(name = "param_name")
    private String paramName;

    @Column(name = "param_value")
    private String paramValue;


    public IfInDiscards() {
    }
}
