/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bienimmobilier;

/**
 *
 * @author jeanf
 */
public class index {
    
    public static void main(String args[]){
        /*   Test   */
        
        // Creation des objets
        BienImmobilier immo1 = new BienImmobilier(147000, true, false, "Jones", "Smith");
        BienImmobilier immo2 = new BienImmobilier(147000, false, false, "Smith", "Jones");
        
        System.out.println(immo1.toString());
        System.out.println(immo2.toString());
        
        // Test location
        immo1.location("Dupont");
        immo2.location("Durand");
        
        System.out.println(immo1.toString());
        System.out.println(immo2.toString());
        
        // Test finLocation
        immo2.finLocation();
        immo2.finLocation();
        
        System.out.println(immo1.toString());
        System.out.println(immo2.toString());
        
        // Test vente
        immo1.vente(100000, "Rolland");
        immo1.setVente(true);
        
        System.out.println(immo1.toString());
        System.out.println(immo2.toString());
        
        immo1.vente(100000, "Rolland");
        
        System.out.println(immo1.toString());
        System.out.println(immo2.toString());
    }
}
