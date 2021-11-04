package mediaaluno;

import java.util.Scanner;

public class MediaAluno {

    public static void main(String[] args) {
       
        Scanner entrada = new Scanner (System.in);
        String aluno;
        double nota1, nota2, nota3,soma, media;
        
        System.out.println("Informe seu nome");
        aluno = entrada.nextLine();
        
        System.out.println("Digite sua primeira nota:");
        nota1 = entrada.nextDouble();
        
        System.out.println("Digite sua segunda nota");
        nota2 = entrada.nextDouble();
        
        System.out.println("Digite sua terceira nota");
        nota3 = entrada.nextDouble();
        
        soma = nota1 + nota2 + nota3;
        media = soma / 3;
        
        System.out.println(aluno + ", Sua média é: " + media);
        
        
    }
    
}
