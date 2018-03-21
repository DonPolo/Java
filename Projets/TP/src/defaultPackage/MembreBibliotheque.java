/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defaultPackage;

/**
 *
 * @author p1706363
 */
public class MembreBibliotheque {
    
    static int dernierNumeroAbonne = 0;
    
    private String nom;
    private String prenom;
    private String tel;
    private String adresse;
    private int numAbo;
    
    public MembreBibliotheque(String nom, String prenom, String tel, String adresse){
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.adresse = adresse;
        dernierNumeroAbonne++;
        this.numAbo = dernierNumeroAbonne;
    }
    
    //<editor-fold defaultstate="collapsed" desc="GETTERS">
    public String getNom(){
        return nom;
    }
    
    public String getPrenom(){
        return prenom;
    }
    
    public String getTel(){
        return tel;
    }
    
    public String getAdresse(){
        return adresse;
    }
    
    public int getNumAbo(){
        return numAbo;
    }
    //</editor-fold>
    
    @Override
    public boolean equals(Object obj){
        if(obj instanceof MembreBibliotheque){
            MembreBibliotheque o = (MembreBibliotheque)obj;
            return this.numAbo == o.getNumAbo();
        }else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        String res = "Membre " + numAbo + " : " + prenom + " " + nom + " tel : " + tel + " adresse : " + adresse;
        return res;
    }
    
}
