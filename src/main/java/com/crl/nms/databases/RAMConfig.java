package com.crl.nms.databases;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.*;
import java.util.Date;

/**
 *
 * @author Sneha Prajapati
 */

@Entity
@Table(name = "RAMCONFIG")
@XmlRootElement
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RAMConfig {

    @Id
    @Basic(optional = false)
    @Column(name = "NEKEY")
    private String nekey;

    @Column(name = "THRESHOLD")
    private int threshold;

    @Column(name = "CURRENTVALUE")
    private int currentValue;

    @Column(name = "UPDATINGTIME")
    private Date updatingTime;
}
