package conversaodolar;

import java.util.Scanner;

public class ConversaoDolar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        double dolar, cotacao, real;
        
        System.out.println("Quantos dolares você tem: ");
        dolar = entrada.nextDouble();
        
        System.out.println("Qual é a cotação do dólar hoje: ");
        cotacao = entrada.nextDouble();
        
        real = dolar * cotacao;
        
        System.out.println("Você tem R$ " + real);
        
    }
    
}
