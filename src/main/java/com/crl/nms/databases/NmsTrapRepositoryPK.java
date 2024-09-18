package  com.crl.nms.databases;
import java.io.Serializable;

import jakarta.persistence.*;

/**
 *
 * @author ashwinimehta
 */
@Embeddable
public class NmsTrapRepositoryPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "OID")
    private String oid;
    @Basic(optional = false)
    @Column(name = "GENERIC_VALUE")
    private short genericValue;
    @Basic(optional = false)
    @Column(name = "SPECIFIC_VALUE")
    private long specificValue;

    public NmsTrapRepositoryPK() {
    }

    public NmsTrapRepositoryPK(String oid, short genericValue, long specificValue) {
        this.oid = oid;
        this.genericValue = genericValue;
        this.specificValue = specificValue;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public short getGenericValue() {
        return genericValue;
    }

    public void setGenericValue(short genericValue) {
        this.genericValue = genericValue;
    }

    public long getSpecificValue() {
        return specificValue;
    }

    public void setSpecificValue(long specificValue) {
        this.specificValue = specificValue;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (oid != null ? oid.hashCode() : 0);
        hash += (int) genericValue;
        hash += (int) specificValue;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NmsTrapRepositoryPK)) {
            return false;
        }
        NmsTrapRepositoryPK other = (NmsTrapRepositoryPK) object;
        if ((this.oid == null && other.oid != null) || (this.oid != null && !this.oid.equals(other.oid))) {
            return false;
        }
        if (this.genericValue != other.genericValue) {
            return false;
        }
        if (this.specificValue != other.specificValue) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "shm_bo.NmsTrapRepositoryPK[ oid=" + oid + ", genericValue=" + genericValue + ", specificValue=" + specificValue + " ]";
    }
    
}
