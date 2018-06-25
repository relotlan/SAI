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
@Table(name = "estados_licitacion")
@XmlRootElement

public class EstadoLicitacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_edo_lic")
    private Integer idEdoLic;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "descripcion")
    private String descripcion;

    public EstadoLicitacion() {
    }

    public EstadoLicitacion(Integer idEdoLic) {
        this.idEdoLic = idEdoLic;
    }

    public EstadoLicitacion(Integer idEdoLic, String descripcion) {
        this.idEdoLic = idEdoLic;
        this.descripcion = descripcion;
    }

    public Integer getIdEdoLic() {
        return idEdoLic;
    }

    public void setIdEdoLic(Integer idEdoLic) {
        this.idEdoLic = idEdoLic;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEdoLic != null ? idEdoLic.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoLicitacion)) {
            return false;
        }
        EstadoLicitacion other = (EstadoLicitacion) object;
        if ((this.idEdoLic == null && other.idEdoLic != null) || (this.idEdoLic != null && !this.idEdoLic.equals(other.idEdoLic))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.lania.SAI.entidades.EstadoLicitacion[ idEdoLic=" + idEdoLic + " ]";
    }
    
}
