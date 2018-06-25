/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.lania.SAI.entidades;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
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
@Table(name = "proveedores")
@XmlRootElement

public class Proveedor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_proveedor")
    private Integer idProveedor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nom_proveedor")
    private String nomProveedor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "empresa")
    private String empresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "razon_social")
    private String razonSocial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "rfc")
    private String rfc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "telefono")
    private BigInteger telefono;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProveedor")
    private Collection<ConsorcioProv> consorcioProvCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProveedor")
    private Collection<Propuesta> propuestaCollection;
    @OneToMany(mappedBy = "idProveedor")
    private Collection<Adjudicacion> adjudicacionCollection;
    @OneToMany(mappedBy = "idProveedor")
    private Collection<LicitacionProveedor> licitacionProveedorCollection;
    @JoinColumn(name = "id_direccion", referencedColumnName = "id_direccion")
    @ManyToOne(optional = false)
    private Direccion idDireccion;
    @JoinColumn(name = "id_ef", referencedColumnName = "id_ef")
    @ManyToOne(optional = false)
    private EntidadFederativa idEf;
    @JoinColumn(name = "id_ge", referencedColumnName = "id_ge")
    @ManyToOne(optional = false)
    private GiroEconomico idGe;

    public Proveedor() {
    }

    public Proveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    public Proveedor(Integer idProveedor, String nomProveedor, Date fechaRegistro, String empresa, String razonSocial, String rfc, BigInteger telefono) {
        this.idProveedor = idProveedor;
        this.nomProveedor = nomProveedor;
        this.fechaRegistro = fechaRegistro;
        this.empresa = empresa;
        this.razonSocial = razonSocial;
        this.rfc = rfc;
        this.telefono = telefono;
    }

    public Integer getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNomProveedor() {
        return nomProveedor;
    }

    public void setNomProveedor(String nomProveedor) {
        this.nomProveedor = nomProveedor;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public BigInteger getTelefono() {
        return telefono;
    }

    public void setTelefono(BigInteger telefono) {
        this.telefono = telefono;
    }

    @XmlTransient
    public Collection<ConsorcioProv> getConsorcioProvCollection() {
        return consorcioProvCollection;
    }

    public void setConsorcioProvCollection(Collection<ConsorcioProv> consorcioProvCollection) {
        this.consorcioProvCollection = consorcioProvCollection;
    }

    @XmlTransient
    public Collection<Propuesta> getPropuestaCollection() {
        return propuestaCollection;
    }

    public void setPropuestaCollection(Collection<Propuesta> propuestaCollection) {
        this.propuestaCollection = propuestaCollection;
    }

    @XmlTransient
    public Collection<Adjudicacion> getAdjudicacionCollection() {
        return adjudicacionCollection;
    }

    public void setAdjudicacionCollection(Collection<Adjudicacion> adjudicacionCollection) {
        this.adjudicacionCollection = adjudicacionCollection;
    }

    @XmlTransient
    public Collection<LicitacionProveedor> getLicitacionProveedorCollection() {
        return licitacionProveedorCollection;
    }

    public void setLicitacionProveedorCollection(Collection<LicitacionProveedor> licitacionProveedorCollection) {
        this.licitacionProveedorCollection = licitacionProveedorCollection;
    }

    public Direccion getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Direccion idDireccion) {
        this.idDireccion = idDireccion;
    }

    public EntidadFederativa getIdEf() {
        return idEf;
    }

    public void setIdEf(EntidadFederativa idEf) {
        this.idEf = idEf;
    }

    public GiroEconomico getIdGe() {
        return idGe;
    }

    public void setIdGe(GiroEconomico idGe) {
        this.idGe = idGe;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProveedor != null ? idProveedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proveedor)) {
            return false;
        }
        Proveedor other = (Proveedor) object;
        if ((this.idProveedor == null && other.idProveedor != null) || (this.idProveedor != null && !this.idProveedor.equals(other.idProveedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.lania.SAI.entidades.Proveedor[ idProveedor=" + idProveedor + " ]";
    }
    
}
