/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.lania.SAI.entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
 * @author lania
 */
@Entity
@Table(name = "tipos_propuesta")
@XmlRootElement

public class TipoPropuesta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tp")
    private Integer idTp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTp")
    private Collection<Propuesta> propuestaCollection;

    public TipoPropuesta() {
    }

    public TipoPropuesta(Integer idTp) {
        this.idTp = idTp;
    }

    public TipoPropuesta(Integer idTp, String descripcion) {
        this.idTp = idTp;
        this.descripcion = descripcion;
    }

    public Integer getIdTp() {
        return idTp;
    }

    public void setIdTp(Integer idTp) {
        this.idTp = idTp;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public Collection<Propuesta> getPropuestaCollection() {
        return propuestaCollection;
    }

    public void setPropuestaCollection(Collection<Propuesta> propuestaCollection) {
        this.propuestaCollection = propuestaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTp != null ? idTp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoPropuesta)) {
            return false;
        }
        TipoPropuesta other = (TipoPropuesta) object;
        if ((this.idTp == null && other.idTp != null) || (this.idTp != null && !this.idTp.equals(other.idTp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.lania.SAI.entidades.TipoPropuesta[ idTp=" + idTp + " ]";
    }
    
}
