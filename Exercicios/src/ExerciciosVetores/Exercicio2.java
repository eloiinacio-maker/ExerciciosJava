package ExerciciosVetores;
// Faça um programa que tenha um vetor com os nomes das empresas (sem os números). Em seguida, pergunte o número do escritório e, se esse número existir, imprima qual a empresa que está nele.
public class Exercicio2 {
    public static void main(String[] args) {
        String[] sala  = {
                "Dr. Silva,Dentista",
                "Contabilidade Silva",
                "Dr.Silva Cardiologista",
                "Monica Silva, Manicure",
                "Silva & Silva Advogados associados"};

        System.out.println(" digite o n° da sala: ");
        for (int i = 0; i < sala.length; i++) {
            System.out.println("sala [" + i + "] = " + sala[i]);

        }

    }}

