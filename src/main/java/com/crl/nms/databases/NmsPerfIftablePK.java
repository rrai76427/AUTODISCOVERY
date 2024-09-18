package  com.crl.nms.databases;
import java.io.Serializable;

import jakarta.persistence.*;

/**
 *
 * @author ashwinimehta
 */
@Embeddable
public class NmsPerfIftablePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "NEKEY")
    private String nekey;
    @Basic(optional = false)
    @Column(name = "IFINDEX")
    private int ifindex;

    public NmsPerfIftablePK() {
    }

    public NmsPerfIftablePK(String nekey, int ifindex) {
        this.nekey = nekey;
        this.ifindex = ifindex;
    }

    public String getNekey() {
        return nekey;
    }

    public void setNekey(String nekey) {
        this.nekey = nekey;
    }

    public int getIfindex() {
        return ifindex;
    }

    public void setIfindex(int ifindex) {
        this.ifindex = ifindex;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nekey != null ? nekey.hashCode() : 0);
        hash += (int) ifindex;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NmsPerfIftablePK)) {
            return false;
        }
        NmsPerfIftablePK other = (NmsPerfIftablePK) object;
        if ((this.nekey == null && other.nekey != null) || (this.nekey != null && !this.nekey.equals(other.nekey))) {
            return false;
        }
        if (this.ifindex != other.ifindex) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "shm_bo.NmsPerfIftablePK[ nekey=" + nekey + ", ifindex=" + ifindex + " ]";
    }
    
}
