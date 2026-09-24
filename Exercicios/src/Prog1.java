import java.util.Scanner;

public class Prog1 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        // pede pra digitar uma palavra varias vezes
        // so para quando a pessoa responder "banana"
        String texto;
        int voltas = 0;
        do {

            System.out.println("digite qualquer palavra: ");
            texto = leitura.next();
            voltas++;// Soma mais 1 em voltas

        } while(!texto.equalsIgnoreCase("banana"));
        System.out.print("Voce tentou "+voltas+" vezes\n");
    }

}