/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.lania.SAI.entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "empresas_agente")
@XmlRootElement

public class EmpresaAgente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_emp_agte")
    private Integer idEmpAgte;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "clave")
    private Integer clave;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpAgte")
    private Collection<AgenteContratante> agenteContratanteCollection;

    public EmpresaAgente() {
    }

    public EmpresaAgente(Integer idEmpAgte) {
        this.idEmpAgte = idEmpAgte;
    }

    public EmpresaAgente(Integer idEmpAgte, String nombre) {
        this.idEmpAgte = idEmpAgte;
        this.nombre = nombre;
    }

    public Integer getIdEmpAgte() {
        return idEmpAgte;
    }

    public void setIdEmpAgte(Integer idEmpAgte) {
        this.idEmpAgte = idEmpAgte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getClave() {
        return clave;
    }

    public void setClave(Integer clave) {
        this.clave = clave;
    }

    @XmlTransient
    public Collection<AgenteContratante> getAgenteContratanteCollection() {
        return agenteContratanteCollection;
    }

    public void setAgenteContratanteCollection(Collection<AgenteContratante> agenteContratanteCollection) {
        this.agenteContratanteCollection = agenteContratanteCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpAgte != null ? idEmpAgte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmpresaAgente)) {
            return false;
        }
        EmpresaAgente other = (EmpresaAgente) object;
        if ((this.idEmpAgte == null && other.idEmpAgte != null) || (this.idEmpAgte != null && !this.idEmpAgte.equals(other.idEmpAgte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.lania.SAI.entidades.EmpresaAgente[ idEmpAgte=" + idEmpAgte + " ]";
    }
    
}
