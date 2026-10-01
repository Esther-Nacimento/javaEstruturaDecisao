// 17- Faça um Programa que calcule o valor da conta de luz de uma pessoa. Sabe-se que o cálculoda conta de luz segue a tabela abaixo:

// TIPO DE CLIENTE | VALOR POR KWH
// 1 Residencial | R$ 0,89
// 2 Comércio    | R$ 0,68
// 3 Indústria    | R$ 1,55

import java.util.Scanner;

public class exercicio_17 {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            // 1. Entrada de dados
            System.out.print("Digite a quantidade de KW/h consumidos no mês: ");
            double consumo = scanner.nextDouble();

            System.out.println("\n--- Tipos de Cliente ---");
            System.out.println("1 - Residência");
            System.out.println("2 - Comércio");
            System.out.println("3 - Indústria");
            System.out.print("Digite o código correspondente ao tipo de cliente (1, 2 ou 3): ");
            int tipoCliente = scanner.nextInt();

            // Variável para armazenar a tarifa de acordo com a escolha
            double tarifa = 0.0;
            boolean codigoValido = true;

            // 2. Estrutura de Decisão para definir o valor do KW/h
            switch (tipoCliente) {
                case 1:
                    tarifa = 0.89; // Residência
                    break;
                case 2:
                    tarifa = 0.68; // Comércio
                    break;
                case 3:
                    tarifa = 1.55; // Indústria
                    break;
                default:
                    System.out.println("\nErro: Código de cliente inválido.");
                    codigoValido = false; // Sinaliza que houve erro para não fazer a conta errada
                    break;
            }

            // 3. Processamento e Saída (só executa se o código estiver correto)
            if (codigoValido) {
                double valorConta = consumo * tarifa;
                
                System.out.println("\n--- Resumo da Conta ---");
                System.out.printf("Tarifa aplicada: R$ %.2f por KW/h\n", tarifa);
                System.out.printf("Valor total a pagar: R$ %.2f\n", valorConta);
            }
        }
    }
}