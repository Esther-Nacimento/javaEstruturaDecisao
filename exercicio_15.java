// 15- Escrever um Programa que leia três valores inteiros e informe qual o tipo de triângulo que elesformam: equilátero, isóscele ou escaleno.

// ✓ Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;
//✓ Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais. Portanto,todo triângulo equilátero é também isóscele;
//✓ Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes.

import java.util.Scanner;

public class exercicio_15 {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            // Entrada dos três valores inteiros correspondentes aos lados
            System.out.print("Digite o valor do primeiro lado: ");
            int lado1 = scanner.nextInt();

            System.out.print("Digite o valor do segundo lado: ");
            int lado2 = scanner.nextInt();

            System.out.print("Digite o valor do terceiro lado: ");
            int lado3 = scanner.nextInt();

            System.out.println("\n--- Classificação do Triângulo ---");

            // Estrutura de decisão
            // 1. Equilátero: Compara se o lado1 é igual ao lado2 E se o lado2 é igual ao lado3
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Tipo: Triângulo Equilátero");
                System.out.println("Motivo: Os comprimentos dos três lados são iguais.");
            } 
            // 2. Escaleno: Compara se o lado1 é diferente do lado2, lado1 diferente do lado3 E lado2 diferente do lado3
            else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
                System.out.println("Tipo: Triângulo Escaleno");
                System.out.println("Motivo: Os comprimentos dos seus três lados são diferentes.");
            } 
            // 3. Isósceles: Se não atendeu as regras acima, por eliminação ele tem exatamente dois lados iguais
            else {
                System.out.println("Tipo: Triângulo Isósceles");
                System.out.println("Motivo: Os comprimentos de dois lados são iguais.");
            }
        }
    }
}