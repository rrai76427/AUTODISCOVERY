package com.crl.nms.databases;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.*;

import java.io.Serializable;

/**
 * @author ashwinimehta
 */
@Entity
@Table(name = "NMS_INFO_EVENTS")
@XmlRootElement
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NmsInfoEvents implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected NmsInfoEventsPK nmsInfoEventsPK;

    @Column(name = "NEKEY")
    private String nekey;

    @Column(name = "ACTIVITY_DESC")
    private String activityDesc;

    @Column(name = "ACK_FLAG")
    private Short ackFlag;

    @Column(name = "FIRSTNAME")
    private String firstname;

    @Column(name = "LAST_NAME")
    private String lastname;

    @Override
    public int hashCode() {

        int hash = 0;
        hash += (nmsInfoEventsPK != null ? nmsInfoEventsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof NmsInfoEvents)) {
            return false;
        }
        NmsInfoEvents other = (NmsInfoEvents) object;
        if ((this.nmsInfoEventsPK == null && other.nmsInfoEventsPK != null) || (this.nmsInfoEventsPK != null && !this.nmsInfoEventsPK.equals(other.nmsInfoEventsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "shm_bo.NmsInfoEvents[ nmsInfoEventsPK=" + nmsInfoEventsPK + " ]";
    }

}
