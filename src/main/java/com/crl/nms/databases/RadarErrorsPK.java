package  com.crl.nms.databases;
import java.io.Serializable;

import jakarta.persistence.*;

/**
 *
 * @author meenuchhindra
 */
@Embeddable
public class RadarErrorsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "NEKEY")
    private String nekey;
    @Basic(optional = false)
    @Column(name = "BITNO")
    private short bitno;

    public RadarErrorsPK() {
    }

    public RadarErrorsPK(String nekey, short bitno) {
        this.nekey = nekey;
        this.bitno = bitno;
    }

    public String getNekey() {
        return nekey;
    }

    public void setNekey(String nekey) {
        this.nekey = nekey;
    }

    public short getBitno() {
        return bitno;
    }

    public void setBitno(short bitno) {
        this.bitno = bitno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nekey != null ? nekey.hashCode() : 0);
        hash += (int) bitno;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RadarErrorsPK)) {
            return false;
        }
        RadarErrorsPK other = (RadarErrorsPK) object;
        if ((this.nekey == null && other.nekey != null) || (this.nekey != null && !this.nekey.equals(other.nekey))) {
            return false;
        }
        if (this.bitno != other.bitno) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.nms.crl.bo.RadarErrorsPK[ nekey=" + nekey + ", bitno=" + bitno + " ]";
    }

}
