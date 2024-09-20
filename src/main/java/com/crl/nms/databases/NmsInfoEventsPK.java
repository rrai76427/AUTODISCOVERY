package com.crl.nms.databases;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ashwinimehta
 */
@Embeddable
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NmsInfoEventsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "RECV_DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date recvDatetime;

    @Basic(optional = false)
    @Column(name = "EMAIL")
    private String email;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (recvDatetime != null ? recvDatetime.hashCode() : 0);
        hash += (email != null ? email.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NmsInfoEventsPK)) {
            return false;
        }
        NmsInfoEventsPK other = (NmsInfoEventsPK) object;
        if ((this.recvDatetime == null && other.recvDatetime != null) || (this.recvDatetime != null && !this.recvDatetime.equals(other.recvDatetime))) {
            return false;
        }
        if ((this.email == null && other.email != null) || (this.email != null && !this.email.equals(other.email))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "shm_bo.NmsInfoEventsPK[ recvDatetime=" + recvDatetime + ", username=" + email + " ]";
    }

}
