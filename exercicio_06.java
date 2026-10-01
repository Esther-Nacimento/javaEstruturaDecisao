// 6- Escreva um Programa para ler 3 números inteiros distintos e escreva o maior entre eles

import java.util.Scanner;

public class exercicio_06 {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            // Entrada dos três números
            System.out.print("Digite o primeiro número: ");
            int num1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt();

            System.out.print("Digite o terceiro número: ");
            int num3 = scanner.nextInt();

            // Estrutura de decisão para encontrar o maior
            if (num1 > num2 && num1 > num3) {
                System.out.println("O maior número é: " + num1);
            } else if (num2 > num1 && num2 > num3) {
                System.out.println("O maior número é: " + num2);
            } else {
                // Se num1 não é o maior, e num2 também não é, por eliminação o maior é o num3
                System.out.println("O maior número é: " + num3);
            }
        }
    }
}
