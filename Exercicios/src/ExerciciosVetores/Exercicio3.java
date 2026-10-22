package ExerciciosVetores;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio3 {

// Um professor precisa de um programa para calcular médias. O programa pergunta quantas notas,
// cria um vetor de doubles com esse tamanho, pede para digitar cada uma das notas.
// Depois disso ele imprime todas as notas usando um loop for e calcula a média, que imprime no final.


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Quantas notas deseja inserir? ");
        int quantidade = scanner.nextInt();

        double[] notas = new double[quantidade];
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        double soma = 0.0;
        System.out.println("\n--- Notas Digitadas ---");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
            soma += notas[i];
        }

        double media = soma / quantidade;
        System.out.printf(Locale.US, "\nMédia final: %.2f\n", media);

        scanner.close();
    }
}
