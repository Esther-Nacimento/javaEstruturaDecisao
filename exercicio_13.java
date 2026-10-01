// 13- Uma empresa concederá um aumento de salário aos seus funcionários, variável de acordo como cargo, conforme a tabela abaixo. Faça um Programa que leia o salário e o cargo de umfuncionário e calcule o novo salário. Se o cargo do funcionário não estiver na tabela, ele deverá,então, receber 40% de aumento. Mostre o salário antigo, o novo salário e a diferença.

//CÓDIGO| CARGO | PERCENTUAL 
// 101 | Gerente | 10%
// 102 | Engenheiro | 20% 
// 103 | Técnico | 30%

import java.util.Scanner;

public class exercicio_13 {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            // 1. Entrada de dados
            System.out.print("Digite o salário atual do funcionário: R$ ");
            double salarioAntigo = scanner.nextDouble();

            System.out.print("Digite o código do cargo (101, 102, 103 ou outro): ");
            int codigoCargo = scanner.nextInt();

            // Variável para armazenar a porcentagem em formato decimal (ex: 10% = 0.10)
            double percentualAumento;

            // 2. Estrutura de Decisão para definir o percentual
            switch (codigoCargo) {
                case 101: // Gerente
                    percentualAumento = 0.10;
                    break;
                case 102: // Engenheiro
                    percentualAumento = 0.20;
                    break;
                case 103: // Técnico
                    percentualAumento = 0.30;
                    break;
                default:  // Cargos que não estão na tabela recebem 40%
                    percentualAumento = 0.40;
                    break;
            }

            // 3. Processamento dos cálculos
            double diferenca = salarioAntigo * percentualAumento;
            double novoSalario = salarioAntigo + diferenca;

            // 4. Saída de dados formatada
            System.out.println("\n--- Resumo do Reajuste Salarial ---");
            // Usamos printf com %.2f para formatar os valores com duas casas decimais (padrão monetário)
            System.out.printf("Salário Antigo: R$ %.2f\n", salarioAntigo);
            System.out.printf("Diferença (Valor do Aumento): R$ %.2f\n", diferenca);
            System.out.printf("Novo Salário: R$ %.2f\n", novoSalario);
        }
    }
}