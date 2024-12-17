package com.crl.nms.databases;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

/**
 *
 * @author Sneha Prajapati
 */
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "nms_duration_config")
@Entity
public class NmsDurationConfig {

    @Id
    private Integer durationId;

    @Column(name = "DURATION_TYPE")
    private String durationType;
}
