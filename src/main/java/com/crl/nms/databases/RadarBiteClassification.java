package  com.crl.nms.databases;
import java.io.Serializable;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author meenuchhindra
 */
@Entity
@Table(name = "RADAR_BITE_CLASSIFICATION")
@XmlRootElement

public class RadarBiteClassification implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BITE_ID")
    private Short biteId;
    @Column(name = "BITE_DESC")
    private String biteDesc;

    public RadarBiteClassification() {
    }

    public RadarBiteClassification(Short biteId) {
        this.biteId = biteId;
    }

    public Short getBiteId() {
        return biteId;
    }

    public void setBiteId(Short biteId) {
        this.biteId = biteId;
    }

    public String getBiteDesc() {
        return biteDesc;
    }

    public void setBiteDesc(String biteDesc) {
        this.biteDesc = biteDesc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (biteId != null ? biteId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RadarBiteClassification)) {
            return false;
        }
        RadarBiteClassification other = (RadarBiteClassification) object;
        if ((this.biteId == null && other.biteId != null) || (this.biteId != null && !this.biteId.equals(other.biteId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.nms.crl.bo.RadarBiteClassification[ biteId=" + biteId + " ]";
    }
    
}
