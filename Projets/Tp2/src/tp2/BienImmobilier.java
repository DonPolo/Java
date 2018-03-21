/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

/**
 *
 * @author p1706363
 */
public class BienImmobilier {
    private int reference;
    private double prix;
    private boolean location;
    private boolean vente;
    private String nomp;
    private String noml;
    BienImmobilier (int reference, double prix, boolean location, boolean vente, String nomp, String noml) {
        this.reference=reference;
        this.prix=prix;
        this.location=location;
        this.vente=vente;
        this.nomp=nomp;
        this.noml=noml;
    }
    BienImmobilier(){
        this.reference=1;
        this.prix=10;
        this.location=false;
        this.vente=true;
        this.nomp="Anonyme";
        this.noml="Anonyme";
    }
    public int getReference(){
        return reference;
    }
    public double getPrix(){
        return prix;
    }
    public boolean estEnLocation(){
        return location;
    }
    public boolean estEnVente(){
        return vente;
    }
    public String getNomp(){
        return nomp;
    }
    public String getNoml(){
        return noml;
    }
    public void setPrix(double modPrix){
        prix = modPrix;
    }
    public void setVente(boolean modVente){
        vente = modVente;
    }
    
    public void location(String nomLocataire){
        if (location == false && vente == false){
            noml=nomLocataire;
            location=true;
        }
        else {
            System.out.println("Bâtiment déjà en location ou en vente !");
        }
    }
    public void finLocation(){
       if (location == true){
           location = false;
           noml="Anonyme";
       }
       else {
           System.out.println("Ce bâtiment n'est pas en location !");
       }
    }
    public void vente(double prixPropose, String nomProprietaire){
        if (vente == true){
            prix = prixPropose;
            nomp=nomProprietaire;
            vente=false;
            location=false; 
        }
    }
    
    public 
}
