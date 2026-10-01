// 16- Elabore um Programa que, dada a idade de um nadador, classifique-o em uma das seguintes categorias:

// Categoria | Faixa etária
//Infantil A | 5 a 7 anos
//Infantil B | 8 a 10 anos
//Juvenil A | 11 a 13 anos
//Juvenil B | 14 a 17 anos
//Sênior | 18 anos ou mais

//Apresentar mensagem “idade fora da faixa etária” quando for outro ano não contemplado.

import java.util.Scanner;

public class exercicio_16 {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            // Entrada de dados
            System.out.print("Digite a idade do nadador: ");
            int idade = scanner.nextInt();

            System.out.println("\n--- Classificação do Nadador ---");

            // Estrutura de decisão baseada na tabela
            if (idade < 5) {
                // Captura qualquer idade menor que 5 anos
                System.out.println("Mensagem: idade fora da faixa etária"); //
            } else if (idade <= 7) {
                // Como já sabemos que não é menor que 5, basta verificar o teto (7)
                System.out.println("Categoria: Infantil A"); //[cite: 11]
            } else if (idade <= 10) {
                System.out.println("Categoria: Infantil B"); //[cite: 11]
            } else if (idade <= 13) {
                System.out.println("Categoria: Juvenil A"); //[cite: 11]
            } else if (idade <= 17) {
                System.out.println("Categoria: Juvenil B"); //[cite: 11]
            } else {
                // Se passou por todas as verificações acima, obrigatoriamente tem 18 anos ou mais
                System.out.println("Categoria: Sênior"); //[cite: 11]
            }
        }
    }
}
