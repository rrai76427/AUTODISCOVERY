package com.crl.nms.databases;

import com.fasterxml.jackson.databind.JsonNode;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

/**
 *
 * @author Sneha Prajapati
 */

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "NMS_GUI_DASHBOARD_CONFIGURATION_DATA")
public class NmsGuiDashboardConfigurationData {

    @Id
    @Column(name = "KEY")
    private String key;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "VALUE")
    private JsonNode value;
}
