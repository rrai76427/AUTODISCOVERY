package  com.crl.nms.databases;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 *
 * @author meenuchhindra
 */
@Embeddable
public class NeConnectivityPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "SRC_NEKEY")
    private String srcNekey;

    @Basic(optional = false)
    @Column(name = "SRC_PORT")
    private long srcPort;

    @Basic(optional = false)
    @Column(name = "DEST_NEKEY")
    private String destNekey;

    @Basic(optional = false)
    @Column(name = "DEST_PORT")
    private long destPort;

    public NeConnectivityPK() {
    }

    public NeConnectivityPK(String srcNekey, long srcPort, String destNekey, long destPort) {
        this.srcNekey = srcNekey;
        this.srcPort = srcPort;
        this.destNekey = destNekey;
        this.destPort = destPort;
    }

    public String getSrcNekey() {
        return srcNekey;
    }

    public void setSrcNekey(String srcNekey) {
        this.srcNekey = srcNekey;
    }

    public long getSrcPort() {
        return srcPort;
    }

    public void setSrcPort(long srcPort) {
        this.srcPort = srcPort;
    }

    public String getDestNekey() {
        return destNekey;
    }

    public void setDestNekey(String destNekey) {
        this.destNekey = destNekey;
    }

    public long getDestPort() {
        return destPort;
    }

    public void setDestPort(long destPort) {
        this.destPort = destPort;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (srcNekey != null ? srcNekey.hashCode() : 0);
        hash += (int) srcPort;
        hash += (destNekey != null ? destNekey.hashCode() : 0);
        hash += (int) destPort;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NeConnectivityPK)) {
            return false;
        }
        NeConnectivityPK other = (NeConnectivityPK) object;
        if ((this.srcNekey == null && other.srcNekey != null) || (this.srcNekey != null && !this.srcNekey.equals(other.srcNekey))) {
            return false;
        }
        if (this.srcPort != other.srcPort) {
            return false;
        }
        if ((this.destNekey == null && other.destNekey != null) || (this.destNekey != null && !this.destNekey.equals(other.destNekey))) {
            return false;
        }
        if (this.destPort != other.destPort) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.crl.nms.bo.NeConnectivityPK[ srcNekey=" + srcNekey + ", srcPort=" + srcPort + ", destNekey=" + destNekey + ", destPort=" + destPort + " ]";
    }

}
