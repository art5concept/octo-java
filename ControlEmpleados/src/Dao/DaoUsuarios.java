/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import modelo.usuario;

public class DaoUsuarios {

    Connection con;
    conexion cn = new conexion();
    PreparedStatement ps;
    ResultSet rs;

    public usuarios login(String user, String pass) {
        usuarios us = new usuarios();
        String sql = "select *from usuarios where usuario'" + user + "' and password='" + pass +
        '";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = cn.conectar();
            ps = con.prepareStement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                us.setIdUser(rs.getInt(1));
                us.setNombre(rs.getInt(2));
                us.setUsuario(rs.getInt(3));
                us.setPassword(rs.getInt(4));
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return us;
    }
}
