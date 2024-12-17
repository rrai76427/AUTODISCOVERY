package com.crl.nms.databases;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author meenuchhindra
 */
@Entity
@Table(name = "NE_CONNECTIVITY")
@XmlRootElement
@Data
@Getter
@Setter
@AllArgsConstructor
public class NeConnectivity implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected NeConnectivityPK neConnectivityPK;

    @Column(name = "SRC_NODEID")
    private String srcNodeid;

    @Column(name = "SRC_NEIP")
    private String srcNeip;

    @Column(name = "SRC_PORT_STATUS")
    private Short srcPortStatus;

    @Column(name = "DEST_NODEID")
    private String destNodeid;

    @Column(name = "DEST_NEIP")
    private String destNeip;

    @Column(name = "DEST_PORT_STATUS")
    private Short destPortStatus;

    @Column(name = "LINKID")
    private Long linkid;

    @Column(name = "LINKTYPE")
    private String linktype;

    @Column(name = "LINKSTATUS")
    private Short linkstatus;

    @Column(name = "PSRC_IP")
    private String psrcIp;

    @Column(name = "PDEST_IP")
    private String pdestIp;

    @Column(name = "UPDATED_ON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedOn;

    @Column(name = "UPDATED_BY")
    private String updatedBy;

    public NeConnectivity() {
    }

    public NeConnectivityPK getNeConnectivityPK() {
        return neConnectivityPK;
    }

    public void setNeConnectivityPK(NeConnectivityPK neConnectivityPK) {
        this.neConnectivityPK = neConnectivityPK;
    }

    public String getSrcNodeid() {
        return srcNodeid;
    }

    public void setSrcNodeid(String srcNodeid) {
        this.srcNodeid = srcNodeid;
    }

    public String getSrcNeip() {
        return srcNeip;
    }

    public void setSrcNeip(String srcNeip) {
        this.srcNeip = srcNeip;
    }

    public Short getSrcPortStatus() {
        return srcPortStatus;
    }

    public void setSrcPortStatus(Short srcPortStatus) {
        this.srcPortStatus = srcPortStatus;
    }

    public String getDestNodeid() {
        return destNodeid;
    }

    public void setDestNodeid(String destNodeid) {
        this.destNodeid = destNodeid;
    }

    public String getDestNeip() {
        return destNeip;
    }

    public void setDestNeip(String destNeip) {
        this.destNeip = destNeip;
    }

    public Short getDestPortStatus() {
        return destPortStatus;
    }

    public void setDestPortStatus(Short destPortStatus) {
        this.destPortStatus = destPortStatus;
    }

    public Long getLinkid() {
        return linkid;
    }

    public void setLinkid(Long linkid) {
        this.linkid = linkid;
    }

    public String getLinktype() {
        return linktype;
    }

    public void setLinktype(String linktype) {
        this.linktype = linktype;
    }

    public Short getLinkstatus() {
        return linkstatus;
    }

    public void setLinkstatus(Short linkstatus) {
        this.linkstatus = linkstatus;
    }

    public String getPsrcIp() {
        return psrcIp;
    }

    public void setPsrcIp(String psrcIp) {
        this.psrcIp = psrcIp;
    }

    public String getPdestIp() {
        return pdestIp;
    }

    public void setPdestIp(String pdestIp) {
        this.pdestIp = pdestIp;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
}
