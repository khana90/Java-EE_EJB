
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ak2049l
 */
@Entity
@Table(name = "DISTANCE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Distance.findAll", query = "SELECT d FROM Distance d"),
    @NamedQuery(name = "Distance.findByDistanceid", query = "SELECT d FROM Distance d WHERE d.distanceid = :distanceid")})
public class Distance implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "DISTANCEID")
    private Integer distanceid;
    @JoinColumn(name = "STID", referencedColumnName = "STID")
    @ManyToOne
    private Station stid;

    public Distance() {
    }

    public Distance(Integer distanceid) {
        this.distanceid = distanceid;
    }

    public Integer getDistanceid() {
        return distanceid;
    }

    public void setDistanceid(Integer distanceid) {
        this.distanceid = distanceid;
    }

    public Station getStid() {
        return stid;
    }

    public void setStid(Station stid) {
        this.stid = stid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (distanceid != null ? distanceid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Distance)) {
            return false;
        }
        Distance other = (Distance) object;
        if ((this.distanceid == null && other.distanceid != null) || (this.distanceid != null && !this.distanceid.equals(other.distanceid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Distance[ distanceid=" + distanceid + " ]";
    }
    
}
