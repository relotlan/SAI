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
@Table(name = "licitaciones")
@XmlRootElement

public class Licitacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_licitacion")
    private Integer idLicitacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_edo_lic")
    private int idEdoLic;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_contratacion")
    private int idContratacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "descripcion_corta")
    private String descripcionCorta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 350)
    @Column(name = "descripcion_detallada")
    private String descripcionDetallada;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "nombre_lic")
    private String nombreLic;
    @Column(name = "monto")
    private BigInteger monto;
    @JoinColumn(name = "id_ac", referencedColumnName = "id_ac")
    @ManyToOne(optional = false)
    private AgenteContratante idAc;
    @JoinColumn(name = "id_caracter", referencedColumnName = "id_caracter")
    @ManyToOne(optional = false)
    private CaracterLicitacion idCaracter;
    @JoinColumn(name = "id_ef", referencedColumnName = "id_ef")
    @ManyToOne(optional = false)
    private EntidadFederativa idEf;
    @JoinColumn(name = "id_tip_concurso", referencedColumnName = "id_tip_concurso")
    @ManyToOne
    private TipoConcurso idTipConcurso;
    @JoinColumn(name = "id_tipo_contratacion", referencedColumnName = "id_tipo_contratacion")
    @ManyToOne
    private TipoContratacion idTipoContratacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idLicitacion")
    private Collection<Etapalicitacion> etapalicitacionCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idLicitacion")
    private Collection<VisitaLici> visitaLiciCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idLicitacion")
    private Collection<Adjudicacion> adjudicacionCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idLicitacion")
    private Collection<LicitacionProveedor> licitacionProveedorCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idLicitacion")
    private Collection<LicitacionCancelada> licitacionCanceladaCollection;

    public Licitacion() {
    }

    public Licitacion(Integer idLicitacion) {
        this.idLicitacion = idLicitacion;
    }

    public Licitacion(Integer idLicitacion, int idEdoLic, int idContratacion, String descripcionCorta, String descripcionDetallada, Date fechaCreacion, String nombreLic) {
        this.idLicitacion = idLicitacion;
        this.idEdoLic = idEdoLic;
        this.idContratacion = idContratacion;
        this.descripcionCorta = descripcionCorta;
        this.descripcionDetallada = descripcionDetallada;
        this.fechaCreacion = fechaCreacion;
        this.nombreLic = nombreLic;
    }

    public Integer getIdLicitacion() {
        return idLicitacion;
    }

    public void setIdLicitacion(Integer idLicitacion) {
        this.idLicitacion = idLicitacion;
    }

    public int getIdEdoLic() {
        return idEdoLic;
    }

    public void setIdEdoLic(int idEdoLic) {
        this.idEdoLic = idEdoLic;
    }

    public int getIdContratacion() {
        return idContratacion;
    }

    public void setIdContratacion(int idContratacion) {
        this.idContratacion = idContratacion;
    }

    public String getDescripcionCorta() {
        return descripcionCorta;
    }

    public void setDescripcionCorta(String descripcionCorta) {
        this.descripcionCorta = descripcionCorta;
    }

    public String getDescripcionDetallada() {
        return descripcionDetallada;
    }

    public void setDescripcionDetallada(String descripcionDetallada) {
        this.descripcionDetallada = descripcionDetallada;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getNombreLic() {
        return nombreLic;
    }

    public void setNombreLic(String nombreLic) {
        this.nombreLic = nombreLic;
    }

    public BigInteger getMonto() {
        return monto;
    }

    public void setMonto(BigInteger monto) {
        this.monto = monto;
    }

    public AgenteContratante getIdAc() {
        return idAc;
    }

    public void setIdAc(AgenteContratante idAc) {
        this.idAc = idAc;
    }

    public CaracterLicitacion getIdCaracter() {
        return idCaracter;
    }

    public void setIdCaracter(CaracterLicitacion idCaracter) {
        this.idCaracter = idCaracter;
    }

    public EntidadFederativa getIdEf() {
        return idEf;
    }

    public void setIdEf(EntidadFederativa idEf) {
        this.idEf = idEf;
    }

    public TipoConcurso getIdTipConcurso() {
        return idTipConcurso;
    }

    public void setIdTipConcurso(TipoConcurso idTipConcurso) {
        this.idTipConcurso = idTipConcurso;
    }

    public TipoContratacion getIdTipoContratacion() {
        return idTipoContratacion;
    }

    public void setIdTipoContratacion(TipoContratacion idTipoContratacion) {
        this.idTipoContratacion = idTipoContratacion;
    }

    @XmlTransient
    public Collection<Etapalicitacion> getEtapalicitacionCollection() {
        return etapalicitacionCollection;
    }

    public void setEtapalicitacionCollection(Collection<Etapalicitacion> etapalicitacionCollection) {
        this.etapalicitacionCollection = etapalicitacionCollection;
    }

    @XmlTransient
    public Collection<VisitaLici> getVisitaLiciCollection() {
        return visitaLiciCollection;
    }

    public void setVisitaLiciCollection(Collection<VisitaLici> visitaLiciCollection) {
        this.visitaLiciCollection = visitaLiciCollection;
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

    @XmlTransient
    public Collection<LicitacionCancelada> getLicitacionCanceladaCollection() {
        return licitacionCanceladaCollection;
    }

    public void setLicitacionCanceladaCollection(Collection<LicitacionCancelada> licitacionCanceladaCollection) {
        this.licitacionCanceladaCollection = licitacionCanceladaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLicitacion != null ? idLicitacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Licitacion)) {
            return false;
        }
        Licitacion other = (Licitacion) object;
        if ((this.idLicitacion == null && other.idLicitacion != null) || (this.idLicitacion != null && !this.idLicitacion.equals(other.idLicitacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.lania.SAI.entidades.Licitacion[ idLicitacion=" + idLicitacion + " ]";
    }
    
}
