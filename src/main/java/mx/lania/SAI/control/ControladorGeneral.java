/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.lania.SAI.control;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import mx.lania.SAI.oad.OadVistaLicitacion;
import mx.lania.SAI.entidades.VistaLicitaciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lania
 */
@RestController
public class ControladorGeneral {

    @Autowired
    OadVistaLicitacion oadVistaLicitacion;

    @GetMapping("/vistaLis")
    public List<VistaLicitaciones> getLicitaciones() {
        return oadVistaLicitacion.findAll();
    }

    @GetMapping("/vistaLis/{id}")
    public ResponseEntity<VistaLicitaciones> getVistaPorId(@PathVariable("id") Integer id) {
        Optional<VistaLicitaciones> opVista = oadVistaLicitacion.findById(id);
        if (opVista.isPresent()) {
            return ResponseEntity.ok(opVista.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping(value = "/vistaLis", params = {"nombre_licitacion"})
    public List<VistaLicitaciones> getVistaporNomLic(@RequestParam("nombre_licitacion") String nombre_licitacion) {
        return oadVistaLicitacion.findBynombreLicStartingWithIgnoreCase(nombre_licitacion);
    }
    
    @GetMapping(value = "/vistaLis", params = {"estadolic"})
    public List<VistaLicitaciones> getVistaporEstadoLic(@RequestParam("estadolic") String estadolic) {
        return oadVistaLicitacion.findByestadolicStartingWithIgnoreCase(estadolic);
    }
    
    @GetMapping(value = "/vistaLis", params = {"tipocont"})
    public List<VistaLicitaciones> getTipoCon(@RequestParam("tipocont") String tipocont) {
        return oadVistaLicitacion.findBytipocontStartingWithIgnoreCase(tipocont);
    }
    
    @GetMapping(value = "/vistaLis", params = {"caracter"})
    public List<VistaLicitaciones> getCaracter(@RequestParam("caracter") String caracter) {
        return oadVistaLicitacion.findBycaracterStartingWithIgnoreCase(caracter);
    }
    
    @GetMapping(value = "/vistaLis", params = {"region"})
    public List<VistaLicitaciones> getRegion(@RequestParam("region") String region) {
        return oadVistaLicitacion.findByregionStartingWithIgnoreCase(region);
    }
    
    @GetMapping(value = "/vistaLis", params = {"ef"})
    public List<VistaLicitaciones> getEf(@RequestParam("ef") String ef) {
        return oadVistaLicitacion.findByefStartingWithIgnoreCase(ef);
    }
    
    @GetMapping(value = "/vistaLis", params = {"concurso"})
    public List<VistaLicitaciones> getConcurso(@RequestParam("concurso") String concurso) {
        return oadVistaLicitacion.findByconcursoStartingWithIgnoreCase(concurso);
    }
    
    @GetMapping(value = "/vistaLis", params = {"contratacion"})
    public List<VistaLicitaciones> getContratacion(@RequestParam("contratacion") String contratacion) {
        return oadVistaLicitacion.findBycontratacionStartingWithIgnoreCase(contratacion);
    }
    
    @GetMapping(value = "/vistaLis", params = {"monto1","monto2"})
    public List<VistaLicitaciones> getMonto(@RequestParam("monto1") float monto1, @RequestParam("monto2") BigDecimal monto2) {
        return oadVistaLicitacion.findBymontoBetween(monto2, monto2);
                
                
                
                
                
    }

}
