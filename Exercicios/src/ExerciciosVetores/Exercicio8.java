package ExerciciosVetores;
import java.util.Scanner;
// No exercício 5, contar quantos atletas de cada categoria foram encontrados.
public class Exercicio8 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[] limites = {0, 55, 65, 75, 85, 100};

            String[] categorias = {
                    "Pena",
                    "Leve",
                    "Médio",
                    "Meio-pesado",
                    "Pesado",
                    "Super-pesado"
            };

            int[] contadores = new int[categorias.length];

            while (true) {
                System.out.print("Digite o peso do atleta (0 para encerrar): ");
                int peso = scanner.nextInt();

                if (peso == 0) {
                    break;
                }

                if (peso < 0) {
                    System.out.println("Peso inválido.");
                    continue;
                }

                int indice = 0;

                for (int i = 0; i < limites.length; i++) {
                    if (peso >= limites[i]) {
                        indice = i;
                    }
                }

                contadores[indice]++;

                System.out.println("Categoria: " + categorias[indice]);
            }

            System.out.println("\nQuantidade de atletas por categoria:");

            for (int i = 0; i < categorias.length; i++) {
                System.out.println(
                        categorias[i] + ": " + contadores[i]
                );
            }

            scanner.close();
        }
    }


