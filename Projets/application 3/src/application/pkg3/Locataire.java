/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.pkg3;

/**
 *
 * @author p1706363
 */
public class Locataire {
    private String nom;
    private String prenom;
    private String adresse;
    private double montantLoyer;
    private double taxeHab;
    
    public Locataire(String nom, String prenom, String adresse, double montantLoyer, double taxeHab){
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.montantLoyer = montantLoyer;
        this.taxeHab = taxeHab;
    }
    
    /*  Setters  */
    public void setNom(String nom){
        this.nom = nom;
    }
    
    public void setPren(String prenom){
        this.prenom = prenom;
    }
    
    public void setAdresse(String adresse){
        this.adresse = adresse;
    }
    
    public void setLoyer(double loyer){
        this.montantLoyer = loyer;
    }
    
    public void setTaxeHab(double taxehab){
        this.taxeHab = taxeHab;
    }
    
    /*   Getters   */
    public String getNom(){
        return nom;
    }
    
    public String getPren(){
        return prenom;
    }
    
    public String getAdresse(){
        return adresse;
    }
    
    public double getLoyer(){
        return montantLoyer;
    }
    
    public double getTaxeHab(){
        return taxeHab;
    }
    
    /*  toString    */
    public String toString(){
        return "Le locataire s'appelle " + prenom + " " + nom + " et habite au " + adresse + " il paye " +  montantLoyer + "€ de loyer et " + taxeHab + "€ de taxe d'habitation.";
    }
    
}
