/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polovniautomobili.a6;


import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Korisnik
 */
public class DatabaseProxy {

    public static final String URLBAZE = "jdbc:ucanaccess://src\\resursi\\Polovni.accdb";
    static Connection c;

    public static void konektujSe() {
        try {
            c = DriverManager.getConnection(URLBAZE);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseProxy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ArrayList<ModeliDO> getCarModels() {
        try {
            ArrayList<ModeliDO> modeli = new ArrayList<>();
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM Model");
            
            while (rs.next()) {
                ModeliDO m = new ModeliDO();
                m.ID = rs.getInt("ModelID");
                m.Naziv = rs.getString("Naziv");
                m.ProizvodjacID = rs.getInt("ProzivodjacID");
                modeli.add(m);
                
            }
            return modeli;
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseProxy.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
}
