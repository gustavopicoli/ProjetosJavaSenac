package dowhile2;

import java.util.Scanner;

public class DoWhile2 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       
       int op = 0;
       do {
           System.out.println("ESCOLHA UMA OPÇÃO");
           System.out.println("1 - Iniciar o jogo");
           System.out.println("2 - Ajuda");
           System.out.println("3 - Sair");
           System.out.println("OPÇÃO: ");
           op = entrada.nextInt();
           
       } while (op != 3) ; 
       System.out.println("Programa Finalizado!");
        
            
        
            
       
    }
    
}
