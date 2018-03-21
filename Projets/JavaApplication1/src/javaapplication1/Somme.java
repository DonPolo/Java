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
public class Somme {
    
    public static void Mymain(){
        int Somme = 0;
        // calcule la somme des 100 premiers entiers
        for (int i = 1; i <= 100; i++)
        Somme = Somme + i;
        // affiche le résultat à l’écran
        System.out.println(Somme);
    }
}
