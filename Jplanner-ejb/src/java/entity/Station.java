/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ak2049l
 */
@Entity
@Table(name = "STATION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Station.findAll", query = "SELECT s FROM Station s"),
    @NamedQuery(name = "Station.findByStid", query = "SELECT s FROM Station s WHERE s.stid = :stid"),
    @NamedQuery(name = "Station.findByStname", query = "SELECT s FROM Station s WHERE s.stname = :stname"),
    @NamedQuery(name = "Station.findByStatus", query = "SELECT s FROM Station s WHERE s.status = :status")})
public class Station implements Serializable {

    @OneToMany(mappedBy = "stid")
    private List<Distance> distanceList;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "STID")
    private Integer stid;
    @Size(max = 55)
    @Column(name = "STNAME")
    private String stname;
    @Size(max = 55)
    @Column(name = "STATUS")
    private String status;

    public Station() {
    }

    public Station(Integer stid) {
        this.stid = stid;
    }

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    public String getStname() {
        return stname;
    }

    public void setStname(String stname) {
        this.stname = stname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stid != null ? stid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Station)) {
            return false;
        }
        Station other = (Station) object;
        if ((this.stid == null && other.stid != null) || (this.stid != null && !this.stid.equals(other.stid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Station[ stid=" + stid + " ]";
    }

    @XmlTransient
    public List<Distance> getDistanceList() {
        return distanceList;
    }

    public void setDistanceList(List<Distance> distanceList) {
        this.distanceList = distanceList;
    }
    
}
