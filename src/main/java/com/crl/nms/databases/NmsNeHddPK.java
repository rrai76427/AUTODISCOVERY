package com.crl.nms.databases;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;

import java.util.Date;


@Embeddable
@Builder
@AllArgsConstructor
public class NmsNeHddPK {

    @Basic(optional = false)
    @Column(name = "HDDKEY")
    private String hddkey;


    @Basic(optional = false)
    @Column(name = "UPDATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatetime;


    public NmsNeHddPK() {
    }

    public String getHddkey() {
        return hddkey;
    }

    public void setHddkey(String hddkey) {
        this.hddkey = hddkey;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}
