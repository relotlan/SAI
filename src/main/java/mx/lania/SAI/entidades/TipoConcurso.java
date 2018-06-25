/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.lania.SAI.entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
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
@Table(name = "tipo_concurso")
@XmlRootElement

public class TipoConcurso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tip_concurso")
    private Integer idTipConcurso;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 2)
    @Column(name = "clave")
    private String clave;
    @OneToMany(mappedBy = "idTipConcurso")
    private Collection<Licitacion> licitacionCollection;

    public TipoConcurso() {
    }

    public TipoConcurso(Integer idTipConcurso) {
        this.idTipConcurso = idTipConcurso;
    }

    public TipoConcurso(Integer idTipConcurso, String descripcion) {
        this.idTipConcurso = idTipConcurso;
        this.descripcion = descripcion;
    }

    public Integer getIdTipConcurso() {
        return idTipConcurso;
    }

    public void setIdTipConcurso(Integer idTipConcurso) {
        this.idTipConcurso = idTipConcurso;
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
        hash += (idTipConcurso != null ? idTipConcurso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoConcurso)) {
            return false;
        }
        TipoConcurso other = (TipoConcurso) object;
        if ((this.idTipConcurso == null && other.idTipConcurso != null) || (this.idTipConcurso != null && !this.idTipConcurso.equals(other.idTipConcurso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.lania.SAI.entidades.TipoConcurso[ idTipConcurso=" + idTipConcurso + " ]";
    }
    
}
