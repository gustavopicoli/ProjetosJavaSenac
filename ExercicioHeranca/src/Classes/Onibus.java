package Classes;

//NOME DA CLASSE
public class Onibus extends MeiosTransporte {

    //ATRIBUTOS
    private int qtdeEixo;
    private int qtdePassageiros;

    //CONSTRUTOR
    public Onibus(String marca, String modelo, int ano, String potencia, int qtdeRodas, int portas, int qtdeEixo, int qtdePassageiros) {
        super(marca, modelo, ano, potencia, qtdeRodas, portas);
        this.qtdeEixo = qtdeEixo;
        this.qtdePassageiros = qtdePassageiros;

    }

    //GET E SET
    public int getQtdeEixo() {
        return qtdeEixo;
    }

    public void setQtdeEixo(int qtdeEixo) {
        this.qtdeEixo = qtdeEixo;
    }

    public int getQtdePassageiros() {
        return qtdePassageiros;
    }

    public void setQtdePassageiros(int qtdePassageiros) {
        this.qtdePassageiros = qtdePassageiros;
    }
    
    //metodos
    
  
}
