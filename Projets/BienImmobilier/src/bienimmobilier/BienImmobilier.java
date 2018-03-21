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
public class BienImmobilier {
    
    private static int nb;
    private int ref;
    private double prix;
    private boolean isLocation;
    private boolean isVente;
    private String nomProp;
    private String nomLoc;
    
    public BienImmobilier(){
        nb++;
        ref = nb;
        prix = 0;
        isLocation = false;
        isVente = false;
        nomProp = "Unknown";
        nomLoc = "Unknown";
    }
    
    public BienImmobilier(double p, boolean isL, boolean isV, String nomP, String nomL){
        nb++;
        ref = nb;
        prix = p;
        isLocation = isL;
        isVente = isV;
        nomProp = nomP;
        nomLoc = nomL;
    }
    
    public void location(String nomLocataire){
        if(!isLocation){
            isLocation = true;
            nomLoc = nomLocataire;
        }else{
            System.out.println("Le bien est deja en location !");
        }
    }
    public void finLocation(){
        if(isLocation){
            isLocation = false;
            nomLoc = "Unknown";
        }else{
            System.out.println("Le bien n'est pas en location !");
        }
    }
    public void vente(double prixPropose, String nomProprietaire){
        if(isVente){
            prix = prixPropose;
            isVente = false;
            nomProp = nomProprietaire;
        }else{
            System.out.println("Le bien n'est pas en vente !");
        }
    }
    public void setVente(boolean vente){
        isVente = vente;
    }
    
    @Override
    public String toString(){
        String res = "";
        if(isLocation){
            if(isVente){
                res += "Ce bien est actuellement en location a " + nomLoc + " et en vente pour le prix de " + prix + ".";
            }else{
                res += "Ce bien est actuellement en location a " + nomLoc + " mais n'est pas en vente.";
            }
        }else{
            if(isVente){
                res += "Ce bien n'est pas en location mais est en vente pour le prix de " + prix + ".";
            }else{
                res += "Ce bien est actuellement ni en location ni en vente.";
            }
        }
        res += " Il appartient a " + nomProp + " et il porte la référence " + ref;
        return res;
    }
    
    /*  Getters  */
    public int getRef(){
        return ref;
    }
    public double getPrix(){
        return prix;
    }
    public boolean estEnLocation(){
        return isLocation;
    }
    public boolean estEnVente(){
        return isVente;
    }
    public String getNomProp(){
        return nomProp;
    }
    public String getNomLoc(){
        return nomLoc;
    }
    
    
}
