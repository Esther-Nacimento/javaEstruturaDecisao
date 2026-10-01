// 9- Escrever um Programa que leia 3 valores inteiros distintos e os escreva em ordem crescente.

import java.util.Scanner;

public class exercicio_09 {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            // Entrada de dados
            System.out.print("Digite o primeiro número: ");
            int num1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt();

            System.out.print("Digite o terceiro número: ");
            int num3 = scanner.nextInt();

            // Estrutura de decisão para ordenação (Bubble Sort simplificado)
            // 1. Garante que o num1 seja menor que o num2
            if (num1 > num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }

            // 2. Garante que o num1 seja menor que o num3
            if (num1 > num3) {
                int temp = num1;
                num1 = num3;
                num3 = temp;
            }

            // 3. Garante que o num2 seja menor que o num3
            if (num2 > num3) {
                int temp = num2;
                num2 = num3;
                num3 = temp;
            }

            // Saída de dados na ordem crescente
            System.out.println("Os números em ordem crescente são: " + num1 + ", " + num2 + ", " + num3);
        }
    }
}