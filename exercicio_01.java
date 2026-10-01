// 1- Faça um Programa que receba um número e mostre uma mensagem caso este número seja maior que 10

import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double numero;

            // 1. O bloco 'do' executa a leitura e a verificação inicial
            do {
                System.out.print("Digite um número (deve ser maior que zero): ");
                numero = scanner.nextDouble();

                // Mensagem de alerta caso erre
                if (numero <= 0) {
                    System.out.println("Valor inválido! Por favor, digite novamente.\n");
                }
                
            // 2. O 'while' avalia a condição: repete ENQUANTO o número for menor ou igual a 0
            } while (numero <= 0); 

            // 3. A sua sequência de decisão original continua intacta aqui embaixo
            // O programa só chega nesta linha quando o usuário finalmente digitar um número válido
            if (numero > 10) {
                System.out.println("O número é maior que 10.");
            } else {
                System.out.println("O número foi aceito, mas não é maior que 10.");
            }
        }
    }
}