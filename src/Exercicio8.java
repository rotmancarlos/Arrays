import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digitar um número inteiro: ");
        int number = scanner.nextInt();

        //converter o número em uma string
        String numberString = String.valueOf(number);

        //Criar um array para armazenar os digitos do número
        char[] digits = numberString.toCharArray();

        System.out.print("Número invertido: ");

        //Exibir os digitos do array na ordem inversa
        for (int i = digits.length -1; i>= 0; i--) {
            System.out.print(digits[i]);
        }

        scanner.close();



    }
}
