/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Eleazar
 */
public class conexionSQL {
    Connection conectar = null;
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmacia","root","Soybiker1");
            //JOptionPane.showMessageDialog(null,"Conexion Existosa");
           System.out.println("Conexion Exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR de CONEXION" + e);
        }
        return conectar;
    }
}
