package com.crl.nms.databases;

import com.fasterxml.jackson.databind.JsonNode;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

/**
 *
 * @author Satwik Anmol
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "NMS_SYSROLE_MENU_CONFIGURATION")
@Entity
@Transactional
public class SysRoleMenuConfig {

    @Column(name = "ROLE_ID", nullable = false)
    @Id
    private Integer roleId;

    @Column(name = "ROLE")
    private String role;

    @Column(name = "CONFIGURATION")
    @JdbcTypeCode(SqlTypes.JSON)
    private JsonNode configuration;

    @Column(name = "HELP")
    @JdbcTypeCode(SqlTypes.JSON)
    private JsonNode help;

    @Column(name = "LANDING_PAGE")
    private String landingPage;

    @Column(name = "MAIN")
    @JdbcTypeCode(SqlTypes.JSON)
    private JsonNode main;

    @Column(name = "REPORT")
    @JdbcTypeCode(SqlTypes.JSON)
    private JsonNode report;

    @Column(name = "USER_MANAGEMENT")
    @JdbcTypeCode(SqlTypes.JSON)
    private JsonNode userManagement;

    public SysRoleMenuConfig(String role, JsonNode configuration, JsonNode help, String landingPage, JsonNode main, JsonNode report, JsonNode userManagement) {
        this.role = role;
        this.configuration = configuration;
        this.help = help;
        this.landingPage = landingPage;
        this.main = main;
        this.report = report;
        this.userManagement = userManagement;
    }
}
