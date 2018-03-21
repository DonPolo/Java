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
public class Proprietaire {
    private String nom;
    private String prenom;
    private String adresse;
    private double taxeFonciere;
    private double taxeHab;
    
    public Proprietaire(String nom, String prenom, String adresse, double taxeFonciere, double taxeHab){
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.taxeFonciere = taxeFonciere;
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
    
    public void setTaxeFonciere(double taxeFonciere){
        this.taxeFonciere = taxeFonciere;
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
    
    public double getTaxeFonciere(){
        return taxeFonciere;
    }
    
    public double getTaxeHab(){
        return taxeHab;
    }
    
    /*  toString    */
    public String toString(){
        return "Le proprietaire s'appelle " + prenom + " " + nom + " et habite au " + adresse + " il paye " + taxeFonciere + "€ de taxe fonciere et " + taxeHab + "€ de taxe d'habitation.";
    }
}
