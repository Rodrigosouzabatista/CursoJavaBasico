
package tiposprimitivos;

import java.util.Scanner;


public class TiposPrimitivos {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);//usando importação para teclado
        System.out.println("Digite o Nome do Aluno: ");
        String nome = teclado.nextLine();//teclado
        System.out.println("Digite a Nota do Aluno: ");
        float nota = teclado.nextFloat();//teclado
        //float nota = 8.5f;
        //String nome = "Rodrigo";
        System.out.printf("A nota é %.2f \n", nota);//formatado 
        System.out.println("A nota e " + nota +" "+ nome);//sem formatação
        System.out.format("A nota %s é %.2f \n",nome, nota);
        
        
    }
    
}
