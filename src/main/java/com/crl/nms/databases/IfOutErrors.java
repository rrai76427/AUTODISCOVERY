package com.crl.nms.databases;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "nms_snmp_ifouterrors")
@Data
@AllArgsConstructor
@Builder
@Setter
@Getter
@Embeddable
public class IfOutErrors {


    @Id
    public IfOutErrorsPK ifOutErrorsPK;

    @Column(name = "param_name")
    private String paramName;

    @Column(name = "param_value")
    private String paramValue;



    public IfOutErrors() {
    }
}
