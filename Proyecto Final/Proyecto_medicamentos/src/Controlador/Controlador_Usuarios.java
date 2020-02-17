/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion.Conexion;
import static Conexion.Conexion.getConnection;
import Modelo.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class Controlador_Usuarios {

    Conexion conexion = new Conexion();
    PreparedStatement ps = null;
    ResultSet rs = null;
    int c = 0;

    public void ingresarUser(Usuarios nuevoUsuario) {
        String sqlInsert
                = "insert into usuarios (usuario,clave,nombre,correo) values(?,?,?,?)";
        try {
            ps = conexion.getConnection().prepareStatement(sqlInsert);
            ps.setString(1, nuevoUsuario.getUsuario());
            String texto = nuevoUsuario.getClave();
            String encriptMD5 = org.apache.commons.codec.digest.DigestUtils.md5Hex(texto);
            //System.out.println("md5:"+encriptMD5);
            ps.setString(2, encriptMD5);
            ps.setString(3, nuevoUsuario.getNombre());
            ps.setString(4, nuevoUsuario.getCorreo());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos ingresados correctamente");
        } catch (SQLException ex) {
            System.err.println("error: " + ex);
            JOptionPane
                    .showMessageDialog(null, "Error al ingresar datos");
            //Logger.getLogger(controladorArticulo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean login(Usuarios usr) {

        Connection con = getConnection();

        String sql = "SELECT idusuarios, usuario, clave, nombre, correo FROM usuarios WHERE usuario = ? LIMIT 1";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            rs = ps.executeQuery();

            if (rs.next()) {
                if (usr.getClave().equals(rs.getString(3))) {
                    usr.setIdUsuarios(rs.getInt(1));
                    usr.setUsuario(rs.getString(2));
                    usr.setNombre(rs.getString(4));
                    usr.setCorreo(rs.getString(5));
                    return true;

                } else {
                    return false;
                }
            }

            return false;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Datos incorrectos contr");
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }

    public int existeUsuario(String usuario) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();

        String sql = "SELECT count(idUsuarios) FROM usuarios WHERE usuario = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }

            return 1;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return 1;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }

}
