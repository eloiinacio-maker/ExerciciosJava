package ExerciciosVetores;
// Crie um vetor de strings que contenha as sete cores do arco-iris e imprima usando um loop for


public class Exercicio1 {
    public static void main(String[] args) {
        String[] cores = new String[7];
        System.out.println(" Quero que vc confirme as cores: ");
        for (int i = 0; i < cores.length; i++) {
            System.out.println("Índice [" + i + "] = " + cores[i]);

        }

    }
}