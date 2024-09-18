package  com.crl.nms.databases;
import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ashwinimehta
 */
@Entity
@Table(name = "NMS_PERF_IFTABLE")
@XmlRootElement

public class NmsPerfIftable implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected NmsPerfIftablePK nmsPerfIftablePK;
    @Column(name = "IFDESCR")
    private String ifdescr;
    @Column(name = "IFTYPE")
    private String iftype;
    @Column(name = "IFMTU")
    private String ifmtu;
    @Column(name = "IFSPEED")
    private String ifspeed;
    @Column(name = "IFPHYSADDRESS")
    private String ifphysaddress;
    @Column(name = "IFADMINSTATUS")
    private String ifadminstatus;
    @Column(name = "IFOPERSTATUS")
    private String ifoperstatus;
    @Column(name = "IFLASTCHANGE")
    private String iflastchange;
    @Column(name = "IFINOCTETS")
    private String ifinoctets;
    @Column(name = "IFINUCASTPKTS")
    private String ifinucastpkts;
    @Column(name = "IFINNUCASTPKTS")
    private String ifinnucastpkts;
    @Column(name = "IFINDISCARDS")
    private String ifindiscards;
    @Column(name = "IFINERRORS")
    private String ifinerrors;
    @Column(name = "IFINUNKNOWNPROTOS")
    private String ifinunknownprotos;
    @Column(name = "IFOUTOCTETS")
    private String ifoutoctets;
    @Column(name = "IFOUTUCASTPKTS")
    private String ifoutucastpkts;
    @Column(name = "IFOUTNUCASTPKTS")
    private String ifoutnucastpkts;
    @Column(name = "IFOUTDISCARDS")
    private String ifoutdiscards;
    @Column(name = "IFOUTERRORS")
    private String ifouterrors;
    @Column(name = "IFOUTQLEN")
    private String ifoutqlen;
    @Column(name = "IFSPECIFIC")
    private String ifspecific;
    @Column(name = "PORTOCCUPIED")
    private String portoccupied;
    @Column(name = "SLOTNO")
    private String slotno;
    @Column(name = "PORTNO")
    private String portno;
    @Column(name = "UPDATEDON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedon;
    @JoinColumn(name = "NEKEY", referencedColumnName = "NEKEY", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private NmsNeDetail nmsNeDetail;

    public NmsPerfIftable() {
    }

    public NmsPerfIftable(NmsPerfIftablePK nmsPerfIftablePK) {
        this.nmsPerfIftablePK = nmsPerfIftablePK;
    }

    public NmsPerfIftable(String nekey, int ifindex) {
        this.nmsPerfIftablePK = new NmsPerfIftablePK(nekey, ifindex);
    }

    public NmsPerfIftablePK getNmsPerfIftablePK() {
        return nmsPerfIftablePK;
    }

    public void setNmsPerfIftablePK(NmsPerfIftablePK nmsPerfIftablePK) {
        this.nmsPerfIftablePK = nmsPerfIftablePK;
    }

    public String getIfdescr() {
        return ifdescr;
    }

    public void setIfdescr(String ifdescr) {
        this.ifdescr = ifdescr;
    }

    public String getIftype() {
        return iftype;
    }

    public void setIftype(String iftype) {
        this.iftype = iftype;
    }

    public String getIfmtu() {
        return ifmtu;
    }

    public void setIfmtu(String ifmtu) {
        this.ifmtu = ifmtu;
    }

    public String getIfspeed() {
        return ifspeed;
    }

    public void setIfspeed(String ifspeed) {
        this.ifspeed = ifspeed;
    }

    public String getIfphysaddress() {
        return ifphysaddress;
    }

    public void setIfphysaddress(String ifphysaddress) {
        this.ifphysaddress = ifphysaddress;
    }

    public String getIfadminstatus() {
        return ifadminstatus;
    }

    public void setIfadminstatus(String ifadminstatus) {
        this.ifadminstatus = ifadminstatus;
    }

    public String getIfoperstatus() {
        return ifoperstatus;
    }

    public void setIfoperstatus(String ifoperstatus) {
        this.ifoperstatus = ifoperstatus;
    }

    public String getIflastchange() {
        return iflastchange;
    }

    public void setIflastchange(String iflastchange) {
        this.iflastchange = iflastchange;
    }

    public String getIfinoctets() {
        return ifinoctets;
    }

    public void setIfinoctets(String ifinoctets) {
        this.ifinoctets = ifinoctets;
    }

    public String getIfinucastpkts() {
        return ifinucastpkts;
    }

    public void setIfinucastpkts(String ifinucastpkts) {
        this.ifinucastpkts = ifinucastpkts;
    }

    public String getIfinnucastpkts() {
        return ifinnucastpkts;
    }

    public void setIfinnucastpkts(String ifinnucastpkts) {
        this.ifinnucastpkts = ifinnucastpkts;
    }

    public String getIfindiscards() {
        return ifindiscards;
    }

    public void setIfindiscards(String ifindiscards) {
        this.ifindiscards = ifindiscards;
    }

    public String getIfinerrors() {
        return ifinerrors;
    }

    public void setIfinerrors(String ifinerrors) {
        this.ifinerrors = ifinerrors;
    }

    public String getIfinunknownprotos() {
        return ifinunknownprotos;
    }

    public void setIfinunknownprotos(String ifinunknownprotos) {
        this.ifinunknownprotos = ifinunknownprotos;
    }

    public String getIfoutoctets() {
        return ifoutoctets;
    }

    public void setIfoutoctets(String ifoutoctets) {
        this.ifoutoctets = ifoutoctets;
    }

    public String getIfoutucastpkts() {
        return ifoutucastpkts;
    }

    public void setIfoutucastpkts(String ifoutucastpkts) {
        this.ifoutucastpkts = ifoutucastpkts;
    }

    public String getIfoutnucastpkts() {
        return ifoutnucastpkts;
    }

    public void setIfoutnucastpkts(String ifoutnucastpkts) {
        this.ifoutnucastpkts = ifoutnucastpkts;
    }

    public String getIfoutdiscards() {
        return ifoutdiscards;
    }

    public void setIfoutdiscards(String ifoutdiscards) {
        this.ifoutdiscards = ifoutdiscards;
    }

    public String getIfouterrors() {
        return ifouterrors;
    }

    public void setIfouterrors(String ifouterrors) {
        this.ifouterrors = ifouterrors;
    }

    public String getIfoutqlen() {
        return ifoutqlen;
    }

    public void setIfoutqlen(String ifoutqlen) {
        this.ifoutqlen = ifoutqlen;
    }

    public String getIfspecific() {
        return ifspecific;
    }

    public void setIfspecific(String ifspecific) {
        this.ifspecific = ifspecific;
    }

    public String getPortoccupied() {
        return portoccupied;
    }

    public void setPortoccupied(String portoccupied) {
        this.portoccupied = portoccupied;
    }

    public String getSlotno() {
        return slotno;
    }

    public void setSlotno(String slotno) {
        this.slotno = slotno;
    }

    public String getPortno() {
        return portno;
    }

    public void setPortno(String portno) {
        this.portno = portno;
    }

    public Date getUpdatedon() {
        return updatedon;
    }

    public void setUpdatedon(Date updatedon) {
        this.updatedon = updatedon;
    }

    public NmsNeDetail getNmsNeDetail() {
        return nmsNeDetail;
    }

    public void setNmsNeDetail(NmsNeDetail nmsNeDetail) {
        this.nmsNeDetail = nmsNeDetail;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nmsPerfIftablePK != null ? nmsPerfIftablePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NmsPerfIftable)) {
            return false;
        }
        NmsPerfIftable other = (NmsPerfIftable) object;
        if ((this.nmsPerfIftablePK == null && other.nmsPerfIftablePK != null) || (this.nmsPerfIftablePK != null && !this.nmsPerfIftablePK.equals(other.nmsPerfIftablePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "shm_bo.NmsPerfIftable[ nmsPerfIftablePK=" + nmsPerfIftablePK + " ]";
    }
    
}
