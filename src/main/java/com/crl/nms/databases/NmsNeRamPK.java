package com.crl.nms.databases;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;

import java.util.Date;

@Embeddable
@Builder
@AllArgsConstructor
public class NmsNeRamPK {

    //@Column(name = "NEKEY")

    @Basic(optional = false)
    @Column(name = "NEKEY")
    private String nekey;
   @Basic(optional = false)
    @Column(name = "UPDATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatetime;


    public NmsNeRamPK() {
    }

    public String getNekey() {
        return nekey;
    }

    public void setNekey(String nekey) {
        this.nekey = nekey;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}
