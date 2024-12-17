package com.crl.nms.databases;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@Entity
@Table(name = "HDDCONFIG")
@XmlRootElement
public class HDDConfig {


    @EmbeddedId
    protected HDDConfigPK hddConfigPK;

    @Column(name = "THRESHOLD")
    private int threshold;

    @Column(name = "CURRENTVALUE")
    private int currentValue;

    @Column(name = "UPDATINGTIME")
    private Date updatingTime;

    public HDDConfig() {
    }

    public HDDConfigPK getHddConfigPK() {
        return hddConfigPK;
    }

    public void setHddConfigPK(HDDConfigPK hddConfigPK) {
        this.hddConfigPK = hddConfigPK;
    }

    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
    }

    public Date getUpdatingTime() {
        return updatingTime;
    }

    public void setUpdatingTime(Date updatingTime) {
        this.updatingTime = updatingTime;
    }
}
