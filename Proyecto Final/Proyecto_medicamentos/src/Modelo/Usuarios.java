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
public class Usuarios {
    int idUsuarios;
    String usuario;
    String clave;
     String nombre;
    String correo;
    
  

    public Usuarios() {
    }

    public Usuarios(int idUsuarios, String usuario, String clave, String nombre, String correo) {
        this.idUsuarios = idUsuarios;
        this.usuario = usuario;
        this.clave = clave;
        this.nombre = nombre;
        this.correo = correo;
    }

    
    
    public Usuarios(String usuario, String clave, String nombre, String correo) {
        this.usuario = usuario;
        this.clave = clave;
        this.nombre = nombre;
        this.correo = correo;
    }

    public int getIdUsuarios() {
        return idUsuarios;
    }

    public void setIdUsuarios(int idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
   


    
    
}
