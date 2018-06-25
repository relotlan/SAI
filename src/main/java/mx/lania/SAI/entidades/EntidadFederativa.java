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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "entidades_federativas")
@XmlRootElement
public class EntidadFederativa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_ef")
    private Integer idEf;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEf")
    private Collection<Licitacion> licitacionCollection;
    @JoinColumn(name = "id_region", referencedColumnName = "id_region")
    @ManyToOne(optional = false)
    private Region idRegion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEf")
    private Collection<AgenteContratante> agenteContratanteCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEf")
    private Collection<Proveedor> proveedorCollection;

    public EntidadFederativa() {
    }

    public EntidadFederativa(Integer idEf) {
        this.idEf = idEf;
    }

    public EntidadFederativa(Integer idEf, String descripcion) {
        this.idEf = idEf;
        this.descripcion = descripcion;
    }

    public Integer getIdEf() {
        return idEf;
    }

    public void setIdEf(Integer idEf) {
        this.idEf = idEf;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public Collection<Licitacion> getLicitacionCollection() {
        return licitacionCollection;
    }

    public void setLicitacionCollection(Collection<Licitacion> licitacionCollection) {
        this.licitacionCollection = licitacionCollection;
    }

    public Region getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(Region idRegion) {
        this.idRegion = idRegion;
    }

    @XmlTransient
    public Collection<AgenteContratante> getAgenteContratanteCollection() {
        return agenteContratanteCollection;
    }

    public void setAgenteContratanteCollection(Collection<AgenteContratante> agenteContratanteCollection) {
        this.agenteContratanteCollection = agenteContratanteCollection;
    }

    @XmlTransient
    public Collection<Proveedor> getProveedorCollection() {
        return proveedorCollection;
    }

    public void setProveedorCollection(Collection<Proveedor> proveedorCollection) {
        this.proveedorCollection = proveedorCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEf != null ? idEf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EntidadFederativa)) {
            return false;
        }
        EntidadFederativa other = (EntidadFederativa) object;
        if ((this.idEf == null && other.idEf != null) || (this.idEf != null && !this.idEf.equals(other.idEf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.lania.SAI.entidades.EntidadFederativa[ idEf=" + idEf + " ]";
    }
    
}
