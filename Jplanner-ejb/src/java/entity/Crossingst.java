
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "CROSSINGST")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Crossingst.findAll", query = "SELECT c FROM Crossingst c"),
    @NamedQuery(name = "Crossingst.findByIdx", query = "SELECT c FROM Crossingst c WHERE c.idx = :idx"),
    @NamedQuery(name = "Crossingst.findByLineid", query = "SELECT c FROM Crossingst c WHERE c.lineid = :lineid"),
    @NamedQuery(name = "Crossingst.findByStationid", query = "SELECT c FROM Crossingst c WHERE c.stationid = :stationid")})
public class Crossingst implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDX")
    private Integer idx;
    @Column(name = "LINEID")
    private Integer lineid;
    @Column(name = "STATIONID")
    private Integer stationid;

    public Crossingst() {
    }

    public Crossingst(Integer idx) {
        this.idx = idx;
    }

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public Integer getLineid() {
        return lineid;
    }

    public void setLineid(Integer lineid) {
        this.lineid = lineid;
    }

    public Integer getStationid() {
        return stationid;
    }

    public void setStationid(Integer stationid) {
        this.stationid = stationid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idx != null ? idx.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Crossingst)) {
            return false;
        }
        Crossingst other = (Crossingst) object;
        if ((this.idx == null && other.idx != null) || (this.idx != null && !this.idx.equals(other.idx))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Crossingst[ idx=" + idx + " ]";
    }
    
}
