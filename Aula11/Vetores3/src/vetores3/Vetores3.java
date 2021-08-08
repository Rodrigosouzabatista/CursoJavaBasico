/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores3;

import java.util.Arrays;

/**
 *
 * @author rodri
 */
public class Vetores3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num[] = {3,5,6,8,1};
        Arrays.sort(num);//Serve Para Colocar o Vetor em Ordem.
        for (int valor : num){
            
            System.out.print(valor + " ");
        }
    }
    
}
