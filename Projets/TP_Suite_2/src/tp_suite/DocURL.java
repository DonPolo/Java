/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_suite;

/**
 *
 * @author jeanf
 */
public class DocURL extends DocBibliotheque {
    
    private String desc;
    private String URL;
    
    public DocURL(String code, String titreD, String auteur, int anneeP, String URL, String desc){
        super(code, titreD, auteur, anneeP, "b");
        this.desc = desc;
        this.URL = URL;
    }
    
    
    public void reserver(MembreBibliotheque membre){
        System.out.println("Vous ne pouvez pas reserver un document URL.");
    }
    
    public void retourner(){
        System.out.println("Vous ne pouvez pas retourner un document URL.");
    }
    
    public void emprunter(MembreBibliotheque membre){
        System.out.println("Vous ne pouvez pas emprunter un document URL.");
    }
    
    public void mettreBiblio(){
        System.out.println("Vous ne pouvez pas mettre en bibliotheque un document URL.");
    }
    
    public void annulerRésa(MembreBibliotheque membre){
        System.out.println("Vous ne pouvez pas annuler la reservation d'un document URL.");
    }
}
