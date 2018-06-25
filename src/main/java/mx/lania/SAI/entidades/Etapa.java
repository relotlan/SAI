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
@Table(name = "etapas")
@XmlRootElement

public class Etapa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_el")
    private Integer idEl;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEl")
    private Collection<Etapalicitacion> etapalicitacionCollection;

    public Etapa() {
    }

    public Etapa(Integer idEl) {
        this.idEl = idEl;
    }

    public Etapa(Integer idEl, String descripcion) {
        this.idEl = idEl;
        this.descripcion = descripcion;
    }

    public Integer getIdEl() {
        return idEl;
    }

    public void setIdEl(Integer idEl) {
        this.idEl = idEl;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public Collection<Etapalicitacion> getEtapalicitacionCollection() {
        return etapalicitacionCollection;
    }

    public void setEtapalicitacionCollection(Collection<Etapalicitacion> etapalicitacionCollection) {
        this.etapalicitacionCollection = etapalicitacionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEl != null ? idEl.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etapa)) {
            return false;
        }
        Etapa other = (Etapa) object;
        if ((this.idEl == null && other.idEl != null) || (this.idEl != null && !this.idEl.equals(other.idEl))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.lania.SAI.entidades.Etapa[ idEl=" + idEl + " ]";
    }
    
}
