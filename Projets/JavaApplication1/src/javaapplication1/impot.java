/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author p1706363
 */
public class impot {
    public static double impot (double revenu) {
        double resultat = 0;
        if(revenu <= 0){
            return 0;
        }
        if (revenu <= 20000) {
            resultat = 0.05*revenu;
        }
        else if (revenu <= 40000){
            resultat = 1000 + 0.1*(revenu-20000);
        }
        else if (revenu<= 60000){
            resultat = 3000 + 0.15*(revenu-40000);
        }
        else {
            resultat = 0.15*20000+3000 + 0.3*(revenu-60000);
        }
        return resultat;
    }
    public static void Mymain(){
        System.out.print("impot : ");
        System.out.println(impot(-70000));
    }
}

