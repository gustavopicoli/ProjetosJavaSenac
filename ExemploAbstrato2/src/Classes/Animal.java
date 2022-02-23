package Classes;

public abstract class Animal {
    
    //atributos
    private String nome;
    private double peso;
    private double altura;

    //GETTERS e SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    //metodos
    public abstract void fazerBarulho();
    
        
    

}
