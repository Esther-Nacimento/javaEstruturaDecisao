// 4- Escrever um Programa para ler 2 números inteiros e escrever o maior entre eles.

import java.util.Scanner;

public class exercicio_04 {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            // Entrada do primeiro número
            System.out.print("Digite o primeiro número: ");
            int num1 = scanner.nextInt();

            // Entrada do segundo número
            System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt();

            // Estrutura de decisão para encontrar o maior
            if (num1 > num2) {
                System.out.println("O maior número é: " + num1);
            } else if (num2 > num1) {
                System.out.println("O maior número é: " + num2);
            } else {
                // Prevenção caso o utilizador digite números iguais (o exercício 5 foca nisto)
                System.out.println("Os números digitados são iguais.");
            }
        }
    }
}