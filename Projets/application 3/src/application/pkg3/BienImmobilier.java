/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.pkg3;

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
    private Proprietaire prop;
    private Locataire loc;
    
    public BienImmobilier(double p, boolean isL, boolean isV, Proprietaire prop, Locataire loc){
        nb++;
        ref = nb;
        prix = p;
        isLocation = isL;
        isVente = isV;
        this.prop = prop;
        this.loc = loc;
    }
    
    public void location(Locataire locataire){
        if(!isLocation){
            isLocation = true;
            loc = locataire;
        }else{
            System.out.println("Le bien est deja en location !");
        }
    }
    public void finLocation(){
        if(isLocation){
            isLocation = false;
            loc = null;
        }else{
            System.out.println("Le bien n'est pas en location !");
        }
    }
    public void vente(double prixPropose, Proprietaire proprietaire){
        if(isVente){
            if (prixPropose>=prix){
               isVente = false;
                prop = proprietaire; 
            }
            else{
               System.out.println("Prix trop faible"); 
            }            
        }else{
            System.out.println("Le bien n'est pas en vente !");
        }
    }
    public void setVente(boolean vente){
        if (!isLocation){
            isVente=vente;
        }
        else{
            System.out.println("Le bien est en location, et ne peut donc pas être mis en vente.");
        }
    }
    
    @Override
    public String toString(){
        String res = "";
        if(isLocation){
            if(isVente){
                res += "Ce bien est actuellement en location a " + loc.getNom() + " et en vente pour le prix de " + prix + ".";
            }else{
                res += "Ce bien est actuellement en location a " + loc.getNom() + " mais n'est pas en vente.";
            }
        }else{
            if(isVente){
                res += "Ce bien n'est pas en location mais est en vente pour le prix de " + prix + ".";
            }else{
                res += "Ce bien est actuellement ni en location ni en vente.";
            }
        }
        res += " Il appartient a " + prop.getNom() + " et il porte la référence " + ref;
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
    public Proprietaire getProp(){
        return prop;
    }
    public Locataire getLoc(){
        return loc;
    }
    
    
}
