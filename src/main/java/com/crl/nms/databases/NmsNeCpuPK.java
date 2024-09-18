package com.crl.nms.databases;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;

import java.util.Date;



@Embeddable
@Builder
@AllArgsConstructor
public class NmsNeCpuPK {

    @Basic(optional = false)
    @Column(name = "TRENDKEY")
    private String trendkey;

    @Basic(optional = false)
    @Column(name = "UPDATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatetime;

    public NmsNeCpuPK() {
    }

    public String getTrendkey() {
        return trendkey;
    }

    public void setTrendkey(String trendkey) {
        this.trendkey = trendkey;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}
