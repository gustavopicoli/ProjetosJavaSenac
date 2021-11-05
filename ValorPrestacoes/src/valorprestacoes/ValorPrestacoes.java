package valorprestacoes;

import java.util.Scanner;

public class ValorPrestacoes {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int prestacoes;
        double valorProduto, valorPrestacao;
        
        System.out.print("Valor do Produto: R$ ");
        valorProduto = entrada.nextDouble();
        
        System.out.println("Nº de parcelas");
        prestacoes = entrada.nextInt();
        
        valorPrestacao = valorProduto / prestacoes;
        
        System.out.println("O valor da parcela é R$" + valorPrestacao);
               
    }
    
}
