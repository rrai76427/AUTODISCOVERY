package  com.crl.nms.databases;
import java.io.Serializable;

import jakarta.persistence.*;

/**
 *
 * @author Administrator
 */
@Embeddable
public class NmsNeSnmpConfigPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "NEKEY")
    private String nekey;
    @Basic(optional = false)
    @Column(name = "PROFILE_ID")
    private short profileId;

    public NmsNeSnmpConfigPK() {
    }

    public NmsNeSnmpConfigPK(String nekey, short profileId) {
        this.nekey = nekey;
        this.profileId = profileId;
    }

    public String getNekey() {
        return nekey;
    }

    public void setNekey(String nekey) {
        this.nekey = nekey;
    }

    public short getProfileId() {
        return profileId;
    }

    public void setProfileId(short profileId) {
        this.profileId = profileId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nekey != null ? nekey.hashCode() : 0);
        hash += (int) profileId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NmsNeSnmpConfigPK)) {
            return false;
        }
        NmsNeSnmpConfigPK other = (NmsNeSnmpConfigPK) object;
        if ((this.nekey == null && other.nekey != null) || (this.nekey != null && !this.nekey.equals(other.nekey))) {
            return false;
        }
        if (this.profileId != other.profileId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.crl.nms.bo.NmsNeSnmpConfigPK[ nekey=" + nekey + ", profileId=" + profileId + " ]";
    }
    
}
