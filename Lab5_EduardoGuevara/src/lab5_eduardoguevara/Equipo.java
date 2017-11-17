/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_eduardoguevara;

import java.util.ArrayList;

/**
 *
 * @author edujg
 */
public class Equipo {

    private String nombre;
    private float presupuesto;
    private int copasg;
    private String estadio;
    private ArrayList<Jugador> jugad = new ArrayList();

    public Equipo() {
    }

    public Equipo(String nombre, float presupuesto, int copasg, String estadio) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.copasg = copasg;
        this.estadio = estadio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }

    public int getCopasg() {
        return copasg;
    }

    public void setCopasg(int copasg) {
        this.copasg = copasg;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public ArrayList<Jugador> getJugad() {
        return jugad;
    }

    public void setJugad(ArrayList<Jugador> jugad) {
        this.jugad = jugad;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
