/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_bdd;

import com.mysql.jdbc.PreparedStatement;
import CONEXION.conector;
import MODELO.articulo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author antho
 */
public class ConexionBDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         PreparedStatement ps = null;
                 ResultSet rs = null;

        conector stringConexion = new conector();
        stringConexion.getConxion();
        articulo nuevoArticulo = new articulo();
        //nuevoArticulo.setNombre("nintendo");
        //nuevoArticulo.setDescripcion("mariooo");
        //nuevoArticulo.setPrecio(250);        
        // Insert
        
        String select =
            "select * "
            + "from articulos"
                + " where idArticulo = ?";
        
        try {
            ps = (PreparedStatement) stringConexion
                    .getConxion()
                    .prepareStatement(select);
            ps.setInt(1, 3);
            rs = ps.executeQuery(); // obtener resultados
            while (rs.next()) {                
                // 1 id
                // ver todo lo de id = 2
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getFloat(4));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
        
        
        
        
    }
        
    }
    

