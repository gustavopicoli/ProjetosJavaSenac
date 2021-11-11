package dowhileex1;

import java.util.Scanner;

public class DoWhileEx1 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       boolean continuar = true;
       int opcao;
       
       do
       {
           System.out.println("\t\tMenu de opções do curso Técnico em Informatica");
           System.out.println("\t 1. Ver o menu");
           System.out.println("\t 2. Ler o menu");
           System.out.println("\t 3. Repetir o menu");
           System.out.println("\t 4. Tudo de novo");
           System.out.println("\t 5. Não li, pode repetir?");
           System.out.println("\t 0. Sair");
           System.out.println("\nInsira sua opção:");
           opcao = entrada.nextInt();
           
           if (opcao == 0) {
               continuar = false;
               System.out.println("Programa finalizado!");
               
           } else {
               System.out.printf("\n\n\n\n\n");
               
           }
       } while (continuar);
       
        
    }
    
}
