/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.lania.SAI.entidades;

import java.io.Serializable;
import java.math.BigInteger;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lania
 */
@Entity
@Table(name = "propuestas")
@XmlRootElement

public class Propuesta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_propuesta")
    private Integer idPropuesta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "monto_propuesta")
    private BigInteger montoPropuesta;
    @Column(name = "archivo_propuetsa")
    private Boolean archivoPropuetsa;
    @JoinColumn(name = "id_proveedor", referencedColumnName = "id_proveedor")
    @ManyToOne(optional = false)
    private Proveedor idProveedor;
    @JoinColumn(name = "id_tp", referencedColumnName = "id_tp")
    @ManyToOne(optional = false)
    private TipoPropuesta idTp;

    public Propuesta() {
    }

    public Propuesta(Integer idPropuesta) {
        this.idPropuesta = idPropuesta;
    }

    public Propuesta(Integer idPropuesta, BigInteger montoPropuesta) {
        this.idPropuesta = idPropuesta;
        this.montoPropuesta = montoPropuesta;
    }

    public Integer getIdPropuesta() {
        return idPropuesta;
    }

    public void setIdPropuesta(Integer idPropuesta) {
        this.idPropuesta = idPropuesta;
    }

    public BigInteger getMontoPropuesta() {
        return montoPropuesta;
    }

    public void setMontoPropuesta(BigInteger montoPropuesta) {
        this.montoPropuesta = montoPropuesta;
    }

    public Boolean getArchivoPropuetsa() {
        return archivoPropuetsa;
    }

    public void setArchivoPropuetsa(Boolean archivoPropuetsa) {
        this.archivoPropuetsa = archivoPropuetsa;
    }

    public Proveedor getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Proveedor idProveedor) {
        this.idProveedor = idProveedor;
    }

    public TipoPropuesta getIdTp() {
        return idTp;
    }

    public void setIdTp(TipoPropuesta idTp) {
        this.idTp = idTp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPropuesta != null ? idPropuesta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Propuesta)) {
            return false;
        }
        Propuesta other = (Propuesta) object;
        if ((this.idPropuesta == null && other.idPropuesta != null) || (this.idPropuesta != null && !this.idPropuesta.equals(other.idPropuesta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.lania.SAI.entidades.Propuesta[ idPropuesta=" + idPropuesta + " ]";
    }
    
}
