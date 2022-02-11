package Classes;

//NOME DA CLASSE
public class Caminhao extends MeiosTransporte {

//ATRIBUTOS
    private int qtdeEixo;

//CONSTRUTOR     
    public Caminhao(String marca, String modelo, int ano, String potencia, int qtdeRodas, int portas, int qtdeEixo) {
        super(marca, modelo, ano, potencia, qtdeRodas, portas);
        this.qtdeEixo = qtdeEixo;
    }

    //GET E SET
    public int getQtdeEixo() {
        return qtdeEixo;
    }

    public void setQtdeEixo(int qtdeEixo) {
        this.qtdeEixo = qtdeEixo;
    }
    
    //METODO
    
    public void exibirDados() {
        System.out.println("O modelo do Caminhão é " + getModelo() + " e o ano de fabricaçao foi " + getAno());
    }

}
