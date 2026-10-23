package ExerciciosVetores;
import java.util.Scanner;
public class Exercicio7 {
    // 7. Desafio: E se no cenário do problema 2 eu tivesse dois vetores
    // um com os números de apartamento e outro com os nomes das empresas?
    // O cliente digita um número de apartamento, você procura na lista de números,
    // se não existe você reclama, se existe você diz qual a empresa.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = {101, 102, 103, 104, 105};

        String[] empresas = {
                "Dr. Silva, Dentista",
                "Contabilidade Silva",
                "Dr. Silva, Cardiologista",
                "Silvana Silva, Manicure",
                "Silva & Silva Advogados Associados"
        };

        System.out.print("Digite o número do escritório: ");
        int numero = scanner.nextInt();

        int indice = -1;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numero) {
                indice = i;
            }
        }

        if (indice == -1) {
            System.out.println("Escritório não encontrado.");
        } else {
            System.out.println("Empresa: " + empresas[indice]);
        }

        scanner.close();
    }
}


