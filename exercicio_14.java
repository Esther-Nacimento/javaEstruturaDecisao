// 14- 14) Faça um Programa que receba o nome, a idade, o sexo e o salário bruto de um funcionário.Mostre o nome e o salário líquido de acordo com a tabela de abono abaixo:

//SEXO | IDADE | ABONO(R$)
// M    | 30 anos ou mais | 100.00
// M    | Menos de 30 anos| 50.00
// F    | 30 anos ou mais | 200.00
// F    | Menos de 30 anos | 80.00

import java.util.Scanner;

public class exercicio_14 {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            // Entrada de dados
            System.out.print("Digite o nome do funcionário: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();

            System.out.print("Digite o sexo (M/F): ");
            // Lê a entrada, converte para maiúscula e captura apenas a primeira letra
            char sexo = scanner.next().toUpperCase().charAt(0);

            System.out.print("Digite o salário bruto: R$ ");
            double salarioBruto = scanner.nextDouble();

            double abono = 0.0;

            // Estruturas de decisão aninhadas para consultar a tabela de abono
            if (sexo == 'M') {
                if (idade >= 30) {
                    abono = 100.00; // Masculino, 30 anos ou mais
                } else {
                    abono = 50.00;  // Masculino, menos de 30 anos
                }
            } else if (sexo == 'F') {
                if (idade >= 30) {
                    abono = 200.00; // Feminino, 30 anos ou mais
                } else {
                    abono = 80.00;  // Feminino, menos de 30 anos
                }
            } else {
                System.out.println("Sexo não reconhecido. O abono será de R$ 0,00.");
            }

            // Processamento do Salário Líquido
            double salarioLiquido = salarioBruto + abono;

            // Saída de dados formatada
            System.out.println("\n--- Ficha do Funcionário ---");
            System.out.println("Nome: " + nome);
            System.out.printf("Salário Líquido: R$ %.2f\n", salarioLiquido);
        }
    }
}