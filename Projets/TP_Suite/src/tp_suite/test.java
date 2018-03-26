/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_suite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author p1706363
 */
public class test {
    
    public static void main(String[] args){
        
        /*  Definition des documents  */
        /*
        DocBibliotheque docs[] = new DocBibliotheque[2];
        DocBibliotheque doc1 = new DocBibliotheque("A5122DESF", "Java", "Leblanc", 2015, "b");
        docs[0] = doc1;
        DocBibliotheque doc2 = new DocBibliotheque("A5122DESG", "C", "Machin", 2013, "b");
        docs[1] = doc2;
        */
        
        /*  Definitions des membres  */
        /*
        MembreBibliotheque mb[] = new MembreBibliotheque[2];
        MembreBibliotheque mb1 = new MembreBibliotheque("Lambert", "Paul", "0650258791", "25 rue bouteille");
        mb[0] = mb1;
        MembreBibliotheque mb2 = new MembreBibliotheque("Dinh", "Son Michel", "0650358791", "15 rue de la republique");
        mb[1] = mb2;
        */
        
        //<editor-fold defaultstate="collapsed" desc="Tests">
        /*  Tests  */
//        
//        printDocInfo(docs);
//        printMbInfo(mb);
//        printBibliInfos();
//        
//        /*
//        doc1.setAuteur("JOJO");
//        doc1.setAnneeParu(2012);
//        doc2.setCode("AZCKODKOCE");
//        doc2.setTitre("Base du C");
//        doc2.setStatut("r");
//        */
//        
//        /*
//        printDocInfo(docs);
//        printMbInfo(mb);
//        */
//        //getStatus(doc1);
//        
//        //doc1.retourner();
//        
//        //printDocInfo(docs);
//        //printMbInfo(mb);
//        //getStatus(doc1);
//        
//        doc1.emprunter(mb1);
//        
//        printDocInfo(docs);
//        printMbInfo(mb);
//        printBibliInfos();
//        //getStatus(doc1);
//        
//        doc1.emprunter(mb2);
//        
//        printDocInfo(docs);
//        printMbInfo(mb);
//        printBibliInfos();
//        //getStatus(doc1);
//        
//        doc1.reserver(mb2);
//        
//        printDocInfo(docs);
//        printMbInfo(mb);
//        printBibliInfos();
//        //getStatus(doc1);
//        
//        doc1.annulerRésa(mb2);
//        
//        printDocInfo(docs);
//        printMbInfo(mb);
//        printBibliInfos();
//        //getStatus(doc1);
//        
//        doc1.retourner();
//        
//        printDocInfo(docs);
//        printMbInfo(mb);
//        printBibliInfos();
//        //getStatus(doc1);
//        
//        doc1.mettreBiblio();
//        
//        printDocInfo(docs);
//        printMbInfo(mb);
//        printBibliInfos();
//        //getStatus(doc1);

            /*  Test Conteneur  */
        
        
        /*
        contain.ajouterDocument(doc1);
        contain.ajouterDocument(doc2);
        contain.afficherDocuments();
        System.out.println(contain.rechercherParCode(doc2.getCode()));
        System.out.println(contain.supprimer(doc1.getCode()));
        contain.afficherDocuments2();
        */
        //</editor-fold>
        
        
        Conteneur contain = new Conteneur();
        Scanner scan = new Scanner(System.in);
        List<MembreBibliotheque> members = new ArrayList<MembreBibliotheque>();
        
        int i = 0;
        while(i != 6){
            showMenu();
            i = scan.nextInt();
            scan.nextLine();
            if(i == 6){
                break;
            }
            switch(i){
                case 1:
                    addDoc(scan, contain);
                    break;
                case 2:
                    addMember(scan, members);
                    break;
                case 3:
                    showMembers(members);
                    break;
                case 4:
                    docMenu(contain, scan, members);
                    break;
                case 5:
                    printBibliInfos();
                    break;
                default:
                    break;
            }
        }
        
    }
    
    
    
    public static void docMenu(Conteneur contain, Scanner scan, List<MembreBibliotheque> members){
        contain.afficherDocuments();
        int i = 0;
        while(i != 7){
            showDocMenu();
            i = scan.nextInt();
            scan.nextLine();
            if(i == 7){
                break;
            }
            
            switch(i){
                case 1:
                    int nbDoc = getDoc(scan);
                    DocBibliotheque curDoc = contain.rechercherParNumero(nbDoc-1);
                    if(curDoc != null){
                        System.out.println(curDoc.getStatut());
                    }else{
                        System.out.println("Document non trouve");
                    }
                    break;
                case 2:
                    nbDoc = getDoc(scan);
                    curDoc = contain.rechercherParNumero(nbDoc-1);
                    int nbMb = getMember(scan);
                    if(members.size() >= nbMb){
                        MembreBibliotheque curMember = members.get(nbMb-1);
                        curDoc.reserver(curMember);
                    }else{
                        System.out.println("Membre introuvable");
                    }
                    break;
                    
                case 3:
                    nbDoc = getDoc(scan);
                    curDoc = contain.rechercherParNumero(nbDoc-1);
                    curDoc.retourner();
                    break;
                case 4:
                    nbDoc = getDoc(scan);
                    curDoc = contain.rechercherParNumero(nbDoc-1);
                    nbMb = getMember(scan);
                    if(members.size() >= nbMb){
                        MembreBibliotheque curMember = members.get(nbMb-1);
                        curDoc.emprunter(curMember);
                    }else{
                        System.out.println("Membre introuvable");
                    }
                    break;
                case 5:
                    nbDoc = getDoc(scan);
                    curDoc = contain.rechercherParNumero(nbDoc-1);
                    curDoc.mettreBiblio();
                    break;
                case 6:
                    nbDoc = getDoc(scan);
                    curDoc = contain.rechercherParNumero(nbDoc-1);
                    nbMb = getMember(scan);
                    if(members.size() >= nbMb){
                        MembreBibliotheque curMember = members.get(nbMb-1);
                        curDoc.annulerRésa(curMember);
                    }else{
                        System.out.println("Membre introuvable");
                    }
                    break;
                default :
                    break;
            }
        }
    }
    
