import java.util.Scanner;

public class mediaValores{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== Calculadora de Média ===");

        System.out.print("Digite o primeiro número: ");
        double num1 = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = entrada.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double num3 = entrada.nextDouble();

        double media = (num1 + num2 + num3) / 3;

        System.out.println("A média é: " + media);

        entrada.close();
    }
}