// 3- Faça um Programa que receba o número do mês e mostre o mês correspondente. Valide mês inválido

import java.util.Scanner;

public class exercicio_03 {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            int mes;

            // 1. Loop de repetição para validar a entrada
            do {
                System.out.print("Digite o número do mês (1 a 12): ");
                mes = scanner.nextInt();

                // Mensagem de erro caso digite um mês fora do intervalo
                if (mes < 1 || mes > 12) {
                    System.out.println("Mês inválido! Digite novamente.\n");
                }
                
            // Repete o bloco ENQUANTO o mês for menor que 1 OU maior que 12
            } while (mes < 1 || mes > 12);

            // 2. A lógica de decisão continua aqui embaixo, com a garantia de que o número é válido
            switch (mes) {
                case 1:
                    System.out.println("Mês correspondente: Janeiro");
                    break;
                case 2:
                    System.out.println("Mês correspondente: Fevereiro");
                    break;
                case 3:
                    System.out.println("Mês correspondente: Março");
                    break;
                case 4:
                    System.out.println("Mês correspondente: Abril");
                    break;
                case 5:
                    System.out.println("Mês correspondente: Maio");
                    break;
                case 6:
                    System.out.println("Mês correspondente: Junho");
                    break;
                case 7:
                    System.out.println("Mês correspondente: Julho");
                    break;
                case 8:
                    System.out.println("Mês correspondente: Agosto");
                    break;
                case 9:
                    System.out.println("Mês correspondente: Setembro");
                    break;
                case 10:
                    System.out.println("Mês correspondente: Outubro");
                    break;
                case 11:
                    System.out.println("Mês correspondente: Novembro");
                    break;
                case 12:
                    System.out.println("Mês correspondente: Dezembro");
                    break;
            }
        }
    }
}