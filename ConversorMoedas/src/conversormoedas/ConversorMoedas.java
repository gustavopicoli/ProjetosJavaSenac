package conversormoedas;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ConversorMoedas {

    public static void main(String[] args) {

        String moeda;
        moeda = JOptionPane.showInputDialog("Escolha a opção de moeda desejada: \n 1 - Euro \n 2 - Dólar \n 3 - Peso Argentino");

       
        int opcao = Integer.parseInt(moeda);

        if (opcao == 1) {
            String valor;
            valor = JOptionPane.showInputDialog("Digite o valor em REAIS que deseja converter");
            double valorReal = Double.parseDouble(valor);
            final double euro = 6.37;
            double valorConvertido = valorReal / euro;
             DecimalFormat df = new DecimalFormat("0.##");
            String dx = df.format(valorConvertido);
            String msg;
            msg = "O valor em EURO é € " + dx;
            JOptionPane.showMessageDialog(null, msg);
        }

        if (opcao == 2) {
            String valor;
            valor = JOptionPane.showInputDialog("Digite o valor em REAIS que deseja converter");
            double valorReal = Double.parseDouble(valor);
            final double dolar = 5.63;
            double valorConvertido = valorReal / dolar;
             DecimalFormat df = new DecimalFormat("0.##");
            String dx = df.format(valorConvertido);
            String msg;
            msg = "O valor em DÓLAR é US$ " + dx;
            JOptionPane.showMessageDialog(null, msg);
        }
        
        if (opcao == 3){
            String valor;
            valor = JOptionPane.showInputDialog("Digite o valor em REAIS que deseja converter");
            double valorReal = Double.parseDouble(valor);
            final double peso = 0.55;
            double valorConvertido = valorReal / peso ;            
            DecimalFormat df = new DecimalFormat("0.##");
            String dx = df.format(valorConvertido);
            String msg;
            msg = "O valor em PESO ARGENTINO é ARS " + dx;
            JOptionPane.showMessageDialog(null, msg);                  
        }


    }

}
