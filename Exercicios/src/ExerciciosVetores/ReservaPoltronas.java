package ExerciciosVetores;
    import java.util.Scanner;
 // Reserva de poltronas , Dizer se está ocupada , Resevada e imprimir o nome
    public class ReservaPoltronas {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[] poltronas = new String[20];

            for (int i = 0; i < 20; i++) {
                poltronas[i] = "";
            }

            while (true) {
                System.out.print("Poltronas livres: ");
                for (int i = 0; i < 20; i++) {
                    if (poltronas[i].equals("")) {
                        System.out.print((i + 1) + " ");
                    }
                }
                System.out.println();

                System.out.print("Informe o número da poltrona (0 para sair): ");
                int num = scanner.nextInt();

                if (num == 0) {
                    break;
                }

                if (num < 1 || num > 20) {
                    System.out.println("Aviso: Poltrona inválida!\n");
                } else if (!poltronas[num - 1].equals("")) {
                    System.out.println("Aviso: A poltrona " + num + " já está ocupada!\n");
                } else {
                    System.out.print("Informe o nome do passageiro: ");
                    String nome = scanner.next();
                    poltronas[num - 1] = nome;
                    System.out.println("Venda confirmada! Poltrona " + num + " reservada para " + nome + ".\n");
                }
            }

            // Relatório final
            System.out.println("\n--- RELATÓRIO DE OCUPAÇÃO ---");
            for (int i = 0; i < 20; i++) {
                if (!poltronas[i].equals("")) {
                    System.out.println("Poltrona " + (i + 1) + ": " + poltronas[i]);
                }
            }

            scanner.close();
        }
    }

