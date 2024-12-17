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
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ENTERPRISE_SYNTAX_CONFIG")
public class EnterpriseSyntaxConfig {

    @Id
    @Column(name = "SYNTAX_ID")
    protected Integer syntaxId;

    @Column(name = "SYNTAX")
    private String syntax;
}
