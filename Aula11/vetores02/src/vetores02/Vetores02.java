/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores02;

/**
 *
 * @author rodri
 */
public class Vetores02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int c;
        String mes[] = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
        
        int tot[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        for(c = 0; c < mes.length; c++){
            System.out.println("O mes de " + mes [c] + " Tem " + tot[c] + " Dias ao todo.");
        }
    }
    
}
