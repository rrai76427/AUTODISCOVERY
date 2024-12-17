package com.crl.nms.databases;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "nms_snmp_iflastchange")
@Data
@AllArgsConstructor
@Builder
@Setter
@Getter
@Embeddable
@NoArgsConstructor
public class IfLastChange {

    @Id
    public IfLastChangePK ifLastChangePK;

    @Column(name = "param_name")
    private String paramName;

    @Column(name = "param_value")
    private String paramValue;
}
