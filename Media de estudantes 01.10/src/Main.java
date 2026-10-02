import javax.print.attribute.standard.Media;
import java.util.Scanner;

//- leia a idade e se a pessoa é estudante (s/n)
//    - repita até o usuário informar que não deseja cadastrar outra pessoa
//    - ao final, calcule e mostre a média de idade dos estudantes
//      e a média de idade dos não estudantes

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;
        String continuar = "Sim";
String estudante;
        do {
            System.out.print("Digite a idade: ");
            idade = entrada.nextInt();

// A pessoa é estudante sim ou não .
            System.out.print("vc é estudante s/n: ");
            estudante = entrada.next();












        } while (continuar.equalsIgnoreCase("s"));


    }

}














