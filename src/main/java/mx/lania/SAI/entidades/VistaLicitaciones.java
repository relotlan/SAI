/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.lania.SAI.entidades;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lania
 */
@Entity
@Table(name = "vista_licitaciones")
@XmlRootElement
public class VistaLicitaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    //private static final long serialVersionUID = 1L;
    @Column(name = "id_vista")
    private Integer idVista;
    @Size(max = 200)
    @Column(name = "nombre_lic")
    private String nombreLic;
    @Size(max = 150)
    @Column(name = "estadolic")
    private String estadolic;
    @Size(max = 200)
    @Column(name = "tipocont")
    private String tipocont;
    @Size(max = 150)
    @Column(name = "agentecon")
    private String agentecon;
    @Size(max = 150)
    @Column(name = "caracter")
    private String caracter;
    @Size(max = 150)
    @Column(name = "region")
    private String region;
    @Size(max = 150)
    @Column(name = "ef")
    private String ef;
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    @Size(max = 200)
    @Column(name = "concurso")
    private String concurso;
    @Size(max = 200)
    @Column(name = "contratacion")
    private String contratacion;
    @Column(name = "monto")
    private BigInteger monto;

    public VistaLicitaciones() {
    }

    public Integer getIdVista() {
        return idVista;
    }

    public void setIdVista(Integer idVista) {
        this.idVista = idVista;
    }

    public String getNombreLic() {
        return nombreLic;
    }

    public void setNombreLic(String nombreLic) {
        this.nombreLic = nombreLic;
    }

    public String getEstadolic() {
        return estadolic;
    }

    public void setEstadolic(String estadolic) {
        this.estadolic = estadolic;
    }

    public String getTipocont() {
        return tipocont;
    }

    public void setTipocont(String tipocont) {
        this.tipocont = tipocont;
    }

    public String getAgentecon() {
        return agentecon;
    }

    public void setAgentecon(String agentecon) {
        this.agentecon = agentecon;
    }

    public String getCaracter() {
        return caracter;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getEf() {
        return ef;
    }

    public void setEf(String ef) {
        this.ef = ef;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getConcurso() {
        return concurso;
    }

    public void setConcurso(String concurso) {
        this.concurso = concurso;
    }

    public String getContratacion() {
        return contratacion;
    }

    public void setContratacion(String contratacion) {
        this.contratacion = contratacion;
    }

    public BigInteger getMonto() {
        return monto;
    }

    public void setMonto(BigInteger monto) {
        this.monto = monto;
    }
    
}
