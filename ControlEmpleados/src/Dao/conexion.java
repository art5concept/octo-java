/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class conexion {

    Connection con;
    String db = "bd_empleados";
    String url = "jdbc:mysql://127.0.0.1/" + bd;
    String root = "root";
    String pass = "";

    public Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return con;
    }
}
