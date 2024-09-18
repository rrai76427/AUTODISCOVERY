package  com.crl.nms.databases;
import java.io.Serializable;

import jakarta.persistence.*;

/**
 *
 * @author ashwinimehta
 */
@Embeddable
public class VhfRadioDetailInfoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "PARAM_NAME")
    private String paramName;
    @Basic(optional = false)
    @Column(name = "NEKEY")
    private String nekey;

    public VhfRadioDetailInfoPK() {
    }

    public VhfRadioDetailInfoPK(String paramName, String nekey) {
        this.paramName = paramName;
        this.nekey = nekey;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public String getNekey() {
        return nekey;
    }

    public void setNekey(String nekey) {
        this.nekey = nekey;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paramName != null ? paramName.hashCode() : 0);
        hash += (nekey != null ? nekey.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VhfRadioDetailInfoPK)) {
            return false;
        }
        VhfRadioDetailInfoPK other = (VhfRadioDetailInfoPK) object;
        if ((this.paramName == null && other.paramName != null) || (this.paramName != null && !this.paramName.equals(other.paramName))) {
            return false;
        }
        if ((this.nekey == null && other.nekey != null) || (this.nekey != null && !this.nekey.equals(other.nekey))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "shm_bo.VhfRadioDetailInfoPK[ paramName=" + paramName + ", nekey=" + nekey + " ]";
    }

}
