// 5- Escrever um Programa para ler 2 números inteiros e escrever o maior entre eles. Caso sejamiguais, escreva a mensagem: “São iguais”.

import java.util.Scanner;

public class exercicio_05 {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            // Entrada do primeiro número
            System.out.print("Digite o primeiro número inteiro: ");
            int num1 = scanner.nextInt();

            // Entrada do segundo número
            System.out.print("Digite o segundo número inteiro: ");
            int num2 = scanner.nextInt();

            // Estrutura de decisão
            if (num1 > num2) {
                System.out.println("O maior número é: " + num1);
            } else if (num2 > num1) {
                System.out.println("O maior número é: " + num2);
            } else {
                // Se não é maior nem menor, obrigatoriamente são iguais
                System.out.println("São iguais");
            }
        }
    }
}
