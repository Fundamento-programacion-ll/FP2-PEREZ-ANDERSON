/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class Paciente {

    String nombres;
    String apellidos;
    String fechanac;
    int hijos;
    int seguro;

    public Paciente(String nombres, String apellidos, String fechanac, int hijos, int seguro) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechanac = fechanac;
        this.hijos = hijos;
        this.seguro = seguro;
    }

    public Paciente() {
        nombres = "";
        apellidos = "";
        fechanac = null;
        hijos = 0;
        seguro = 0;
    }

   

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechanac() {
        return fechanac;
    }

    public void setFechanac(String fechanac) {
        this.fechanac = fechanac;
    }

    public int getHijos() {
        return hijos;
    }

    public void setHijos(int hijos) {
        this.hijos = hijos;
    }

    public int getSeguro() {
        return seguro;
    }

    public void setSeguro(int seguro) {
        this.seguro = seguro;
    }

}
