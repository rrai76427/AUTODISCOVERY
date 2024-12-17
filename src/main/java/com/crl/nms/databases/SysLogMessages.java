package com.crl.nms.databases;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "NMS_SYSLOG_MESSAGES")
@Entity
@Transactional
public class SysLogMessages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "facility")
    private String facility;

    @Column(name = "severity")
    private String severity;

    @Column(name = "timestamp")
    private Date timestamp;


    @Column(name = "hostname")
    private String hostname;

    @Column(name = "message")
    private String message;

    @Column(name = "message_type")
    private String messageType;
}
