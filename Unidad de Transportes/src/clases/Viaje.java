
package clases;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author M Fer
 */
public final class Viaje {
    private String puntoSalida;
    private String fechaInicio;
    private String horaInicio;
    private ArrayList<Object> pasajeros;//Nose que tipo es ya que se saca del JSON los pasajeros, agregar al constructor 
    private String horaFinal;
    private String destino;
    private String chofer; // Se debe asignar uno del JSON,agregar al constructor 
    private int kmInicial;
    private int kmFinal;
    private String estado;
    private Date fechaSolicitud;
    private String vehiculo;

    public Viaje(String puntoSalida, String fechaInicio, String horaInicio, String horaFinal, String destino,int kmInicial, int kmFinal, String estado) {
        this.puntoSalida = puntoSalida;
        this.fechaInicio = fechaInicio;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.destino = destino;
        this.kmInicial = kmInicial;
        this.kmFinal = kmFinal;
        this.estado = estado;
        this.chofer="Sin asignar";
        this.vehiculo="Sin asignar";
    }
    
    public String getPuntoSalida() {
        return puntoSalida;
    }

    public void setPuntoSalida(String pPuntoSalida) {
        this.puntoSalida = pPuntoSalida;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String pFechaInicio) {
        this.fechaInicio = pFechaInicio;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String pHoraInicio) {
        this.horaInicio = pHoraInicio;
    }

    public ArrayList<Object> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(ArrayList<Object> pPasajeros) {
        this.pasajeros = pasajeros;//Se debe cambiar sacando los pasajeros
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(String pHoraFinal) {
        this.horaFinal = pHoraFinal;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String pDestino) {
        this.destino = pDestino;
    }

    public String getChofer() {
        return chofer;
    }

    public void setChofer(String chofer) {
        this.chofer = chofer; 
    }

    public int getKmInicial() {
        return kmInicial;
    }

    public void setKmInicial(int pKmInicial) {
        this.kmInicial = pKmInicial;
    }

    public int getKmFinal() {
        return kmFinal;
    }

    public void setKmFinal(int pKmFinal) {
        this.kmFinal = pKmFinal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String pEstado) {
        this.estado = pEstado;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date pFechaSolicitud) {
        this.fechaSolicitud = pFechaSolicitud;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }
    
}
