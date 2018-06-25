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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lania
 */
@Entity
@Table(name = "visita_lici")
@XmlRootElement

public class VisitaLici implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_visita")
    private Integer idVisita;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_visita")
    @Temporal(TemporalType.DATE)
    private Date fechaVisita;
    @Size(max = 350)
    @Column(name = "comentario")
    private String comentario;
    @JoinColumn(name = "id_direccion", referencedColumnName = "id_direccion")
    @ManyToOne(optional = false)
    private Direccion idDireccion;
    @JoinColumn(name = "id_licitacion", referencedColumnName = "id_licitacion")
    @ManyToOne(optional = false)
    private Licitacion idLicitacion;

    public VisitaLici() {
    }

    public VisitaLici(Integer idVisita) {
        this.idVisita = idVisita;
    }

    public VisitaLici(Integer idVisita, Date fechaVisita) {
        this.idVisita = idVisita;
        this.fechaVisita = fechaVisita;
    }

    public Integer getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(Integer idVisita) {
        this.idVisita = idVisita;
    }

    public Date getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(Date fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Direccion getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Direccion idDireccion) {
        this.idDireccion = idDireccion;
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
        hash += (idVisita != null ? idVisita.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VisitaLici)) {
            return false;
        }
        VisitaLici other = (VisitaLici) object;
        if ((this.idVisita == null && other.idVisita != null) || (this.idVisita != null && !this.idVisita.equals(other.idVisita))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.lania.SAI.entidades.VisitaLici[ idVisita=" + idVisita + " ]";
    }
    
}
