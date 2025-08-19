import entidades.Livro;
public class Main {
    public static void main(String[] args) {

        Livro harryPotter = new Livro("Harry Potter", "J. K. Rowling,",5, 50);
        Livro naruto = new Livro ("Naruto", "Masaki Kishimoto");

        harryPotter.emprestaLivro(1);
        naruto.emprestaLivro(1);

        System.out.println(naruto.toString());
        System.out.println(harryPotter.toString());
    }
}