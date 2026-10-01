// 2- Faça um Programa que receba um número e diga se este número está no intervalo entre 100 e 200.

import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            // Entrada
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            // Decisão: Verifica se é maior/igual a 100 E menor/igual a 200
            if (numero >= 100 && numero <= 200) {
                System.out.println("O número " + numero + " está no intervalo entre 100 e 200.");
            } else {
                System.out.println("O número " + numero + " NÃO está no intervalo entre 100 e 200.");
            }
        }
    }
}

