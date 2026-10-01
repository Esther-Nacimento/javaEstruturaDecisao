// 11- 11) Dado o nome de um estudante, com o respectivo número de matrícula e três notas, desenvolvaum Programa para calcular a nota final e a classificação de cada estudante. A classificação édada conforme a tabela abaixo:

// NOTA FINAL | CLASSIFICAÇÃO
// [8, 10]    | A 
// [7, 8)     | B
// [6, 7)     | C
// [5, 6)     | D
// [0, 5)     | E

//Imprima o nome do estudante, com o seu número, nota final e classificação.

import java.util.Scanner;

public class exercicio_11 {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            // Entrada de dados em texto
            System.out.print("Digite o nome do estudante: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o número de matrícula: ");
            String matricula = scanner.nextLine();

            // Entrada de dados numéricos
            System.out.print("Digite a primeira nota: ");
            double nota1 = scanner.nextDouble();

            System.out.print("Digite a segunda nota: ");
            double nota2 = scanner.nextDouble();

            System.out.print("Digite a terceira nota: ");
            double nota3 = scanner.nextDouble();

            // Processamento: Cálculo da média (Nota Final)
            double notaFinal = (nota1 + nota2 + nota3) / 3;

            // Estrutura de decisão em cascata (do maior para o menor)
            String classificacao;
            if (notaFinal >= 8.0) {
                classificacao = "A";
            } else if (notaFinal >= 7.0) {
                classificacao = "B";
            } else if (notaFinal >= 6.0) {
                classificacao = "C";
            } else if (notaFinal >= 5.0) {
                classificacao = "D";
            } else {
                classificacao = "E";
            }

            // Saída de dados formatada
            System.out.println("\n--- Boletim do Estudante ---");
            System.out.println("Nome: " + nome);
            System.out.println("Matrícula: " + matricula);
            System.out.printf("Nota Final: %.2f\n", notaFinal); // %.2f limita a 2 casas decimais
            System.out.println("Classificação: " + classificacao);
        }
    }
}

