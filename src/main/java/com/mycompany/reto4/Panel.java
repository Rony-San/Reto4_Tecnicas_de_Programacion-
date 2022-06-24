
package com.mycompany.reto4;

import java.time.LocalDate;


public class Panel {
    
    private String id;
    private String serie;
    private String descripcion;
    private String tipoPanel;
    private String modelo;
    private int anioFabricacion;
    private double precio;

    public Panel(String id, String serie, String descripcion, String tipoPanel, String modelo, int anioFabricacion, double precio) {
        this.id = id;
        this.serie = serie;
        this.descripcion = descripcion;
        this.tipoPanel = tipoPanel;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.precio = precio;
    }

    public String calcularUso(){
        int antiguedad = 2022 -  this.anioFabricacion;
        if (antiguedad > 0 && antiguedad <= 1){
            return "nuevo";
            
        } else if (antiguedad >= 2  && antiguedad <= 4){
            return "medianamente usado";
        } else if (antiguedad >= 5) {
            return "Usado";
        }
        return "no aplica";
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoPanel() {
        return tipoPanel;
    }

    public void setTipoPanel(String tipoPanel) {
        this.tipoPanel = tipoPanel;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    

}
