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
public class Test_2 {
    
    public static void main(String[] args){
        
        
        CatalogueBibliotheque cat = new CatalogueBibliotheque();
        
        ListeMembres lis = new ListeMembres();
        
        
        //<editor-fold defaultstate="collapsed" desc="DOCS">
        /*  Test Docs  */
        
        DocBibliotheque doc1 = new DocBibliotheque("fzddad", "ffsdfds", "fezfd", 2010, "b");
        DocBibliotheque doc2 = new DocBibliotheque("tyyet", "yreyre", "yttre", 2012, "b");    
        cat.addDoc(doc1);
        cat.addDoc(doc2);
        System.out.println(cat.getDoc(0));
        cat.printInfos();
//        cat.removeDoc(doc2);
//        cat.printInfos();
//        cat.removeDoc(0);
//        cat.printInfos();
        
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="MEMBERS">
        /*  Test Membres  */
        
        MembreBibliotheque mb1 = new MembreBibliotheque("toto", "ttrtr", "treret", "tretret");
        MembreBibliotheque mb2 = new MembreBibliotheque("titi", "ttrtr", "treret", "tretret");
        lis.addMember(mb1);
        lis.addMember(mb2);
        
        System.out.println(lis.getMember(1));
        
        //</editor-fold>
        
        cat.emprunterDoc(1, mb2);
        cat.reserverDoc(1, mb1);
        cat.annulerResaDoc(1, mb1);
        cat.retournerDoc(1);
        
        
    }
}
