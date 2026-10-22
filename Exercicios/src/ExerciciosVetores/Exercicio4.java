package ExerciciosVetores;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// faça um programa peça ao usuário para informar uma cor e diga se ela está no arco-iris ou não,
// diga quantos acertos e quantos erros ele já fez até que ele acerte 7 cores ou desista.
    public class Exercicio4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Conjunto das 7 cores oficiais do arco-íris (em minúsculas)
            Set<String> coresArcoIris = new HashSet<>(Arrays.asList(
                    "vermelho", "laranja", "amarelo", "verde", "azul", "anil", "violeta"
            ));

            // Guarda os acertos únicos para não contar a mesma cor repetida
            Set<String> acertos = new HashSet<>();
            int erros = 0;

            System.out.println("=== Adivinhe as Cores do Arco-Íris ===");
            System.out.println("Digite uma cor por vez. Para desistir, digite 'sair' ou 'desisto'.\n");

            while (acertos.size() < 7) {
                System.out.print("Informe uma cor: ");
                String entrada = scanner.nextLine().trim().toLowerCase();

                // Verifica se o usuário deseja desistir
                if (entrada.equals("sair") || entrada.equals("desisto")) {
                    System.out.println("\nVocê desistiu do jogo.");
                    break;
                }

                // Aceita variações conhecidas como equivalentes
                if (entrada.equals("indigo") || entrada.equals("índigo")) entrada = "anil";
                if (entrada.equals("roxo")) entrada = "violeta";

                // Lógica de verificação de acerto/erro
                if (coresArcoIris.contains(entrada)) {
                    if (acertos.contains(entrada)) {
                        System.out.println("-> Você já havia acertado essa cor!");
                    } else {
                        acertos.add(entrada);
                        System.out.println("-> ACERTOU! '" + entrada + "' faz parte do arco-íris.");
                    }
                } else {
                    erros++;
                    System.out.println("-> ERROU! '" + entrada + "' não faz parte do arco-íris.");
                }

                // Exibe o placar a cada tentativa
                System.out.println("Placar: " + acertos.size() + " acerto(s) | " + erros + " erro(s)\n");
            }

            // Resumo final
            System.out.println("--- RESULTADO FINAL ---");
            if (acertos.size() == 7) {
                System.out.println("Parabéns! Você encontrou todas as 7 cores do arco-íris!");
            }
            System.out.println("Total de acertos: " + acertos.size() + "/7");
            System.out.println("Total de erros: " + erros);

            scanner.close();
        }
    }

