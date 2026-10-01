// 7- Escrever um Programa para ler 2 números inteiros distintos e escrever o maior e o menor entre eles.

import java.util.Scanner;

public class exercicio_07 {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            // Entrada de dados
            System.out.print("Digite o primeiro número: ");
            int num1 = scanner.nextInt();

            System.out.print("Digite o segundo número (diferente do primeiro): ");
            int num2 = scanner.nextInt();

            // Estrutura de decisão para identificar o maior e o menor
            if (num1 > num2) {
                System.out.println("O maior número é: " + num1);
                System.out.println("O menor número é: " + num2);
            } else if (num2 > num1) {
                System.out.println("O maior número é: " + num2);
                System.out.println("O menor número é: " + num1);
            } else {
                // Medida de segurança caso o utilizador ignore a regra de serem "distintos"
                System.out.println("Erro: Os números informados são iguais. Por favor, digite números distintos.");
            }
        }
    }
}