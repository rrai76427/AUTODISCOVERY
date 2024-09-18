package com.crl.nms.databases;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "nms_snmp_ifoutdiscards")
@Data
@AllArgsConstructor
@Builder
@Setter
@Getter
@Embeddable
public class IfOutDiscards {


    @Id
    public IfOutDiscardsPK ifOutDiscardsPK;

    @Column(name = "param_name")
    private String paramName;

    @Column(name = "param_value")
    private String paramValue;




    public IfOutDiscards() {
    }
}
