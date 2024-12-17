package com.crl.nms.databases;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.io.Serializable;

/**
 * @author satwik
 */
@Embeddable
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class PatchVersionStatusPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "PATCH_MODULE_ID")
    private String patchModuleId;

    @JoinColumn(name = "NEKEY", referencedColumnName = "NEKEY")
    @ManyToOne(optional = false)
    private NmsNeDetail nekey;
}
