package com.crl.nms.databases;

import jakarta.persistence.*;
import lombok.*;

/**
 * @author Sneha Prajapati
 */

@Entity
@Table(name = "TOPOLOGY_GROUP")

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TopologyGroup {

    @Id
    @Basic(optional = false)
    @Column(name = "GROUP_NAME")
    private String groupName;

    @Column(name = "X_COORDINATE")
    private String xcoordinate;

    @Column(name = "Y_COORDINATE")
    private String ycoordinate;

    @Column(name = "HEIGHT")
    private String height;

    @Column(name = "WIDTH")
    private String width;
}
