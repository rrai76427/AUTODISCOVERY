package com.crl.nms.databases;

import com.fasterxml.jackson.databind.JsonNode;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

/**
 * @author Sneha Prajapati
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "NMS_SYS_ROLE_BASED_PAGE")
@Entity
@Transactional
public class NmsSysRoleBasedPage {

    @Id
    @Column(name = "ROLE_ID")
    private Integer roleId;

    @Column(name = "ROLE_NAME")
    private String roleName;

    @Column(name = "LANDING_PAGE")
    private String landingPage;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "MAIN")
    private String main;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "CONFIGURATION")
    private String configuration;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "USER_MANAGEMENT")
    private String userManagement;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "REPORT")
    private String report;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "HELP")
    private JsonNode help;

}
