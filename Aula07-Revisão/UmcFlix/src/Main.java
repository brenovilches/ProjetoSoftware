import entidades.Filme;
import entidades.Genero;
import entidades.Serie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("INFORME O REGISTRO: ");
        System.out.println("1 - FILME");
        System.out.println("2 - SÉRIE");
        int opcao = in.nextInt();

        // Limpar o buffer após o nextInt()
        in.nextLine();

        System.out.println("Informe o nome do Filme/Série");
        String nome = in.nextLine();

        System.out.println("Informe o Gênero: ");
        // Aqui, assumindo que a classe Genero tem um método valueOf()
        Genero genero = Genero.valueOf(in.nextLine().toUpperCase());  // Conversão para maiúsculas para evitar erro

        System.out.println("Informe o diretor: ");
        String diretor = in.nextLine();

        System.out.println("Informe a classificação: ");
        int classificacao = in.nextInt();

        // Limpar o buffer após o nextInt()
        in.nextLine();

        System.out.println("Informe o protagonista: ");
        String protagonista = in.nextLine();

        if (opcao == 1) {  // Caso seja um filme
            System.out.println("Informe a duração do filme (em minutos): ");
            int duracao = in.nextInt();

            // Criar o objeto Filme
            Filme filme = new Filme(nome, protagonista, genero, diretor, classificacao, duracao);

            // Exibir as informações do filme
            System.out.println(filme.toString());

        } else if (opcao == 2) {  // Caso seja uma série
            System.out.println("Informe quantidade de temporadas: ");
            int temporadas = in.nextInt();

            System.out.println("Informe a quantidade de episódios: ");
            int episodios = in.nextInt();

            // Criar o objeto Serie
            Serie serie = new Serie(nome, protagonista, genero, diretor, classificacao, String.valueOf(temporadas), String.valueOf(episodios));

            // Exibir as informações da série
            System.out.println(serie.toString());

        } else {
            System.out.println("Opção inválida!");
        }

        // Fechar o scanner
        in.close();
    }
}
