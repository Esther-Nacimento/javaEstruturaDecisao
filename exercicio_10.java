// 10- Escreva um programa para ler o nome e duas notas de um aluno. Calcule e média e escreva amédia e a situação do aluno, a saber:

//✓ Média Maior ou igual a 6: “Aprovado”
//✓ Média Menor que 6: “Reprovado”.

import java.util.Scanner;

public class exercicio_10 {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            // Entrada do nome do aluno
            // Usamos nextLine() para permitir nomes compostos (com espaços)
            System.out.print("Digite o nome do aluno: ");
            String nome = scanner.nextLine();

            // Entrada das duas notas
            System.out.print("Digite a primeira nota: ");
            double nota1 = scanner.nextDouble();

            System.out.print("Digite a segunda nota: ");
            double nota2 = scanner.nextDouble();

            // Processamento: Cálculo da média
            double media = (nota1 + nota2) / 2;

            // Saída dos dados básicos
            System.out.println("\n--- Resultado ---");
            System.out.println("Aluno: " + nome);
            System.out.println("Média: " + media);

            // Estrutura de decisão para a situação do aluno
            if (media >= 6) {
                System.out.println("Situação: Aprovado");
            } else {
                System.out.println("Situação: Reprovado");
            }
        }
    }
}
