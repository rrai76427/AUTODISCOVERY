package  com.crl.nms.databases;
import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author satwikanmol
 */
@Entity
@Table(name = "NMS_NE_RAM")
@XmlRootElement
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NmsNeRam implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    NmsNeRamPK nmsNeRamPK;

    @Column(name = "RAMUSAGE")
    private BigDecimal ramusage;
    @Column(name = "RAM_PERCENTUSAGE")
    private BigDecimal ramPercentusage;


/*    @Basic(optional = false)
    @Column(name = "UPDATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatetime;*/
    @JoinColumn(name = "NEKEY", referencedColumnName = "NEKEY", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private NmsNeDetail nmsNeDetail;
    @JoinColumn(name = "NODE_KEY", referencedColumnName = "NODE_KEY")
    @ManyToOne
    private NodeDefinition nodeKey;

/*    public String getNekey() {
        return nekey;
    }

    public void setNekey(String nekey) {
        this.nekey = nekey;
    }*/

    public BigDecimal getRamusage() {
        return ramusage;
    }

    public void setRamusage(BigDecimal ramusage) {
        this.ramusage = ramusage;
    }

    public BigDecimal getRamPercentusage() {
        return ramPercentusage;
    }

    public void setRamPercentusage(BigDecimal ramPercentusage) {
        this.ramPercentusage = ramPercentusage;
    }

/*    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }*/

    public NmsNeDetail getNmsNeDetail() {
        return nmsNeDetail;
    }

    public void setNmsNeDetail(NmsNeDetail nmsNeDetail) {
        this.nmsNeDetail = nmsNeDetail;
    }

    public NodeDefinition getNodeKey() {
        return nodeKey;
    }

    public void setNodeKey(NodeDefinition nodeKey) {
        this.nodeKey = nodeKey;
    }

    public NmsNeRamPK getNmsNeRamPK() {
        return nmsNeRamPK;
    }

    public void setNmsNeRamPK(NmsNeRamPK nmsNeRamPK) {
        this.nmsNeRamPK = nmsNeRamPK;
    }



    /*@Override
    public int hashCode() {
        int hash = 0;
        hash += (nekey != null ? nekey.hashCode() : 0);
        return hash;
    }*/

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NmsNeRam)) {
            return false;
        }
        NmsNeRam other = (NmsNeRam) object;
        /*if ((this.nekey == null && other.nekey != null) || (this.nekey != null && !this.nekey.equals(other.nekey))) {
            return false;
        }*/
        return true;
    }

/*    @Override
    public String toString() {
        return "shm_bo.NmsNeRam[ nekey=" + nekey + " ]";
    }*/
    
}
