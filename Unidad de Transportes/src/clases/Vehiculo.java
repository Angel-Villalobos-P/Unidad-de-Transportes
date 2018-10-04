
package clases;

import java.util.ArrayList;

/**
 *
 * @author angel
 */
public class Vehiculo {
    private String placa;
    private String annoFabricacion;
    private String color;
    private String marca;
    private int capacidad;
    private float kilometraje;
    private int vin;
    private String sede;
    private String estado;
    private ArrayList<Mantenimiento> mantenimiento;

    public Vehiculo(String placa, String annoFabricacion, String color, String marca, int capacidad, float kilometraje, int vin, String sede, String estado) {
        this.placa = placa;
        this.annoFabricacion = annoFabricacion;
        this.color = color;
        this.marca = marca;
        this.capacidad = capacidad;
        this.kilometraje = kilometraje;
        this.vin = vin;
        this.sede = sede;
        this.estado = estado;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAnnoFabricacion() {
        return annoFabricacion;
    }

    public void setAnnoFabricacion(String annoFabricacion) {
        this.annoFabricacion = annoFabricacion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public float getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(float kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void agregarMantenimiento(String pIdeServicio,String pFechaInicio,String pFechaFinal,float pMonto,String pActividad,boolean pTipoServicio){
         Mantenimiento mantenimientoNuevo=new Mantenimiento(pIdeServicio,pFechaInicio,pFechaFinal,pMonto,pActividad,pTipoServicio);
         mantenimiento.add(mantenimientoNuevo);
    }

    public ArrayList<Mantenimiento> getMantenimiento() {
        return mantenimiento;
    }

}
