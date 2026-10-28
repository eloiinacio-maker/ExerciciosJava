package ExerciciosVetores;
import java.util.Scanner;

// 2. Os alunos da escola fizeram uma votação
// para determinar o nome o mascote do time de vôlei. As opções são
// " Voto Nulo
// " Flamingo Fuleiro
// " Jacaré Juvewnal
// " Morcego Marcelo

    public class UrnaEletronica {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Vetor de candidatos com VOTO NULO na posição 0
            String[] candidatos = {
                    "VOTO NULO",
                    "FLAMINGO FULEIRO",
                    "JACARÉ JUVENAL",
                    "MORCEGO MARCELO"
            };

            // Vetor de contagem de votos (inicia com 0 em todas as posições)
            int[] votos = new int[4];
            int totalVotos = 0;

            while (true) {
                System.out.print("Informe o número do candidato (999 para encerrar): ");
                int opcao = scanner.nextInt();

                if (opcao == 999) {
                    break;
                }

                // Mapeia para 1, 2 ou 3. Se for diferente, vai para a posição 0 (VOTO NULO)
                int indice;
                if (opcao >= 1 && opcao <= 3) {
                    indice = opcao;
                } else {
                    indice = 0;
                }

                System.out.print("Confirma o voto em " + candidatos[indice] + "? (S/N): ");
                String confirma = scanner.next();

                if (confirma.equalsIgnoreCase("S")) {
                    votos[indice]++;
                    totalVotos++;
                    System.out.println("Voto Confirmado!\n");
                } else {
                    System.out.println("Voto CANCELADO!\n");
                }
            }

            // --- RELATÓRIO FINAL ---
            System.out.println("\n--- RESULTADO DA VOTAÇÃO ---");
            for (int i = 0; i < 4; i++) {
                double percentual = 0;
                if (totalVotos > 0) {
                    percentual = (votos[i] * 100.0) / totalVotos;
                }
                System.out.printf("%d - %s: %d voto(s) (%.1f%%)\n", i, candidatos[i], votos[i], percentual);
            }

            // --- APURAÇÃO DO GANHADOR (desconsiderando índice 0) ---
            int maiorVotos = -1;
            for (int i = 1; i <= 3; i++) {
                if (votos[i] > maiorVotos) {
                    maiorVotos = votos[i];
                }
            }

            // Identifica empates ou vencedor único
            int quantidadeVencedores = 0;
            String nomesVencedores = "";

            for (int i = 1; i <= 3; i++) {
                if (votos[i] == maiorVotos && maiorVotos > 0) {
                    quantidadeVencedores++;
                    if (nomesVencedores.equals("")) {
                        nomesVencedores = candidatos[i];
                    } else {
                        nomesVencedores += " e " + candidatos[i];
                    }
                }
            }

            if (maiorVotos <= 0) {
                System.out.println("Nenhum candidato recebeu votos válidos.");
            } else if (quantidadeVencedores == 1) {
                System.out.println("Vencedor: " + nomesVencedores);
            } else {
                System.out.println("Empate entre: " + nomesVencedores);
            }

            scanner.close();
        }
    }

