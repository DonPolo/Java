/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_suite;

/**
 *
 * @author p1706363
 */
public class Conteneur {
    
    private DocBibliotheque docs[] = new DocBibliotheque[10];
    private int nbDocs = 0;
    
    public boolean ajouterDocument(DocBibliotheque leDocument){
        if(nbDocs >= 10){
            return false;
        }else{
            docs[nbDocs] = leDocument;
            nbDocs++;
            return true;
        }
    }
    
    public void afficherDocuments(){
        for (int i = 0; i < nbDocs; i++) {
            System.out.println(docs[i]);
        }
    }
    
    public void afficherDocuments2(){
        for(DocBibliotheque i : docs){
            if(i != null){
                System.out.println(i);
            }
        }
    }
    
    public DocBibliotheque rechercherParNumero(int nb){
        if(nb < 10 && docs[nb] != null){
            return docs[nb];
        }else{
            return null;
        }
    }
    
    public int rechercherParCode(String codeArchivage){
        int j = 0;
        for( DocBibliotheque i : docs){
            if(i.getCode().equals(codeArchivage)){
                return j;
            }
            j++;
        }
        return -1;
    }
    
    public int supprimer(String codeArchivage){
        int j = 0;
        for(DocBibliotheque i : docs){
            if(i.getCode().equals(codeArchivage)){
                for (int k = j; k < nbDocs-1; k++) {
                    docs[k] = docs[k+1];
                }
                docs[nbDocs-1] = null;
                nbDocs--;
                return j;
            }
            j++;
        }
        
        return -1;
    }
    
}
