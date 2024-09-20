package com.crl.nms.databases;

import com.fasterxml.jackson.databind.JsonNode;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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
@Entity
@Table(name = "NMS_WIDGET_METADATA")
public class WidgetMetaData {

    @EmbeddedId
    protected WidgetMetaDataPK widgetMetaDataPK;

    @Column(name = "PARAMETER_ID")
    private Integer parameterId;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "RETURN_COLUMNS")
    private JsonNode returnColumns;
}
