package com.crl.nms.databases;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

/**
 * @author Sneha Prajapati
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "NMS_NE_TYPE_IMAGE")
public class NmsNeTypeImage {

    @Id
    @Column(name = "IMAGEID")
    private Integer imageId;

    @Column(name = "IMAGETYPE")
    private Integer imageType;

    @Column(name = "NETYPE")
    private Integer neType;

    @Column(name = "NAME")
    private String name;

    @Column(name = "IMAGE")
    private byte[] image;
}
