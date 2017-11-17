/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_eduardoguevara;

/**
 *
 * @author edujg
 */
public class Jugador {

    private String nombre;
    private float precio;
    private String pos;
    private String disponibilidad;
    private float habilidad;
    private float tecnica;
    private float resist;

    public Jugador() {
    }

    public Jugador(String nombre, float precio, String pos, String disponibilidad, float habilidad, float tecnica, float resist) {
        this.nombre = nombre;
        this.precio = precio;
        this.pos = pos;
        this.disponibilidad = disponibilidad;
        this.habilidad = habilidad;
        this.tecnica = tecnica;
        this.resist = resist;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public float getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(float habilidad) {
        this.habilidad = habilidad;
    }

    public float getTecnica() {
        return tecnica;
    }

    public void setTecnica(float tecnica) {
        this.tecnica = tecnica;
    }

    public float getResist() {
        return resist;
    }

    public void setResist(float resist) {
        this.resist = resist;
    }

    @Override
    public String toString() {
        return nombre + "   " + precio + "    " + pos + "    " + disponibilidad;
    }

}
