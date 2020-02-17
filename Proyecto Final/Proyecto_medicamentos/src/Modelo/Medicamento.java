/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Dell
 */
public class Medicamento {

    int idMedicinas;
    String nombre;
    double gramosaingerir;
    String composicion;
    String usadopara;
    String fechacaducidad;
    int numeropastillas;

    public Medicamento() {
         
         nombre="";
         gramosaingerir=0;
         composicion="";
         usadopara="";
         fechacaducidad="";
         numeropastillas=0;
    }

    public Medicamento(int idMedicinas, String nombre, double gramosaingerir, String composicion, String usadopara, String fechacaducidad, int numeropastillas) {
        this.idMedicinas = idMedicinas;
        this.nombre = nombre;
        this.gramosaingerir = gramosaingerir;
        this.composicion = composicion;
        this.usadopara = usadopara;
        this.fechacaducidad = fechacaducidad;
        this.numeropastillas = numeropastillas;
    }
    

    public Medicamento(String nombre, double gramosaingerir, String composicion, String usadopara, String fechacaducidad, int numeropastillas) {
        this.nombre = nombre;
        this.gramosaingerir = gramosaingerir;
        this.composicion = composicion;
        this.usadopara = usadopara;
        this.fechacaducidad = fechacaducidad;
        this.numeropastillas = numeropastillas;
    }

    

    public double getGramosaingerir() {
        return gramosaingerir;
    }

    public void setGramosaingerir(double gramosaingerir) {
        this.gramosaingerir = gramosaingerir;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComposicion() {
        return composicion;
    }

    public void setComposicion(String composicion) {
        this.composicion = composicion;
    }

    public String getUsadopara() {
        return usadopara;
    }

    public void setUsadopara(String usadopara) {
        this.usadopara = usadopara;
    }

    public String getFechacaducidad() {
        return fechacaducidad;
    }

    public void setFechacaducidad(String fechacaducidad) {
        this.fechacaducidad = fechacaducidad;
    }

    public int getNumeropastillas() {
        return numeropastillas;
    }

    public void setNumeropastillas(int numeropastillas) {
        this.numeropastillas = numeropastillas;
    }

    public int getIdMedicinas() {
        return idMedicinas;
    }

    public void setIdMedicinas(int idMedicinas) {
        this.idMedicinas = idMedicinas;
    }

    
}
