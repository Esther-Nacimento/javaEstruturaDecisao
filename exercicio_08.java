// 8-  Escrever um Programa para ler 3 números inteiros distintos e escrever o maior e o menor entreeles.

import java.util.Scanner;

public class exercicio_08 {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            // Entrada de dados
            System.out.print("Digite o primeiro número : ");
            int num1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt();

            System.out.print("Digite o terceiro número: ");
            int num3 = scanner.nextInt();

            // Assumimos como ponto de partida que o num1 é tanto o maior quanto o menor
            int maior = num1;
            int menor = num1;

            // Comparações para atualizar o MAIOR número
            if (num2 > maior) {
                maior = num2;
            }
            if (num3 > maior) {
                maior = num3;
            }

            // Comparações para atualizar o MENOR número
            if (num2 < menor) {
                menor = num2;
            }
            if (num3 < menor) {
                menor = num3;
            }

            // Saída de dados
            System.out.println("O maior número é: " + maior);
            System.out.println("O menor número é: " + menor);
        }
    }
}