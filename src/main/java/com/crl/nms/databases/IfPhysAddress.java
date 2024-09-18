package com.crl.nms.databases;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "nms_snmp_ifphysaddress")
@Data
@AllArgsConstructor
@Builder
@Setter
@Getter
@Embeddable
public class IfPhysAddress {

    @Id
    public IfPhysAddressPK ifPhysAddressPK;

    @Column(name = "param_name")
    private String paramName;

    @Column(name = "param_value")
    private String paramValue;




    public IfPhysAddress() {
    }
}
