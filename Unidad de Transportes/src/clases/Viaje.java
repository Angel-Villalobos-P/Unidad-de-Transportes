
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

    public Viaje(String puntoSalida, String fechaInicio, String horaInicio, String horaFinal, String destino, String chofer, int kmInicial, int kmFinal, String estado) {
        this.puntoSalida = puntoSalida;
        this.fechaInicio = fechaInicio;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.destino = destino;
        this.kmInicial = kmInicial;
        this.kmFinal = kmFinal;
        this.estado = estado;
    }
    
    public String getPuntoSalida() {
        return puntoSalida;
    }

    public void setPuntoSalida(String pPuntoSalida) {
        puntoSalida = pPuntoSalida;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String pFechaInicio) {
        fechaInicio = pFechaInicio;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String pHoraInicio) {
        horaInicio = pHoraInicio;
    }

    public ArrayList<Object> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(ArrayList<Object> pPasajeros) {
        pasajeros = pasajeros;//Se debe cambiar sacando los pasajeros
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(String pHoraFinal) {
        horaFinal = pHoraFinal;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String pDestino) {
        destino = pDestino;
    }

    public String getChofer() {
        return chofer;
    }

    public void setChofer(String chofer) {
        chofer = chofer; // Sacar el chofer de los registrados
    }

    public int getKmInicial() {
        return kmInicial;
    }

    public void setKmInicial(int pKmInicial) {
        kmInicial = pKmInicial;
    }

    public int getKmFinal() {
        return kmFinal;
    }

    public void setKmFinal(int pKmFinal) {
        kmFinal = pKmFinal;
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
        fechaSolicitud = pFechaSolicitud;
    }
}
