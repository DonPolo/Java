/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_suite;

import java.util.ArrayList;

/**
 *
 * @author jeanf
 */
public class CD extends DocBibliotheque{
    
    private ArrayList<String> morceaux = new ArrayList<String>();
    
    public CD(String code, String titreD, String auteur, int anneeP, String statut, ArrayList<String> morceaux){
        super(code, titreD, auteur, anneeP, statut);
        this.morceaux = morceaux;
    }
}
