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
@Table(name = "caracter_licitacion")
@XmlRootElement

public class CaracterLicitacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_caracter")
    private Integer idCaracter;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 2)
    @Column(name = "clave")
    private String clave;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCaracter")
    private Collection<Licitacion> licitacionCollection;

    public CaracterLicitacion() {
    }

    public CaracterLicitacion(Integer idCaracter) {
        this.idCaracter = idCaracter;
    }

    public CaracterLicitacion(Integer idCaracter, String descripcion) {
        this.idCaracter = idCaracter;
        this.descripcion = descripcion;
    }

    public Integer getIdCaracter() {
        return idCaracter;
    }

    public void setIdCaracter(Integer idCaracter) {
        this.idCaracter = idCaracter;
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
        hash += (idCaracter != null ? idCaracter.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CaracterLicitacion)) {
            return false;
        }
        CaracterLicitacion other = (CaracterLicitacion) object;
        if ((this.idCaracter == null && other.idCaracter != null) || (this.idCaracter != null && !this.idCaracter.equals(other.idCaracter))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.lania.SAI.entidades.CaracterLicitacion[ idCaracter=" + idCaracter + " ]";
    }
    
}
