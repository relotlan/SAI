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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lania
 */
@Entity
@Table(name = "licitaciones_proveedor")
@XmlRootElement

public class LicitacionProveedor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_lp")
    private Integer idLp;
    @JoinColumn(name = "id_consorcio", referencedColumnName = "id_consorcio")
    @ManyToOne
    private Consorcio idConsorcio;
    @JoinColumn(name = "id_licitacion", referencedColumnName = "id_licitacion")
    @ManyToOne(optional = false)
    private Licitacion idLicitacion;
    @JoinColumn(name = "id_proveedor", referencedColumnName = "id_proveedor")
    @ManyToOne
    private Proveedor idProveedor;

    public LicitacionProveedor() {
    }

    public LicitacionProveedor(Integer idLp) {
        this.idLp = idLp;
    }

    public Integer getIdLp() {
        return idLp;
    }

    public void setIdLp(Integer idLp) {
        this.idLp = idLp;
    }

    public Consorcio getIdConsorcio() {
        return idConsorcio;
    }

    public void setIdConsorcio(Consorcio idConsorcio) {
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
        hash += (idLp != null ? idLp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LicitacionProveedor)) {
            return false;
        }
        LicitacionProveedor other = (LicitacionProveedor) object;
        if ((this.idLp == null && other.idLp != null) || (this.idLp != null && !this.idLp.equals(other.idLp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.lania.SAI.entidades.LicitacionProveedor[ idLp=" + idLp + " ]";
    }
    
}
