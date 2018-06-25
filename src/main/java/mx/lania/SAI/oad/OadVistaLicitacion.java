/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.lania.SAI.oad;


/**
 *
 * @author lania
 */

import java.math.BigDecimal;
import java.util.List;
import mx.lania.SAI.entidades.VistaLicitaciones;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OadVistaLicitacion extends JpaRepository<VistaLicitaciones, Integer>{
    public List<VistaLicitaciones> findBynombreLicStartingWithIgnoreCase(String nombre_licitacion);
    public List<VistaLicitaciones> findByestadolicStartingWithIgnoreCase(String estadolic);
    public List<VistaLicitaciones> findBytipocontStartingWithIgnoreCase(String tipocont);
    public List<VistaLicitaciones> findBycaracterStartingWithIgnoreCase(String caracter);
    public List<VistaLicitaciones> findByregionStartingWithIgnoreCase(String region);
    public List<VistaLicitaciones> findByefStartingWithIgnoreCase(String ef);
    public List<VistaLicitaciones> findByconcursoStartingWithIgnoreCase(String concurso);
    public List<VistaLicitaciones> findBycontratacionStartingWithIgnoreCase(String contratacion);
    public List<VistaLicitaciones> findBymontoBetween(BigDecimal monto1, BigDecimal monto2);
   
}
