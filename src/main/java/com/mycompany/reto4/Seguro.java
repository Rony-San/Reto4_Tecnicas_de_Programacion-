
package com.mycompany.reto4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Seguro {
    private String panelId;
    private String nombreEmpresa;
    private LocalDate fechaInicial;
    private LocalDate fechaFinal;
    private String descripcion;

    public Seguro(String panelId, String nombreEmpresa, LocalDate fechaInicial, LocalDate fechaFinal, String descripcion) {
        this.panelId = panelId;
        this.nombreEmpresa = nombreEmpresa;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.descripcion = descripcion;
    }
    
    public int diasDeCobertura(){
        var dias = ChronoUnit.YEARS.between(this.fechaFinal, this.fechaFinal);
        return (int) dias;
    }
    
    public String getPanelId() {
        return panelId;
    }

    public void setPanelId(String panelId) {
        this.panelId = panelId;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public LocalDate getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(LocalDate fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
