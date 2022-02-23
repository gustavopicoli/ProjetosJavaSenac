package Classes;

public class Principal {

    public static void main(String[] args) {
         //Não é possível instanciar um objeto usando a classe ANIMAL pois a mesma é ABSTRATA
        //Animal herbivoros = new Animal();
        
        System.out.println("--MAMÍFERO--");
        Mamifero mamifero = new Mamifero();
        mamifero.fazerBarulho();
        mamifero.setNome("Baleia");
        System.out.println(mamifero.getNome());
        
        
        System.out.println("--AVE--");
        Ave ave = new Ave();
        ave.fazerBarulho();
        
    }

}
