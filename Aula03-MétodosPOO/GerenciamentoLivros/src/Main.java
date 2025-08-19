import entidades.Livro;
public class Main {
    public static void main(String[] args) {

        Livro harryPotter = new Livro("Harry Potter", "J. K. Rowling,",5, 50);
        Livro naruto = new Livro ("Naruto", "Masaki Kishimoto");
        naruto.valor = 50;

        naruto.emprestaLivro(1);
        harryPotter.emprestaLivro(1);
        harryPotter.devolveLivro(20);
        naruto.devolveLivro(20);

        System.out.println(naruto.toString());
        System.out.println(harryPotter.toString());
    }
}