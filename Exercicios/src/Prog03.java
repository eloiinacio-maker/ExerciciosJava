import java.util.Scanner;

public class Prog03 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner (System.in);

        System.out.printf("digite um numero: ");
        int numero = leitura .nextInt();
        System.out.println("Você digitou "+numero);

        leitura.close ();
    }
}
