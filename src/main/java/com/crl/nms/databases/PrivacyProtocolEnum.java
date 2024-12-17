package com.crl.nms.databases;

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

@Data
@Getter
@Setter
@Table(name = "NMS_ENUM_PRIVACY_PROTOCOL")
@Entity
@Transactional
public class PrivacyProtocolEnum {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "PROTOCOL")
    private String protocol;

    public PrivacyProtocolEnum() {
    }

    public PrivacyProtocolEnum(Integer id, String protocol) {
        this.id = id;
        this.protocol = protocol;
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
