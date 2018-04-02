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
public class MembrePersonnel extends MembreBibliotheque{
    
    public MembrePersonnel(String nom, String prenom, String tel, String adresse){
        super(nom, prenom, tel, adresse);
    }
    
    
    @Override
    public boolean peutEmprunterAutreDocument(){
        if(nbDocEmprunte < 4){
            return true;
        }else{
            return false;
        }
    }
    
}
