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
@Table(name = "adjudicaciones")
@XmlRootElement

public class Adjudicacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_adjudicacion")
    private Integer idAdjudicacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_adj")
    @Temporal(TemporalType.DATE)
    private Date fechaAdj;
    @Column(name = "id_consorcio")
    private Integer idConsorcio;
    @JoinColumn(name = "id_licitacion", referencedColumnName = "id_licitacion")
    @ManyToOne(optional = false)
    private Licitacion idLicitacion;
    @JoinColumn(name = "id_proveedor", referencedColumnName = "id_proveedor")
    @ManyToOne
    private Proveedor idProveedor;

    public Adjudicacion() {
    }

    public Adjudicacion(Integer idAdjudicacion) {
        this.idAdjudicacion = idAdjudicacion;
    }

    public Adjudicacion(Integer idAdjudicacion, Date fechaAdj) {
        this.idAdjudicacion = idAdjudicacion;
        this.fechaAdj = fechaAdj;
    }

    public Integer getIdAdjudicacion() {
        return idAdjudicacion;
    }

    public void setIdAdjudicacion(Integer idAdjudicacion) {
        this.idAdjudicacion = idAdjudicacion;
    }

    public Date getFechaAdj() {
        return fechaAdj;
    }

    public void setFechaAdj(Date fechaAdj) {
        this.fechaAdj = fechaAdj;
    }

    public Integer getIdConsorcio() {
        return idConsorcio;
    }

    public void setIdConsorcio(Integer idConsorcio) {
        this.idConsorcio = idConsorcio;
    }

    public Licitacion getIdLicitacion() {
        return idLicitacion;
    }

    public void setIdLicitacion(Licitacion idLicitacion) {
        this.idLicitacion = idLicitacion;
    }

    public Proveedor getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Proveedor idProveedor) {
        this.idProveedor = idProveedor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAdjudicacion != null ? idAdjudicacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Adjudicacion)) {
            return false;
        }
        Adjudicacion other = (Adjudicacion) object;
        if ((this.idAdjudicacion == null && other.idAdjudicacion != null) || (this.idAdjudicacion != null && !this.idAdjudicacion.equals(other.idAdjudicacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.lania.SAI.entidades.Adjudicacion[ idAdjudicacion=" + idAdjudicacion + " ]";
    }
    
}
