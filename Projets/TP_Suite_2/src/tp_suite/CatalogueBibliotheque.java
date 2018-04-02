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
    
    public ArrayList<DocBibliotheque> getDocs(){
        return docs;
    }
    
    public ArrayList<DocBibliotheque> getLivres(){
        ArrayList<DocBibliotheque> doc = new ArrayList<DocBibliotheque>();
        for(DocBibliotheque i : docs){
            if(i.getClass().getName().equals("tp_suite.Livre")) doc.add(i);
        }
        return doc;
    }
    
    public ArrayList<DocBibliotheque> getCDs(){
        ArrayList<DocBibliotheque> doc = new ArrayList<DocBibliotheque>();
        for(DocBibliotheque i : docs){
            if(i.getClass().getName().equals("tp_suite.CD")) doc.add(i);
        }
        return doc;
    }
    
    public ArrayList<DocBibliotheque> getDocURLs(){
        ArrayList<DocBibliotheque> doc = new ArrayList<DocBibliotheque>();
        for(DocBibliotheque i : docs){
            if(i.getClass().getName().equals("tp_suite.DocURL")) doc.add(i);
        }
        return doc;
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
    
    public void mettreEnBiblioDoc(int indice){
        docs.get(indice).mettreBiblio();
    }
    
    public int compteLivres(){
        int i = 0;
        for(DocBibliotheque j : docs){
            if(j.getClass().getName().equals("tp_suite.Livre")) i++;
        }
        
        return i;
    }
    
    public int compteCDs(){
        int i = 0;
        for(DocBibliotheque j : docs){
            if(j.getClass().getName().equals("tp_suite.CD")) i++;
        }
        
        return i;
    }
}
