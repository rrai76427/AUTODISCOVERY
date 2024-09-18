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
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "NMS_HIERARCHY")
public class Hierarchy {

    @Id
    @Column(name = "HIERARCHY_ID")
    protected Integer hierarchyId;

    @Column(name = "HIERARCHY_NAME")
    private String hierarchyName;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "DEFAULT_FLAG")
    protected Integer defaultFlag;

    @Column(name = "DESCRIPTION")
    private String description;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "HIERARCHY_DATA")
    private JsonNode hierarchyData;
}
