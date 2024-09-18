package com.crl.nms.databases;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "nms_snmp_ifindex")
@Data
@AllArgsConstructor
@Builder
@Setter
@Getter
@Embeddable
public class IfIndex {

    @Id
    public IfIndexPK ifIndexPK;

    @Column(name = "param_name")
    private String paramName;

    @Column(name = "param_value")
    private String paramValue;




    public IfIndex() {
    }
}
