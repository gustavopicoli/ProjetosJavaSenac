package minicalculadora;

import java.util.Scanner;

public class MiniCalculadora {

    public static void main(String[] args) {
        //declarando as variaveis
        double num1, num2;
        double soma, subt, multi, divi;
        
        //Biblioteca que irá permitir a interação do usuário
        Scanner entrada = new Scanner(System.in);
        
        //Solicitar ao usuário os dois números
        System.out.println("--Mini Calculadora--");
        System.out.println("Digite um número: ");
        num1 = entrada.nextDouble();
        System.out.println("Digite outro número: ");
        num2 = entrada.nextDouble();
        
       //Especificar o que cada variavel faz
       soma = num1 + num2;
       subt = num1 - num2;
       multi = num1 * num2;
       divi = num1 / num2;
       
       //imprimir (mostrar) na tela os resultados
        System.out.println("A soma dos números " + num1 + " e " + num2 + " é: " + soma );
        System.out.println("A subtração dos números " + num1 + " e " + num2 + " é: " + subt);
        System.out.println("A multiplicação dos números " + num1 + " e " + num2 + " é: " + multi);
        System.out.println("A divisão dos números " + num1 + " e " + num2 + " é: " + divi);
        
        
        
        
    }
    
}
