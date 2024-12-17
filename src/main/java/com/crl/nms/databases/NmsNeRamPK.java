package com.crl.nms.databases;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Embeddable
@Builder
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NmsNeRamPK {

    @Basic(optional = false)
    @Column(name = "NEKEY")
    private String nekey;

    @Basic(optional = false)
    @Column(name = "UPDATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatetime;
}
