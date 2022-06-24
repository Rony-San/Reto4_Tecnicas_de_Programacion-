package com.mycompany.reto4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Venta {

    private String panelId;
    private LocalDate fechaVenta;
    private String tipoDocumento;
    private String documento;
    private String nombreComprador;
    private double valorVenta;
    private String descripcion;

    public Venta(String panelId, LocalDate fechaVenta, String tipoDocumento, String documento, String nombreComprador, double valorVenta, String descripcion) {
        this.panelId = panelId;
        this.fechaVenta = fechaVenta;
        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
        this.nombreComprador = nombreComprador;
        this.valorVenta = valorVenta;
        this.descripcion = descripcion;
    }

    public int diasDeCobertura() {
        var dias = ChronoUnit.YEARS.between(this.fechaVenta, LocalDate.now());
        return (int) dias;
    }

    public String getPanelId() {
        return panelId;
    }

    public void setPanelId(String panelId) {
        this.panelId = panelId;
    }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombreComprador() {
        return nombreComprador;
    }

    public void setNombreComprador(String nombreComprador) {
        this.nombreComprador = nombreComprador;
    }

    public double getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(double valorVenta) {
        this.valorVenta = valorVenta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
