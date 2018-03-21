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
public class Somme2 {
    public static int calculSomme(){
        int somme = 0;
        for(int i = 1; i <= 100; i++){
            somme += i;
        }
        
        return somme;
    }
    
    public static void Mymain(){
        int theSomme = calculSomme();
        System.out.println(theSomme);
    }
   
      
}
