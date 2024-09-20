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
 * @author Sneha Prajapati
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "NMS_COMPUTATIONAL_SUBJECT_CONFIG")
public class ComputationalSubjectConfig {

    @Id
    @Column(name = "COMPUTATIONAL_SUBJECT_ID")
    private Integer computationalSubjectId;

    @Column(name = "COMPUTATIONAL_SUBJECT")
    private String computationalSubject;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "NE_TYPE_LIST")
    private JsonNode neTypeList;

    @Column(name = "PARAMETER_ID")
    private Integer parameterId;

}
