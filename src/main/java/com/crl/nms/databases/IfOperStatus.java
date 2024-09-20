package com.crl.nms.databases;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "nms_snmp_ifoper_status")
@Data
@AllArgsConstructor
@Builder
@Setter
@Getter
@Embeddable
public class IfOperStatus {

    @Id
    public IfOperStatusPK ifOperStatusPK;

    @Column(name = "param_name")
    private String paramName;

    @Column(name = "param_value")
    private String paramValue;


    public IfOperStatus() {
    }
}
