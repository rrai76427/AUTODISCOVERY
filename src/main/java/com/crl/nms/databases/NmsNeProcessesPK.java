package  com.crl.nms.databases;
import java.io.Serializable;

import jakarta.persistence.*;

/**
 *
 * @author ashwinimehta
 */
@Embeddable
public class NmsNeProcessesPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "NEKEY")
    private String nekey="";
    @Basic(optional = false)
    @Column(name = "PROCNAME")
    private String procname="";

    public NmsNeProcessesPK() {
    }

    public NmsNeProcessesPK(String nekey, String procname) {
        this.nekey = nekey;
        this.procname = procname;
    }

    public String getNekey() {
        return nekey;
    }

    public void setNekey(String nekey) {
        this.nekey = nekey;
    }

    public String getProcname() {
        return procname;
    }

    public void setProcname(String procname) {
        this.procname = procname;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nekey != null ? nekey.hashCode() : 0);
        hash += (procname != null ? procname.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NmsNeProcessesPK)) {
            return false;
        }
        NmsNeProcessesPK other = (NmsNeProcessesPK) object;
        if ((this.nekey == null && other.nekey != null) || (this.nekey != null && !this.nekey.equals(other.nekey))) {
            return false;
        }
        if ((this.procname == null && other.procname != null) || (this.procname != null && !this.procname.equals(other.procname))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "shm_bo.NmsNeProcessesPK[ nekey=" + nekey + ", procname=" + procname + " ]";
    }
    
}
