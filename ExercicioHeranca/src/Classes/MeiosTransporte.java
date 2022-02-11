//SUPER CLASSE
package Classes;

//NOME DA CLASSE
public class MeiosTransporte {

    //ATRIBUTOS
    private String marca;
    private String modelo;
    private int ano;
    private String potencia;
    private int qtdeRodas;
    private int portas;

    //CONSTRUTOR
    public MeiosTransporte(String marca, String modelo, int ano, String potencia, int qtdeRodas, int portas) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.potencia = potencia;
        this.qtdeRodas = qtdeRodas;
        this.portas = portas;
    }

    //GET E SET
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public int getQtdeRodas() {
        return qtdeRodas;
    }

    public void setQtdeRodas(int qtdeRodas) {
        this.qtdeRodas = qtdeRodas;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

}
