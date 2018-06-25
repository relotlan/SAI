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
@Table(name = "consorcios_prov")
@XmlRootElement

public class ConsorcioProv implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cp")
    private Integer idCp;
    @JoinColumn(name = "id_consorcio", referencedColumnName = "id_consorcio")
    @ManyToOne(optional = false)
    private Consorcio idConsorcio;
    @JoinColumn(name = "id_proveedor", referencedColumnName = "id_proveedor")
    @ManyToOne(optional = false)
    private Proveedor idProveedor;

    public ConsorcioProv() {
    }

    public ConsorcioProv(Integer idCp) {
        this.idCp = idCp;
    }

    public Integer getIdCp() {
        return idCp;
    }

    public void setIdCp(Integer idCp) {
        this.idCp = idCp;
    }

    public Consorcio getIdConsorcio() {
        return idConsorcio;
    }

    public void setIdConsorcio(Consorcio idConsorcio) {
        this.idConsorcio = idConsorcio;
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
        hash += (idCp != null ? idCp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConsorcioProv)) {
            return false;
        }
        ConsorcioProv other = (ConsorcioProv) object;
        if ((this.idCp == null && other.idCp != null) || (this.idCp != null && !this.idCp.equals(other.idCp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.lania.SAI.entidades.ConsorcioProv[ idCp=" + idCp + " ]";
    }
    
}
