package com.crl.nms.databases;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class HDDConfigPK {

    @Column(name = "MOUNTON")
    private String mounton;

    @Basic(optional = false)
    @Column(name = "NEKEY")
    private String nekey;

    public HDDConfigPK() {
    }

    public String getMounton() {
        return mounton;
    }

    public void setMounton(String mounton) {
        this.mounton = mounton;
    }

    public String getNekey() {
        return nekey;
    }

    public void setNekey(String nekey) {
        this.nekey = nekey;
    }
}
