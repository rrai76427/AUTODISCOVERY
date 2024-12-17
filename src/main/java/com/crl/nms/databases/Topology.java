package com.crl.nms.databases;

import com.fasterxml.jackson.databind.JsonNode;
import jakarta.persistence.*;
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
@Table(name = "NMS_TOPOLOGY")
public class Topology {

    @Id
    @Column(name = "TOPOLOGY_ID")
    protected Integer topologyId;

    @Column(name = "TOPOLOGY_NAME")
    private String topologyName;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "DEFAULT_FLAG")
    protected Integer defaultFlag;

    @Column(name = "DESCRIPTION")
    private String description;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "TOPOLOGY_DATA")
    private JsonNode topologyData;
}
