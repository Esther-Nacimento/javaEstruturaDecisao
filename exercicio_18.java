// 18-  Faça um Programa que leia o nome, o sexo, a altura e a idade de uma pessoa. Calcule e mostre o nome e o seu peso ideal de acordo com as seguintes características da pessoa:

/*
 * TABELA DE CÁLCULO DO PESO IDEAL:
 *
 * SEXO      | ALTURA (h) | IDADE            | FÓRMULA
 * -----------------------------------------------------------------
 * Masculino | h > 1.70   | Até 20 anos      | (72.7 * h) - 58
 *           |            | 21 a 39 anos     | (72.7 * h) - 53
 *           |            | 40 anos ou mais  | (72.7 * h) - 45
 *           |------------------------------------------------------
 *           | h <= 1.70  | Até 40 anos      | (72.7 * h) - 50
 *           |            | Mais de 40 anos  | (72.7 * h) - 58
 * -----------------------------------------------------------------
 * Feminino  | h > 1.50   | (Qualquer idade) | (62.1 * h) - 44.7
 *           |------------------------------------------------------
 *           | h <= 1.50  | 35 anos ou mais  | (62.1 * h) - 45
 *           |            | Menos de 35 anos | (62.1 * h) - 49
 */

import java.util.Scanner;

public class exercicio_18 {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            // 1. Entrada de dados
            System.out.print("Digite o nome da pessoa: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o sexo (M para Masculino, F para Feminino): ");
            char sexo = scanner.next().toUpperCase().charAt(0);

            System.out.print("Digite a altura em metros (ex: 1,75): ");
            double h = scanner.nextDouble();

            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();

            double pesoIdeal = 0.0;
            boolean dadosValidos = true;

            // 2. Processamento: Estrutura de Decisão Aninhada
            if (sexo == 'M') {
                // Lógica para Homens[cite: 13]
                if (h > 1.70) {
                    if (idade <= 20) {
                        pesoIdeal = (72.7 * h) - 58;
                    } else if (idade <= 39) {
                        pesoIdeal = (72.7 * h) - 53;
                    } else {
                        pesoIdeal = (72.7 * h) - 45;
                    }
                } else { // h <= 1.70
                    if (idade <= 40) {
                        pesoIdeal = (72.7 * h) - 50;
                    } else {
                        pesoIdeal = (72.7 * h) - 58;
                    }
                }
            } else if (sexo == 'F') {
                // Lógica para Mulheres
                if (h > 1.50) {
                    // Para mulheres com mais de 1.50m, a idade não altera a fórmula na tabela
                    pesoIdeal = (62.1 * h) - 44.7;
                } else { // h <= 1.50
                    if (idade >= 35) {
                        pesoIdeal = (62.1 * h) - 45;
                    } else {
                        pesoIdeal = (62.1 * h) - 49;
                    }
                }
            } else {
                System.out.println("Erro: Sexo inválido. Digite M ou F.");
                dadosValidos = false; // Impede que o programa imprima um peso zerado
            }

            // 3. Saída de dados formatada
            if (dadosValidos) {
                System.out.println("\n--- Resultado do Cálculo ---");
                System.out.println("Nome: " + nome);
                System.out.printf("Peso Ideal: %.2f kg\n", pesoIdeal);
            }
        }
    }
}