/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.lania.SAI.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lania
 */
@Entity
@Table(name = "etapalicitacion")
@XmlRootElement

public class Etapalicitacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_etapa_lic")
    private Integer idEtapaLic;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_fin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @JoinColumn(name = "id_el", referencedColumnName = "id_el")
    @ManyToOne(optional = false)
    private Etapa idEl;
    @JoinColumn(name = "id_licitacion", referencedColumnName = "id_licitacion")
    @ManyToOne(optional = false)
    private Licitacion idLicitacion;

    public Etapalicitacion() {
    }

    public Etapalicitacion(Integer idEtapaLic) {
        this.idEtapaLic = idEtapaLic;
    }

    public Etapalicitacion(Integer idEtapaLic, Date fechaFin, Date fechaInicio) {
        this.idEtapaLic = idEtapaLic;
        this.fechaFin = fechaFin;
        this.fechaInicio = fechaInicio;
    }

    public Integer getIdEtapaLic() {
        return idEtapaLic;
    }

    public void setIdEtapaLic(Integer idEtapaLic) {
        this.idEtapaLic = idEtapaLic;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Etapa getIdEl() {
        return idEl;
    }

    public void setIdEl(Etapa idEl) {
        this.idEl = idEl;
    }

    public Licitacion getIdLicitacion() {
        return idLicitacion;
    }

    public void setIdLicitacion(Licitacion idLicitacion) {
        this.idLicitacion = idLicitacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEtapaLic != null ? idEtapaLic.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etapalicitacion)) {
            return false;
        }
        Etapalicitacion other = (Etapalicitacion) object;
        if ((this.idEtapaLic == null && other.idEtapaLic != null) || (this.idEtapaLic != null && !this.idEtapaLic.equals(other.idEtapaLic))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.lania.SAI.entidades.Etapalicitacion[ idEtapaLic=" + idEtapaLic + " ]";
    }
    
}
