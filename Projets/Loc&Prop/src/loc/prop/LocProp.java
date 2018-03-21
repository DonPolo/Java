/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loc.prop;

/**
 *
 * @author p1706363
 */
public class LocProp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Proprietaire p1 = new Proprietaire("Smith", "John", "125 blvd des Belges", 2000, 1000);
        Locataire l1 = new Locataire("Durand", "Pascal", "12 rue belleville", 1000, 500);
        
        BienImmobilier bi1 = new BienImmobilier(1000000, true, false, p1, l1);
        
        /* Test */
        System.out.println(p1.toString());
        System.out.println(l1.toString());
        System.out.println(bi1.toString());
        
    }
    
}
