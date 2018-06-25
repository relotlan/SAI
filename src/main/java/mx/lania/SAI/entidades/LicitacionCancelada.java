/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.lania.SAI.entidades;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lania
 */
@Entity
@Table(name = "licitaciones_canceladas")
@XmlRootElement

public class LicitacionCancelada implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_lc")
    private Integer idLc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "descripcion")
    private String descripcion;
    @JoinColumn(name = "id_licitacion", referencedColumnName = "id_licitacion")
    @ManyToOne(optional = false)
    private Licitacion idLicitacion;

    public LicitacionCancelada() {
    }

    public LicitacionCancelada(Integer idLc) {
        this.idLc = idLc;
    }

    public LicitacionCancelada(Integer idLc, String descripcion) {
        this.idLc = idLc;
        this.descripcion = descripcion;
    }

    public Integer getIdLc() {
        return idLc;
    }

    public void setIdLc(Integer idLc) {
        this.idLc = idLc;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        hash += (idLc != null ? idLc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LicitacionCancelada)) {
            return false;
        }
        LicitacionCancelada other = (LicitacionCancelada) object;
        if ((this.idLc == null && other.idLc != null) || (this.idLc != null && !this.idLc.equals(other.idLc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.lania.SAI.entidades.LicitacionCancelada[ idLc=" + idLc + " ]";
    }
    
}
