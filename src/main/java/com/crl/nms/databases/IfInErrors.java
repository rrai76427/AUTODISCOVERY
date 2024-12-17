package com.crl.nms.databases;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "nms_snmp_iferrors")
@Data
@AllArgsConstructor
@Builder
@Setter
@Getter
@Embeddable
@NoArgsConstructor
public class IfInErrors {

    @Id
    public IfInErrorsPK ifInErrorsPK;

    @Column(name = "param_name")
    private String paramName;

    @Column(name = "param_value")
    private String paramValue;
}
