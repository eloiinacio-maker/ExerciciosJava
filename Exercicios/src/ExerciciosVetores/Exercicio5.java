package ExerciciosVetores;

import java.util.Scanner;

    public class Exercicio5 {
        public static void main(String[] airgs) {
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

            while (true) {
                System.out.print("Digite o peso do atleta (0 para sair): ");
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

                System.out.println("Categoria: " + categorias[indice]);
            }

            scanner.close();
        }
    }

