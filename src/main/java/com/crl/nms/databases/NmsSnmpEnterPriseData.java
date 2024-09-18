package com.crl.nms.databases;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "nms_snmp_enterprise_data")
@Data
@AllArgsConstructor
@Builder
@Setter
@Getter
public class NmsSnmpEnterPriseData {

    @Id
    public NmsSnmpEnterPriseDataPK nmsSnmpEnterPriseDataPK;

    @Column(name = "param_name")
    private String paramName;

    @Column(name = "param_value")
    private String paramValue;

    @Column(name = "updated_on")
    private Date updatedOn;

    public NmsSnmpEnterPriseData() {
    }
}
