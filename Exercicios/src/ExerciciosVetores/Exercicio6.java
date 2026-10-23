package ExerciciosVetores;


    import java.util.Scanner;

    public class Exercicio6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String[] cores = {
                    "Vermelho", "Laranja", "Amarelo",
                    "Verde", "Azul", "Anil", "Violeta"
            };

            boolean[] acertadas = new boolean[cores.length];

            int acertos = 0;
            int erros = 0;

            while (acertos < 7) {
                System.out.print("Digite uma cor ou 'sair': ");
                String resposta = scanner.nextLine();

                if (resposta.equalsIgnoreCase("sair")) {
                    break;
                }

                int indice = -1;

                for (int i = 0; i < cores.length; i++) {
                    if (resposta.equalsIgnoreCase(cores[i])) {
                        indice = i;
                    }
                }

                if (indice == -1) {
                    erros++;
                    System.out.println("Cor incorreta!");
                } else if (acertadas[indice]) {
                    System.out.println("Você já acertou essa cor!");
                } else {
                    acertadas[indice] = true;
                    acertos++;
                    System.out.println("Acertou!");
                }

                System.out.println("Acertos: " + acertos);
                System.out.println("Erros: " + erros);
            }

            System.out.println("Fim do jogo!");
            System.out.println("Acertos: " + acertos);
            System.out.println("Erros: " + erros);

            scanner.close();
        }
    };


