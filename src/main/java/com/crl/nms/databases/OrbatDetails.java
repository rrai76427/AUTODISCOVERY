package  com.crl.nms.databases;
import java.io.Serializable;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ashwinimehta
 */
@Entity
@Table(name = "ORBAT_DETAILS")
@XmlRootElement

public class OrbatDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NODE_ID")
    private Integer nodeId;
    @Column(name = "NODE_LEVEL")
    private Short nodeLevel;
    @Column(name = "NODE_NAME")
    private String nodeName;
    @Column(name = "LOCATION")
    private String location;
    @Column(name = "LOC_CODE")
    private String locCode;
    @Column(name = "RESERVE1")
    private Short reserve1;
    @Column(name = "LAT")
    private String lat;
    @Column(name = "LAT_DIR")
    private String latDir;
    @Column(name = "LONGITUDE")
    private String longitude;
    @Column(name = "LONG_DIR")
    private String longDir;
    @Column(name = "PARENT_NODE_ID")
    private Integer parentNodeId;
    @Column(name = "RESERVE2")
    private Short reserve2;
    @Column(name = "NO_OF_CHILD")
    private Short noOfChild;
    @JoinColumn(name = "NODE_KEY", referencedColumnName = "NODE_KEY")
    @ManyToOne
    private NodeDefinition nodeKey;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "orbatDetails")
    private NodeHealth nodeHealth;

    public OrbatDetails() {
    }

    public OrbatDetails(Integer nodeId) {
        this.nodeId = nodeId;
    }

    public Integer getNodeId() {
        return nodeId;
    }

    public void setNodeId(Integer nodeId) {
        this.nodeId = nodeId;
    }

    public Short getNodeLevel() {
        return nodeLevel;
    }

    public void setNodeLevel(Short nodeLevel) {
        this.nodeLevel = nodeLevel;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocCode() {
        return locCode;
    }

    public void setLocCode(String locCode) {
        this.locCode = locCode;
    }

    public Short getReserve1() {
        return reserve1;
    }

    public void setReserve1(Short reserve1) {
        this.reserve1 = reserve1;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLatDir() {
        return latDir;
    }

    public void setLatDir(String latDir) {
        this.latDir = latDir;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLongDir() {
        return longDir;
    }

    public void setLongDir(String longDir) {
        this.longDir = longDir;
    }

    public Integer getParentNodeId() {
        return parentNodeId;
    }

    public void setParentNodeId(Integer parentNodeId) {
        this.parentNodeId = parentNodeId;
    }

    public Short getReserve2() {
        return reserve2;
    }

    public void setReserve2(Short reserve2) {
        this.reserve2 = reserve2;
    }

    public Short getNoOfChild() {
        return noOfChild;
    }

    public void setNoOfChild(Short noOfChild) {
        this.noOfChild = noOfChild;
    }

    public NodeDefinition getNodeKey() {
        return nodeKey;
    }

    public void setNodeKey(NodeDefinition nodeKey) {
        this.nodeKey = nodeKey;
    }

    public NodeHealth getNodeHealth() {
        return nodeHealth;
    }

    public void setNodeHealth(NodeHealth nodeHealth) {
        this.nodeHealth = nodeHealth;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nodeId != null ? nodeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrbatDetails)) {
            return false;
        }
        OrbatDetails other = (OrbatDetails) object;
        if ((this.nodeId == null && other.nodeId != null) || (this.nodeId != null && !this.nodeId.equals(other.nodeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "shm_bo.OrbatDetails[ nodeId=" + nodeId + " ]";
    }
    
}
