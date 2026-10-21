package ExerciciosVetores;
// Crie um vetor de strings que contenha as sete cores do arco-iris e imprima usando um loop for


public class Exercicio1 {
    public static void main(String[] args) {
        String[] cores = {"vermelho","Laranja","Amarelo","verde","violeta","Lilas","Roxo",};


        System.out.println(" As sete cores do Arco irís são : ");
        for (int i = 0; i < cores.length; i++) {
            System.out.println("cores [" + i + "] = cor " + cores[i]);

        }

    }
}