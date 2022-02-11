package Classes;

//NOME DA CLASSE
public class Carro extends MeiosTransporte {

//ATRIBUTOS    
    private String classe;
    //tipos de classe: sedan, hatch, utilitário, SUV
    private boolean completo;

    //CONSTRUTOR
    public Carro(String marca, String modelo, int ano, String potencia, int qtdeRodas, int portas, String classe, boolean completo) {
        super(marca, modelo, ano, potencia, qtdeRodas, portas);
        this.classe = classe;
        this.completo = completo;
    }

    //GET E SET
    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public boolean isCompleto() {
        return completo;
    }

    public void setCompleto(boolean completo) {
        this.completo = completo;
    }

}
