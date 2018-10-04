/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author M Fer
 */
public final class Mantenimiento {
    private String ideServicio;
    private String fechaInicio;
    private String fechaFinal;
    private float monto;
    private String actividad;
    private boolean tipoServicio;
    private Empresa empresa;

    public Mantenimiento(String ideServicio, String fechaInicio, String fechaFinal, float monto, String actividad, boolean tipoServicio) {
        this.ideServicio = ideServicio;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.monto = monto;
        this.actividad = actividad;
        this.tipoServicio = tipoServicio;
    }
    
    public String getIdeServicio() {
        return ideServicio;
    }

    public void setIdeServicio(String pIdeServicio) {
        ideServicio = pIdeServicio;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String pFechaInicio) {
        fechaInicio = pFechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String pFechaFinal) {
        fechaFinal = pFechaFinal;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float pMonto) {
        monto = pMonto;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String pActividad) {
        actividad = pActividad;
    }

    public boolean getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(boolean pTipoServicio) {
        tipoServicio = pTipoServicio;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
