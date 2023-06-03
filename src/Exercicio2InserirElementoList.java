import java.util.ArrayList;
import java.util.List;

public class Exercicio2InserirElementoList {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);

        int elementToInsert = 13;
        int positionToInsert = 3;

        // A Posição é válida

        if (positionToInsert >= 0 && positionToInsert <= numbers.size()) {
            numbers.add(positionToInsert, elementToInsert);
            System.out.println("O Elemento foi inserido com sucesso!");

        } else {
            System.out.println("Essa posição é inválida!");
        }
        System.out.println("Lista atualizada: " + numbers);

    }
}
