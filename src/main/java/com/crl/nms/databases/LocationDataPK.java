package com.crl.nms.databases;

import lombok.*;

import java.io.Serializable;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LocationDataPK implements Serializable{

    String locationCode;

    int lineId;
}
