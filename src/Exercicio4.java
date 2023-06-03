import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double maiorAltura = 0;
        double menorAltura = Double.MAX_VALUE;
        double somaAlturaHomens = 0;
        int numeroMulheres = 0;

        for (int i = 0; i < 10; i++){
            System.out.print("Digite a altura da pessoa " + (i + 1) + ": ");
            double altura = scanner.nextDouble();

            System.out.print("Digite o sexo da pessoa " + (i + 1) + " (M/F): ");
            String sexo = scanner.next();

            if (altura > maiorAltura) {
                maiorAltura = altura;
            }

            if (altura < menorAltura); {
                menorAltura = altura;

            }
            if (sexo.equalsIgnoreCase("M")) {
                somaAlturaHomens += altura;
            } else if (sexo.equalsIgnoreCase("F")) {
                numeroMulheres++;
            }

        }
        double mediaAlturaHomens = somaAlturaHomens / (10 - numeroMulheres);

        System.out.println("Maior altura: " + maiorAltura);
        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Média de altura dos homens: " + mediaAlturaHomens);
        System.out.println("Número de mulheres: " + numeroMulheres);

        scanner.close();

    }
}
