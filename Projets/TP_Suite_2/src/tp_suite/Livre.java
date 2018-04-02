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
public class Livre extends DocBibliotheque{
    
    private String editeur;
    private int nbPages;
    private String ISBN;
    
    public Livre(String code, String titreD, String auteur, int anneeP, String statut, String editeur, int nbPages, String ISBN){
        super(code, titreD, auteur, anneeP, statut);
        this.editeur = editeur;
        this.nbPages = nbPages;
        this.ISBN = ISBN;
    }
    
    public String toString(){
        return super.toString() + " Editeur : " + editeur + " Pages : " + nbPages + " ISBN : " + ISBN;
    }
}
