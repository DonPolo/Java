/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversions;

/**
 *
 * @author p1706363
 */
public class Conversions {
    public static void Convers (char c){
        if ((c >= 'a') && (c<='z') || (c>='à') && (c<='ý')){
            System.out.print(c+ " est une minuscule.");
        }
        else if ((c>='A') && (c<='Z') || (c>='À') && (c<='Ý')){
            System.out.print(c+ " est une majuscule.");            
        }
        else{
            System.out.print(c+ " n'est pas une lettre.");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Convers('É');
    }
    
}
