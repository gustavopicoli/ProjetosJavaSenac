package maiormenor2;

import java.util.Scanner;

public class MaiorMenor2 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        //variaveis
        int x1;
        int x2;
        
        //solicitar o primeiro número para o usuário
        System.out.println("Digite o primeiro número:");
        x1 = entrada.nextInt();
        
        //solicitar o segundo número para o usuário
        System.out.println("Digite o segundo número:");
        x2 = entrada.nextInt();
        
        if (x1 > x2) {
            System.out.println(x1 + " é o maior número");
        
        } else {
            System.out.println(x2 + " é o maior número");
        }
        
    }

}
