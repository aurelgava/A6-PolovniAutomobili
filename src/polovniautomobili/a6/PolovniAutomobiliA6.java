/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polovniautomobili.a6;

/**
 *
 * @author Korisnik
 */
public class PolovniAutomobiliA6 {
    public static final String URLBAZE = "jdbc:ucanaccess://src\\resursi\\Polovni.accdb";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new GlavniProzor().setVisible(true);
    }
    
}
