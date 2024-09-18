package com.crl.nms.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;
import lombok.*;

/**
 *
 * @author Sneha Prajapati
 */


public class AuthenticationProtocolEnumPojo {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "PROTOCOL")
    private String protocol;

    public AuthenticationProtocolEnumPojo(Integer id, String protocol) {
        this.id = id;
        this.protocol = protocol;
    }

    public AuthenticationProtocolEnumPojo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }
}
