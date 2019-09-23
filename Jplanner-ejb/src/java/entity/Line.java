/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ak2049l
 */
@Entity
@Table(name = "LINE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Line.findAll", query = "SELECT l FROM Line l"),
    @NamedQuery(name = "Line.findByLineid", query = "SELECT l FROM Line l WHERE l.lineid = :lineid"),
    @NamedQuery(name = "Line.findByLinename", query = "SELECT l FROM Line l WHERE l.linename = :linename"),
    @NamedQuery(name = "Line.findByStartpoint", query = "SELECT l FROM Line l WHERE l.startpoint = :startpoint"),
    @NamedQuery(name = "Line.findByEndpoint", query = "SELECT l FROM Line l WHERE l.endpoint = :endpoint")})
public class Line implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "LINEID")
    private Integer lineid;
    @Size(max = 66)
    @Column(name = "LINENAME")
    private String linename;
    @Size(max = 66)
    @Column(name = "STARTPOINT")
    private String startpoint;
    @Size(max = 55)
    @Column(name = "ENDPOINT")
    private String endpoint;

    public Line() {
    }

    public Line(Integer lineid) {
        this.lineid = lineid;
    }

    public Integer getLineid() {
        return lineid;
    }

    public void setLineid(Integer lineid) {
        this.lineid = lineid;
    }

    public String getLinename() {
        return linename;
    }

    public void setLinename(String linename) {
        this.linename = linename;
    }

    public String getStartpoint() {
        return startpoint;
    }

    public void setStartpoint(String startpoint) {
        this.startpoint = startpoint;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lineid != null ? lineid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Line)) {
            return false;
        }
        Line other = (Line) object;
        if ((this.lineid == null && other.lineid != null) || (this.lineid != null && !this.lineid.equals(other.lineid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Line[ lineid=" + lineid + " ]";
    }
    
}
