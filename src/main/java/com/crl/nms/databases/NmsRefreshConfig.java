package com.crl.nms.databases;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "nms_refresh_config")
@Entity
public class NmsRefreshConfig {
    @Id
    private Integer refreshId;

    @Column(name = "REFRESH_VALUE")
    private String refreshValue;

    @Column(name = "REFRESH_DEFAULT")
    private Integer refreshDefault;
}
