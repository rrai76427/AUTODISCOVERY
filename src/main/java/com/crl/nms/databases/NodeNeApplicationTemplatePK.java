package  com.crl.nms.databases;
import java.io.Serializable;

import jakarta.persistence.*;

/**
 *
 * @author meenuchhindra
 */
@Embeddable
public class NodeNeApplicationTemplatePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "TEMPLATE_ID")
    private int templateId;
    @Basic(optional = false)
    @Column(name = "APP_NAME")
    private String appName;

    public NodeNeApplicationTemplatePK() {
    }

    public NodeNeApplicationTemplatePK(int templateId, String appName) {
        this.templateId = templateId;
        this.appName = appName;
    }

    public int getTemplateId() {
        return templateId;
    }

    public void setTemplateId(int templateId) {
        this.templateId = templateId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) templateId;
        hash += (appName != null ? appName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NodeNeApplicationTemplatePK)) {
            return false;
        }
        NodeNeApplicationTemplatePK other = (NodeNeApplicationTemplatePK) object;
        if (this.templateId != other.templateId) {
            return false;
        }
        if ((this.appName == null && other.appName != null) || (this.appName != null && !this.appName.equals(other.appName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.crl.nms.bo.NodeNeApplicationTemplatePK[ templateId=" + templateId + ", appName=" + appName + " ]";
    }
    
}
