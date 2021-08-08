/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutura02;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class Estrutura02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cc,s;
        int n;
        String resp;
        resp = "";
        cc = 1;
        s = 0;
        
        Scanner teclado = new Scanner(System.in);        
        do {
            System.out.println("Digite um Numero: ");
            n = teclado.nextInt();
            s += n;
            System.out.println("Quer Continuar [S/N]: ");
            resp = teclado.next();
            
        }while (resp.equals("S"));
        System.out.println("A soma de todos os Valores é: " + s);
        
    }
    
}
