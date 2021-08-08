/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturacondicional;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class EstruturaCondicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
      
        
        
        System.out.println("Digite o Ano do seu nascimento: ");
        int nasc = teclado.nextInt();
        System.out.println("Digite o Ano Atual: ");
        int atual = teclado.nextInt();
        
        int idade = atual - nasc;
        
        System.out.println("a sua idade é de " + idade + " Anos");
        if(idade >= 18){
            System.out.println("Você já atingiu a maioridade");
        }
        else{
                System.out.println("Você não atingiu a maioridade");
            }
        
    }
    
}
