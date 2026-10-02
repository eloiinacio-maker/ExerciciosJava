import java.util.Scanner;


//- leia a idade e se a pessoa é estudante (s/n)
//    - repita até o usuário informar que não deseja cadastrar outra pessoa
//    - ao final, calcule e mostre a média de idade dos estudantes
//      e a média de idade dos não estudantes

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade;
        String estudante;
        String continuar;

        // Variáveis para acumuladores (soma das idades) e contadores
        int somaIdadeEstudantes = 0;
        int qtdEstudantes = 0;

        int somaIdadeNaoEstudantes = 0;
        int qtdNaoEstudantes = 0;

        do {
            System.out.print("Digite a idade: ");
            idade = entrada.nextInt();

            System.out.print("Você é estudante? (s/n): ");
            estudante = entrada.next();

            // Verifica se é estudante ou não e acumula os dados
            if (estudante.equalsIgnoreCase("s")) {
                somaIdadeEstudantes += idade;
                qtdEstudantes++;
            } else {
                somaIdadeNaoEstudantes += idade;
                qtdNaoEstudantes++;
            }

            // Pergunta para controlar o laço do-while
            System.out.print("Deseja cadastrar outra pessoa? (s/n): ");
            continuar = entrada.next();

        } while (continuar.equalsIgnoreCase("s"));

        // Exibição dos resultados (com validação para evitar divisão por zero)
        System.out.println("\n--- RESULTADOS ---");

        if (qtdEstudantes > 0) {
            double mediaEstudantes = (double) somaIdadeEstudantes / qtdEstudantes;
            System.out.println("Média de idade dos estudantes: " + mediaEstudantes);
        } else {
            System.out.println("Nenhum estudante foi cadastrado.");
        }

        if (qtdNaoEstudantes > 0) {
            double mediaNaoEstudantes = (double) somaIdadeNaoEstudantes / qtdNaoEstudantes;
            System.out.println("Média de idade dos não estudantes: " + mediaNaoEstudantes);
        } else {
            System.out.println("Nenhum não estudante foi cadastrado: ");

        }

    }

}






















