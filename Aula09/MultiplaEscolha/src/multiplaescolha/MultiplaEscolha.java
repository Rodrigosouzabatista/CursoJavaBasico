
package multiplaescolha;

import java.util.Scanner;

public class MultiplaEscolha {

    public static void main(String[] args) {
        
        String tipo;
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Escolha Uma quantidade de pernas: ");
        int perna = tec.nextInt();
        System.out.print("Isso é um (a) ");
        
        switch (perna){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bipeds";
                break;
            case 3:
                tipo = "Tripe";
                break;
            case 4:
                tipo = "Quadrupide";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
                break;
        }
        System.out.println(tipo);
        
    }
    
}
