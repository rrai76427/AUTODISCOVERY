package com.crl.nms.databases;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
@Embeddable
public class NmsSnmpEnterPriseDataPK {

    @Column(name = "nekey")
    private String neKey;

    @Column(name = "trap_oid")
    private String trapOid;
}
