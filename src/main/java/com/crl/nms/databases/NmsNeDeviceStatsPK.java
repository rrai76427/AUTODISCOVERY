package com.crl.nms.databases;

import jakarta.persistence.*;
import lombok.*;

@Embeddable
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NmsNeDeviceStatsPK {

    @Basic(optional = false)
    @Column(name = "NEKEY")
    private String nekey;

    @Basic(optional = false)
    @Column(name = "NODE_KEY")
    private Integer nodeKey;
}
