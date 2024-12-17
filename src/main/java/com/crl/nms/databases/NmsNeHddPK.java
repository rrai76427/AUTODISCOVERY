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
public class NmsNeHddPK {

    @Basic(optional = false)
    @Column(name = "HDDKEY")
    private String hddkey;


    @Basic(optional = false)
    @Column(name = "UPDATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatetime;
}
