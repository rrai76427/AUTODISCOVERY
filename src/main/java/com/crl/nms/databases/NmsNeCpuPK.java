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
public class NmsNeCpuPK {

    @Basic(optional = false)
    @Column(name = "TRENDKEY")
    private String trendkey;

    @Basic(optional = false)
    @Column(name = "UPDATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatetime;
}
