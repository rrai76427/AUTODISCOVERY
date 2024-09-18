package com.crl.nms.databases;

import com.fasterxml.jackson.databind.JsonNode;
import jakarta.transaction.Transactional;
import org.hibernate.annotations.JdbcTypeCode;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.type.SqlTypes;


/**
 *
 * @author Sneha Prajapati
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "NMS_CUSTOM_DASHBOARD")
@Entity
@Transactional
public class CustomDashboard {

    @Id
    @Column(name = "DASHBOARD_ID")
    private Integer dashboardId;

    @Column(name = "DASHBOARD_NAME")
    private String dashboardName;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "WIDGET_SIZE")
    private Integer widgetSize;

    @Column(name = "DEFAULT_FLAG")
    private Integer defaultFlag;

    @Column(name = "DESCRIPTION")
    private String description;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "DASHBOARD_DATA")
    private JsonNode dashboardData;

}
