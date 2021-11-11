package whileexemplo2;

import java.util.Scanner;

public class WhileExemplo2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador1, contador2;

        System.out.println("-- Contagem de um número até outro --");
        System.out.println(" ** O PRIMEIRO NUMERO DEVE SER MENOR QUE O SEGUNDO **");
        System.out.println("Digite o número inicial");
        contador1 = entrada.nextInt();
        System.out.println("Digite o número final");
        contador2 = entrada.nextInt();
        
        if (contador1 <= contador2 ) {
        while (contador1 <= contador2) {
            System.out.println("Numero: " + contador1);
            contador1++;
        }
        } else
        {
            System.out.println("Segundo número menor que o primeiro!");
        }

    }

}
