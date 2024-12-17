package com.crl.nms.databases;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "nms_snmp_ifadminstatus")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
@Embeddable
public class IfAdminStatus {

    @Id
    public IfAdminStatusPK ifAdminStatusPK;

    @Column(name = "param_name")
    private String paramName;

    @Column(name = "param_value")
    private String paramValue;
}