    public static int getMember(Scanner scan){
        System.out.println("Selectionner un membre : ");
        int nbMb = scan.nextInt();
        scan.nextLine();
        return nbMb;
    }
    
    public static int getDoc(Scanner scan){
        System.out.println("Entrer le numero du document : ");
        int nb = scan.nextInt();
        scan.nextLine();
        return nb;
    }
    
    public static void showDocMenu(){
        System.out.println("1- Voir l'etat d'un document");
        System.out.println("2- Reserver un document");
        System.out.println("3- Retourner un document");
        System.out.println("4- Emprunter un document");
        System.out.println("5- Mettre en bibliotheque un document");
        System.out.println("6- Annuler une réservation");
        System.out.println("7- Quitter");
    }
    
    public static void showMenu(){
        System.out.println("1- Ajouter un document");
        System.out.println("2- Ajouter un membre");
        System.out.println("3- Voir tous les membres");
        System.out.println("4- Voir tous les documents");
        System.out.println("5- Afficher infos bibliotheque");
        System.out.println("6- Quitter");
    }
    
    public static void addDoc(Scanner scan, Conteneur contain){
        System.out.println("Code : ");
        String code = scan.nextLine();
        System.out.println("Titre : ");
        String titre = scan.nextLine();
        System.out.println("Auteur : ");
        String auteur = scan.nextLine();
        System.out.println("Annee de parution : ");
        int annee = scan.nextInt();
        scan.nextLine();
        DocBibliotheque newDoc = new DocBibliotheque(code, titre, auteur, annee, "b");
        if(contain.ajouterDocument(newDoc)){
            System.out.println("Le document a bien été ajouté");
        }else{
            System.out.println("Il n'y a plus de place");
        }
    }
    
    public static void addMember(Scanner scan, List<MembreBibliotheque> members){
        System.out.println("Nom : ");
        String nom = scan.nextLine();
        System.out.println("Prenom : ");
        String prenom = scan.nextLine();
        System.out.println("Telephone : ");
        String tel = scan.nextLine();
        System.out.println("Adresse : ");
        String adresse = scan.nextLine();
        MembreBibliotheque newMember = new MembreBibliotheque(nom, prenom, tel, adresse);
        members.add(newMember);
        System.out.println("Membre enregistre");
    }
    
    public static void showMembers(List<MembreBibliotheque> members){
        for(MembreBibliotheque i : members){
            System.out.println(i);
        }
    }
    
    
    
    
    
    
    public static void getStatus(DocBibliotheque doc){
        System.out.println("");
        System.out.print("Res : " + doc.estReserve());
        System.out.print(" Emp : " + doc.estEmprunte());
        System.out.print(" Bib : " + doc.estEnBibliotheque());
        System.out.print(" Pile ret : " + doc.estSurPileDeRetour());
        System.out.println(" Pile resa : " + doc.estSurPileReservation());
    }
    
    public static void printDocInfo(DocBibliotheque[] docs){
        int i = 1;
        for(DocBibliotheque d : docs){
            System.out.println("");
            System.out.println("Doc " + i + " : ");
            System.out.println(d);
            getDocMembre(d);
            i++;
        }
    }
    
    public static void printMbInfo(MembreBibliotheque[] mb){
        for(MembreBibliotheque m : mb){
            System.out.println("");
            System.out.println(m);
        }
    }
    
    public static void getDocMembre(DocBibliotheque d){
        if(d.getEmprunteur() != null){
            System.out.println("Emprunteur : " + d.getEmprunteur().getPrenom());
        }else{
            System.out.println("Pas d'emprunteur");
        }
        if(d.getReserveur() != null){
            System.out.println("Reserveur : " + d.getReserveur().getPrenom());
        }else{
            System.out.println("Pas de reserveur");
        }  
    }
    
    public static void printBibliInfos(){
        System.out.println("Docs empruntes : " + DocBibliotheque.getNbEmprunt());
        System.out.println("Docs sur la pile : " + DocBibliotheque.getNbPile());
        System.out.println("Docs sur la pile de resa : " + DocBibliotheque.getNbPileResa());
        System.out.println("Docs reserves : " + DocBibliotheque.getNbResa());
    }
    
}
