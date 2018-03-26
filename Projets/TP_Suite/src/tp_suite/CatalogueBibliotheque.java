/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_suite;

import java.util.ArrayList;

/**
 *
 * @author p1706363
 */
public class CatalogueBibliotheque {
    
    private ArrayList<DocBibliotheque> docs;
    
    public CatalogueBibliotheque(){
        docs = new ArrayList<DocBibliotheque>();
    }
    
    public void addDoc(DocBibliotheque doc){
        docs.add(doc);
    }
    
    public void removeDoc(DocBibliotheque doc){
        docs.remove(doc);
    }
    
    public void removeDoc(int doc){
        docs.remove(doc);
    }
    
    public DocBibliotheque getDoc(int doc){
        if(docs.size() > doc){
            return docs.get(doc);
        }else{
            return null;
        }
    }
    
    public void printInfos(){
        System.out.println("Le catalogue contient " + docs.size() + " documents.");
    }
    
    public void emprunterDoc(int indice, MembreBibliotheque mb){
        docs.get(indice).emprunter(mb);
    }
    
    public void retournerDoc(int indice){
        docs.get(indice).retourner();
    }
    
    public void reserverDoc(int indice, MembreBibliotheque mb){
        docs.get(indice).reserver(mb);
    }
    
    public void annulerResaDoc(int indice, MembreBibliotheque mb){
        docs.get(indice).annulerRésa(mb);
    }
    
    
}
