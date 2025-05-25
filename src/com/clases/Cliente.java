package com.clases;

/**
 *
 * @author Rai
 */
public class Cliente {

    private String rut;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String domicilio;
    private String comuna;
    private int telefono;

    public Cliente(String rut, String nombre, String apellidoP, String apellidoM, String domicilio, String comuna, int telefono) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.domicilio = domicilio;
        this.comuna = comuna;
        this.telefono = telefono;
    }

    public Cliente() {
        this.rut = "";
        this.nombre = "";
        this.apellidoP = "";
        this.apellidoM = "";
        this.domicilio = "";
        this.comuna = "";
        this.telefono = 0;
    }

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getComuna() {
        return comuna;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{"
                + "rut='" + rut + '\''
                + // Añade '\'' para cadenas, es buena práctica
                ", nombre='" + nombre + '\''
                + ", apellidoP='" + apellidoP + '\''
                + ", apellidoM='" + apellidoM + '\''
                + ", domicilio='" + domicilio + '\''
                + ", comuna='" + comuna + '\''
                + ", telefono=" + telefono
                + '}';
    }

}
