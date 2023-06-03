import java.util.ArrayList;
import java.util.List;

public class Exercicio1Array {
    public static void main(String[] args) {
        //criar a lista de Strings
        List<String> lista = new ArrayList<>();

        //Adicionando elementos na minha Lista
        lista.add("Item 1: Arroz");
        lista.add("Item 2: Batata");
        lista.add("Item 3: Peixe frito");

        //Acessando elementos na minha Lista
        System.out.println("Elemento na posição 0: " + lista.get(0));
        System.out.println("Elemento na posição 1: " + lista.get(1));
        System.out.println("Elemento na posição 2: " +lista.get(2));

        //iteração sobre a lista
        System.out.println("Iterando sobre a lista:");
        for (String item : lista) {
            System.out.println(item);}

        //Quero remover um elemento da minha lista
        lista.remove(2);
        System.out.println("Minha lista após remover o elemento na posição 1:");
        for (String item : lista) {
            System.out.println(item);
        }
    }


}
