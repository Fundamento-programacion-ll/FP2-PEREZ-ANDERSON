/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import CONEXION.conector;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import MODELO.articulo;

public class controladorArticulo {
    conector conexion = new conector();
        PreparedStatement ps = null;
    
    public void ingresarArticulo(articulo nuevoArticulo){
        
        String sqlInsert = 
                "insert into articulos  (nombre,descripcion,precio) values (?,?,?)";
        try {
            ps = conexion.getConxion().prepareStatement(sqlInsert);
            ps.setString(1, nuevoArticulo.getNombre());
            ps.setString(2, nuevoArticulo.getDescr());
            ps.setFloat(3, nuevoArticulo.getPrecio());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Datos ingresados correctamente");
        } catch (SQLException ex) {
            System.out.println("EROR"+ ex);
                  JOptionPane.showMessageDialog(null, "ERROR");
        }
    }
}
