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
    //private Empresa empresa;
    public Mantenimiento(String pIdeServicio,String pFechaInicio,String pFechaFinal,float pMonto,String pActividad,boolean pTipoServicio){
        setIdeServicio(pIdeServicio);
        setFechaInicio(pFechaInicio);
        setFechaFinal(pFechaFinal);
        setMonto(pMonto);
        setActividad(pActividad);
        setTipoServicio(pTipoServicio);
    }
    public String getIdeServicio() {
        return ideServicio;
    }

    public void setIdeServicio(String pIdeServicio) {
        this.ideServicio = pIdeServicio;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String pFechaInicio) {
        this.fechaInicio = pFechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String pFechaFinal) {
        this.fechaFinal = pFechaFinal;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float pMonto) {
        this.monto = pMonto;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String pActividad) {
        this.actividad = pActividad;
    }

    public boolean getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(boolean pTipoServicio) {
        this.tipoServicio = pTipoServicio;
    }
    
    
}
