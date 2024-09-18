package com.crl.nms.databases;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;
import lombok.*;

/**
 *
 * @author Sneha Prajapati
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "NMS_DEVICE_STATUS_ENUM")
@Entity
@Transactional
public class DeviceStatusEnum {

    @Id
    @Column(name = "ID")
    private Short id;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "COLOR")
    private String color;

    @Column(name = "BACKGROUND_COLOR")
    private String background_color;

    @Column(name = "BACKGROUND_COLOR_DARK")
    private String background_color_dark;

}
