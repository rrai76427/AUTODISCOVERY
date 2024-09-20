package com.crl.nms.databases;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;


@Embeddable
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NmsNeDeviceStatsPK {


//    private NmsNeDetail nekey;
//
//
//    private NodeDefinition nodeKey;

    @Basic(optional = false)
    @Column(name = "NEKEY")
    private String nekey;

    @Basic(optional = false)
    @Column(name = "NODE_KEY")
    private Integer nodeKey;


}
