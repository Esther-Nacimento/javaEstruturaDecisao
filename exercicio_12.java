// 12- Escreva um Programa que receba o número de identificação, as 3 notas obtidas por um alunonas 3 verificações e a média dos exercícios (ME) que fazem parte da avaliação. Calcular amédia de aproveitamento (MA), usando a fórmula:MA = (Nota1 + Nota2 x 2 + Nota3 x 3 + ME )/7A atribuição de conceitos obedece a tabela abaixo:

// MÉDIA DE APROVEITAMENTO | CONCEITO
// 9,0                     | A
// 7,5 < 9,0               | B  
// 6,0 < 7,5               | C
// 4,0 < 6,0               | D
//  < 4,0                  | E

// O Programa deve escrever o número do aluno, suas notas, a média dos exercícios, a médiade aproveitamento, o conceito correspondente e a mensagem: APROVADO se o conceitofor A ,B ou C e REPROVADO se o conceito for D ou E.

import java.util.Scanner;

public class exercicio_12 {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            // 1. Entrada de dados
            System.out.print("Digite o número de identificação do aluno: ");
            String idAluno = scanner.nextLine();

            System.out.print("Digite a Nota 1: ");
            double nota1 = scanner.nextDouble();

            System.out.print("Digite a Nota 2: ");
            double nota2 = scanner.nextDouble();

            System.out.print("Digite a Nota 3: ");
            double nota3 = scanner.nextDouble();

            System.out.print("Digite a Média dos Exercícios (ME): ");
            double me = scanner.nextDouble();

            // 2. Processamento: Cálculo da Média de Aproveitamento (MA)
            // Lembre-se de colocar o 7.0 para garantir que o Java trate a divisão como decimal
            double ma = (nota1 + (nota2 * 2) + (nota3 * 3) + me) / 7.0;

            // 3. Estrutura de Decisão: Atribuição de Conceito
            // Ao verificar do maior para o menor, não precisamos usar && (E) para limitar o teto
            String conceito;
            if (ma >= 9.0) {
                conceito = "A";
            } else if (ma >= 7.5) { // O código só chega aqui se for MENOR que 9.0
                conceito = "B";
            } else if (ma >= 6.0) { // Só chega aqui se for MENOR que 7.5
                conceito = "C";
            } else if (ma >= 4.0) { // Só chega aqui se for MENOR que 6.0
                conceito = "D";
            } else {                // O que sobrar é estritamente MENOR que 4.0
                conceito = "E";
            }

            // 4. Estrutura de Decisão: Situação (Aprovado ou Reprovado)
            String situacao;
            if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
                situacao = "APROVADO";
            } else {
                situacao = "REPROVADO";
            }

            // 5. Saída de dados formatada
            System.out.println("\n--- Resumo do Aluno ---");
            System.out.println("ID do Aluno: " + idAluno);
            System.out.println("Notas: " + nota1 + " | " + nota2 + " | " + nota3);
            System.out.println("Média dos Exercícios (ME): " + me);
            System.out.printf("Média de Aproveitamento (MA): %.2f\n", ma);
            System.out.println("Conceito: " + conceito);
            System.out.println("Situação: " + situacao);
        }
    }
}