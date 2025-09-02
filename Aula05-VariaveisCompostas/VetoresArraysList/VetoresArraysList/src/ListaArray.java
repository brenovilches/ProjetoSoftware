import java.util.ArrayList;
import java.util.List;

public class ListaArray {
public static void main(String[] args) {


    List <String> listaNomes = new ArrayList<>();

    //Adicionar itens na lista
    listaNomes.add("Breno");
    listaNomes.add("Vilches");
    listaNomes.add("Rodrigues");

    System.out.println(listaNomes);

    //Adicionar itens em uma posição desejada
    listaNomes.add(0, "Pedro");
    System.out.println(listaNomes);


    //Exibindo um item da lista
    System.out.println("O primeiro nome é do " + listaNomes.get(0));

    //Remover itens de acordo com a posição
    listaNomes.remove(1);

    //Remover de acordos com o valor do item
    listaNomes.remove("Rodrigues");

    for (String nome : listaNomes) {
        System.out.println(listaNomes);
    }


    }
}
