import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de funcionários: ");
        int quantidadeFuncionarios = scanner.nextInt();

        double[] salarios = new double[quantidadeFuncionarios];

        for (int i = 0; i < quantidadeFuncionarios; i++) {
            System.out.print("Digitar o salario do funcionário" + (i = 1) + "; ");

        }

        double mediaSalarial = calcularMediaSalarios(salarios);
        System.out.println("A média salarial da empresa é: " + mediaSalarial);

    }

    public static double calcularMediaSalarios(double[] salarios) {
        double soma = 0;
        for (double salario : salarios) {
            soma += salario;
        }
        return soma / salarios.length;


    }


    }

