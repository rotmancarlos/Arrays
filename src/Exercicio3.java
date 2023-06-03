import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário o primeiro número
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        // Solicitar ao usuário o segundo número
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        //Verifique e exibir na ordem decrescente
        System.out.print("Esses são os números em ordem decrescente: ");
        if (numero1 > numero2) {
            System.out.println(numero1 + "," + numero2);
        } else {
            System.out.println(numero2 + "," + numero1);
        }
    }
}
