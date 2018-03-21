/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.pkg3;

import java.util.Scanner;

/**
 *
 * @author p1706363
 */
public class Application3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        Locataire l1 = new Locataire ("Dupont", "Jacques", "3 petite rue du roulet", 400, 200);
        Proprietaire p1 = new Proprietaire ("Didier","Bertrand", "304 Baker Street", 800, 500);
        BienImmobilier bi1 = new BienImmobilier (800000,true, false, p1,l1);
        int choix=0;
        while (choix!=4){
            System.out.println("1-Affiche les informations.");
            System.out.println("2-Affiche si le bien est en vente ou en location.");
            System.out.println("3-Change l'état du bien.");
            System.out.println("4-Quitter.");
            Scanner entree = new Scanner(System.in);
            choix = entree.nextInt();
            System.out.println("Votre choix est le " + choix);
            switch (choix){
                case 1 :{
                    System.out.println(l1.toString());
                    System.out.println(p1.toString());
                    System.out.println(bi1.toString());
                    break;
                }
                case 2:{
                    if (bi1.estEnLocation()){
                        System.out.println("Le bien immobilier est en location.");
                    }
                    else {
                        System.out.println("Le bien immobilier n'est pas en location. ");
                    }
                    if (bi1.estEnVente()){
                        System.out.println("Le bien est en vente.");
                    }
                    else{
                        System.out.println("Le bien n'est pas en vente.");
                    }
                    break;
                }
                case 3:{
                    System.out.println("1- Changer l'état de la location.");
                    System.out.println("2- Changer l'état de la vente.");
                    Scanner entree2 = new Scanner(System.in);
                    int choix2=entree2.nextInt();
                    System.out.println("Votre choix est le " + choix2+".");
                    if (choix2==1 && bi1.estEnLocation()){
                        bi1.finLocation();
                        System.out.println("Le bien n'est plus en location.");
                    }
                    else if (choix2==1){
                        bi1.location(l1);
                        System.out.println("Le bien est maintenant en location à "+l1.getNom());
                    }
                    else if (choix2==2){
                        System.out.println("Vous avez changé l'état de la vente.");
                        bi1.setVente(!bi1.estEnVente());
                        String res = "Le bien ";
                        res += bi1.estEnVente()?"est en vente.":"n'est pas en vente";
                        System.out.println(res);
                    }
                    else {
                        System.out.println("Erreur.");
                    }
                    break;

                }
                case 4:{
                    System.out.println("Fin du programme.");
                    break;
                }
                default :{
                    System.out.println("Erreur.");
                }
            }
        }

        // TODO code application logic here
    }
    
}
