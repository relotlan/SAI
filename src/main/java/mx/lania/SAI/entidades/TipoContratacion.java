/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.lania.SAI.entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
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
@Table(name = "tipo_contratacion")
@XmlRootElement

public class TipoContratacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipo_contratacion")
    private Integer idTipoContratacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 2)
    @Column(name = "clave")
    private String clave;
    @OneToMany(mappedBy = "idTipoContratacion")
    private Collection<Licitacion> licitacionCollection;

    public TipoContratacion() {
    }

    public TipoContratacion(Integer idTipoContratacion) {
        this.idTipoContratacion = idTipoContratacion;
    }

    public TipoContratacion(Integer idTipoContratacion, String descripcion) {
        this.idTipoContratacion = idTipoContratacion;
        this.descripcion = descripcion;
    }

    public Integer getIdTipoContratacion() {
        return idTipoContratacion;
    }

    public void setIdTipoContratacion(Integer idTipoContratacion) {
        this.idTipoContratacion = idTipoContratacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @XmlTransient
    public Collection<Licitacion> getLicitacionCollection() {
        return licitacionCollection;
    }

    public void setLicitacionCollection(Collection<Licitacion> licitacionCollection) {
        this.licitacionCollection = licitacionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoContratacion != null ? idTipoContratacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoContratacion)) {
            return false;
        }
        TipoContratacion other = (TipoContratacion) object;
        if ((this.idTipoContratacion == null && other.idTipoContratacion != null) || (this.idTipoContratacion != null && !this.idTipoContratacion.equals(other.idTipoContratacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.lania.SAI.entidades.TipoContratacion[ idTipoContratacion=" + idTipoContratacion + " ]";
    }
    
}
