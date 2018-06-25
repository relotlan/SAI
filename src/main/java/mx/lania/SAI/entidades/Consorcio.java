/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.lania.SAI.entidades;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author lania
 */
@Entity
@Table(name = "consorcios")
@XmlRootElement
public class Consorcio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_consorcio")
    private Integer idConsorcio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "nombre_prov")
    private String nombreProv;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idConsorcio")
    private Collection<ConsorcioProv> consorcioProvCollection;
    @OneToMany(mappedBy = "idConsorcio")
    private Collection<LicitacionProveedor> licitacionProveedorCollection;

    public Consorcio() {
    }

    public Consorcio(Integer idConsorcio) {
        this.idConsorcio = idConsorcio;
    }

    public Consorcio(Integer idConsorcio, String descripcion, Date fechaCreacion, String nombreProv) {
        this.idConsorcio = idConsorcio;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.nombreProv = nombreProv;
    }

    public Integer getIdConsorcio() {
        return idConsorcio;
    }

    public void setIdConsorcio(Integer idConsorcio) {
        this.idConsorcio = idConsorcio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getNombreProv() {
        return nombreProv;
    }

    public void setNombreProv(String nombreProv) {
        this.nombreProv = nombreProv;
    }

    @XmlTransient
    public Collection<ConsorcioProv> getConsorcioProvCollection() {
        return consorcioProvCollection;
    }

    public void setConsorcioProvCollection(Collection<ConsorcioProv> consorcioProvCollection) {
        this.consorcioProvCollection = consorcioProvCollection;
    }

    @XmlTransient
    public Collection<LicitacionProveedor> getLicitacionProveedorCollection() {
        return licitacionProveedorCollection;
    }

    public void setLicitacionProveedorCollection(Collection<LicitacionProveedor> licitacionProveedorCollection) {
        this.licitacionProveedorCollection = licitacionProveedorCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idConsorcio != null ? idConsorcio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Consorcio)) {
            return false;
        }
        Consorcio other = (Consorcio) object;
        if ((this.idConsorcio == null && other.idConsorcio != null) || (this.idConsorcio != null && !this.idConsorcio.equals(other.idConsorcio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.lania.SAI.entidades.Consorcio[ idConsorcio=" + idConsorcio + " ]";
    }
    
}
