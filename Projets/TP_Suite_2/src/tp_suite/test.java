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
        ListeMembres members = new ListeMembres();
        CatalogueBibliotheque contain = new CatalogueBibliotheque();
        
        Scanner scan = new Scanner(System.in);
        
        int loopRes = 0;
        while(loopRes != 5){
            loopRes = loop(scan, contain, members);
        }
    }
    
    public static int loop(Scanner scan, CatalogueBibliotheque contain, ListeMembres members){
        showMenu();
        int res = scan.nextInt();
        scan.nextLine();
        switch(res){
            case 1:
                addDocMenu(scan, contain);
                break;
            case 2:
                addMember(scan, members);
                break;
            case 3:
                showMembers(members);
                break;
            case 4:
                docMenu(scan, contain, members);
                break;
            case 5:
                break;
            default:
                System.out.println("Option non trouvée");
        }
        
        return res;
    }
    
    public static void docMenu(Scanner scan, CatalogueBibliotheque contain, ListeMembres members){       
        showDocs(contain);
        int i = 0;
        while( i != 6){
            showDocMenu();
            i = scan.nextInt();
            scan.nextLine();
            DocBibliotheque doc;
            MembreBibliotheque mem;
            int indice;
            switch(i){
                case 1:
                    doc = getDoc(scan, contain);
                    if(doc != null){
                        contain.removeDoc(doc);
                    }else{
                        System.out.println("Document non valide");
                    }
                    break;
                case 2 :
                    indice = getDocIndice(scan);
                    doc = contain.getDoc(i);
                    if(doc != null){
                        mem = getMember(scan, members);
                        if(mem != null){
                            contain.emprunterDoc(indice, mem);
                        }else{
                            System.out.println("Membre invalide");
                        }
                    }else{
                        System.out.println("Document invalide");
                    }
                    break;
                case 3 :
                    indice = getDocIndice(scan);
                    doc = contain.getDoc(i);
                    if(doc != null){
                        mem = getMember(scan, members);
                        if(mem != null){
                            contain.reserverDoc(indice, mem);
                        }else{
                            System.out.println("Membre invalide");
                        }
                    }else{
                        System.out.println("Document invalide");
                    }
                    break;
                case 4:
                    indice = getDocIndice(scan);
                    doc = contain.getDoc(i);
                    if(doc != null){
                        contain.retournerDoc(indice);
                    }else{
                        System.out.println("Document invalide");
                    }
                    break;
                case 5:
                    indice = getDocIndice(scan);
                    doc = contain.getDoc(i);
                    if(doc != null){
                        contain.mettreEnBiblioDoc(indice);
                    }else{
                        System.out.println("Document invalide");
                    }
                    break;
                case 6 :
                    break;
                default :
                    System.out.println("Option non valide.");
            }
        }
    }
    
    public static DocBibliotheque getDoc(Scanner scan, CatalogueBibliotheque contain){
        System.out.println("Selectionner un document : ");
        int i = scan.nextInt();
        scan.nextLine();
        DocBibliotheque res = contain.getDoc(i-1);
        return res;
    }
    
    public static int getDocIndice(Scanner scan){
        System.out.println("Selectionner un document : ");
        int i = scan.nextInt();
        scan.nextLine();
        return i;
    }
    
    public static MembreBibliotheque getMember(Scanner scan, ListeMembres members){
        System.out.println("Selectionner un membre : ");
        int i = scan.nextInt();
        scan.nextLine();
        MembreBibliotheque res = members.getMember(i-1);
        return res;
    }
    
    public static void showDocs(CatalogueBibliotheque contain){
        System.out.println("# Documents #");
        System.out.println("Livres : ");
        for(DocBibliotheque i : contain.getLivres()){
            System.out.println(i);
        }
        System.out.println("CDs : ");
        for(DocBibliotheque i : contain.getCDs()){
            System.out.println(i);
        }
        System.out.println("Documents URL : ");
        for(DocBibliotheque i : contain.getDocURLs()){
            System.out.println(i);
        }
    }
    
    public static void showMembers(ListeMembres members){
        ArrayList<MembreBibliotheque> mem = members.getMembers();
        System.out.println("# Membres #");
        for(MembreBibliotheque i : mem){
            System.out.println(i);
        }
    }
    
    public static void addMember(Scanner scan, ListeMembres members){
        showCreateMemberMenu();
        int i = scan.nextInt();
        scan.nextLine();
        if(i == 1 || i == 2){
            System.out.println("Nom : ");
            String nom = scan.nextLine();
            System.out.println("Prenom : ");
            String prenom = scan.nextLine();
            System.out.println("Telephone : ");
            String tel = scan.nextLine();
            System.out.println("Adresse : ");
            String adresse = scan.nextLine();
            MembreBibliotheque newMember;
            if(i == 1){
                newMember = new MembreEtudiant(nom, prenom, tel, adresse);
            }else{
                newMember = new MembrePersonnel(nom, prenom, tel, adresse);
            }
             
            members.addMember(newMember);
            System.out.println("Membre enregistre");
        }
    }
    
    public static void addDocMenu(Scanner scan, CatalogueBibliotheque contain){
        showCreateDocMenu();
        int res = scan.nextInt();
        scan.nextLine();
        
        switch(res){
            case 1:
                contain.addDoc(addBook(scan));
                break;
            case 2:
                contain.addDoc(addCD(scan));
                break;
            case 3:
                contain.addDoc(addURL(scan));
                break;
            default :
                System.out.println("Option non trouvée");
                addDocMenu(scan, contain);
        }
    }
    
    public static DocBibliotheque addBook(Scanner scan){
        DocBibliotheque doc;
        System.out.println("Code : ");
        String code = scan.nextLine();
        System.out.println("Titre : ");
        String titre = scan.nextLine();
        System.out.println("Auteur : ");
        String auteur = scan.nextLine();
        System.out.println("Annee de parution : ");
        int annee = scan.nextInt();
        scan.nextLine();
        System.out.println("Editeur : ");
        String editeur = scan.nextLine();
        System.out.println("Nombre de pages : ");
        int nbPages = scan.nextInt();
        scan.nextLine();
        System.out.println("ISBN : ");
        String ISBN = scan.nextLine();
        doc = new Livre(code, titre, auteur, annee, "b", editeur, nbPages, ISBN);
        return doc;
    }
    
    public static DocBibliotheque addCD(Scanner scan){
        DocBibliotheque doc;
        System.out.println("Code : ");
        String code = scan.nextLine();
        System.out.println("Titre : ");
        String titre = scan.nextLine();
        System.out.println("Auteur : ");
        String auteur = scan.nextLine();
        System.out.println("Annee de parution : ");
        int annee = scan.nextInt();
        scan.nextLine();
        ArrayList<String> morceaux = new ArrayList<String>();
        String i = "Y";
        while(i != "N"){
            System.out.println("Morceau : ");
            morceaux.add(scan.nextLine());
            System.out.println("Continuer [Y/N] ?");
            i = scan.nextLine();
        }
        doc = new CD(code, titre, auteur, annee, "b", morceaux);
        return doc;
    }
    
    public static DocBibliotheque addURL(Scanner scan){
        DocBibliotheque doc;
        System.out.println("Code : ");
        String code = scan.nextLine();
        System.out.println("Titre : ");
        String titre = scan.nextLine();
        System.out.println("Auteur : ");
        String auteur = scan.nextLine();
        System.out.println("Annee de parution : ");
        int annee = scan.nextInt();
        scan.nextLine();
        System.out.println("URL : ");
        String URL = scan.nextLine();
        System.out.println("Description : ");
        String desc = scan.nextLine();
        doc = new DocURL(code, titre, auteur, annee, URL, desc);
        return doc;
    }
    
    public static void showMenu(){
        System.out.println("### Menu ###");
        System.out.println("1- Ajouter un document");
        System.out.println("2- Ajouter un membre");
        System.out.println("3- Voir les membres");
        System.out.println("4- Voir les documents");
    }
    
    public static void showCreateDocMenu(){
        System.out.println("### Create new document ###");
        System.out.println("1- Ajouter un Livre");
        System.out.println("2- Ajouter un CD");
        System.out.println("3- Ajouter un document URL");
        System.out.println("4- Quitter");
    }
    
    public static void showDocMenu(){
        System.out.println("### Document Menu ###");
        System.out.println("1- Supprimer un document");
        System.out.println("2- Emprunter un document");
        System.out.println("3- Reserver un document");
        System.out.println("4- Retourner un document");
        System.out.println("5- Mettre en bibliotheque un document");
        System.out.println("6- Quitter");
    }
    
    public static void showCreateMemberMenu(){
        System.out.println("### Create new Member ###");
        System.out.println("1- Ajouter un etudiant");
        System.out.println("2- Ajouter un membre du personnel");
        System.out.println("3- Quitter");
    }
    
}
