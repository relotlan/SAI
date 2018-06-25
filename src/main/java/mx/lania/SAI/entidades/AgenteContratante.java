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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "agentes_contratantes")
@XmlRootElement

public class AgenteContratante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_ac")
    private Integer idAc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "nombrecompleto")
    private String nombrecompleto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAc")
    private Collection<Licitacion> licitacionCollection;
    @JoinColumn(name = "id_emp_agte", referencedColumnName = "id_emp_agte")
    @ManyToOne(optional = false)
    private EmpresaAgente idEmpAgte;
    @JoinColumn(name = "id_ef", referencedColumnName = "id_ef")
    @ManyToOne(optional = false)
    private EntidadFederativa idEf;

    public AgenteContratante() {
    }

    public AgenteContratante(Integer idAc) {
        this.idAc = idAc;
    }

    public AgenteContratante(Integer idAc, String nombrecompleto) {
        this.idAc = idAc;
        this.nombrecompleto = nombrecompleto;
    }

    public Integer getIdAc() {
        return idAc;
    }

    public void setIdAc(Integer idAc) {
        this.idAc = idAc;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    @XmlTransient
    public Collection<Licitacion> getLicitacionCollection() {
        return licitacionCollection;
    }

    public void setLicitacionCollection(Collection<Licitacion> licitacionCollection) {
        this.licitacionCollection = licitacionCollection;
    }

    public EmpresaAgente getIdEmpAgte() {
        return idEmpAgte;
    }

    public void setIdEmpAgte(EmpresaAgente idEmpAgte) {
        this.idEmpAgte = idEmpAgte;
    }

    public EntidadFederativa getIdEf() {
        return idEf;
    }

    public void setIdEf(EntidadFederativa idEf) {
        this.idEf = idEf;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAc != null ? idAc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgenteContratante)) {
            return false;
        }
        AgenteContratante other = (AgenteContratante) object;
        if ((this.idAc == null && other.idAc != null) || (this.idAc != null && !this.idAc.equals(other.idAc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.lania.SAI.entidades.AgenteContratante[ idAc=" + idAc + " ]";
    }
    
}
