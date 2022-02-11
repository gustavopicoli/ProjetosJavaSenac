package Classes;

public class Principal {

    public static void main(String[] args) {
        Caminhao caminhao = new Caminhao("Volvo", "FH", 2000, "540cv", 16, 2, 6);
        System.out.println("Marca:\n " + caminhao.getMarca());
        caminhao.exibirDados();

    }

}
