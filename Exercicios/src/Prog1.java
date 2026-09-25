import java.util.Scanner;

public class Prog1 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        // pede pra digitar uma palavra varias vezes
        // so para quando a pessoa responder "banana"
        // Desafio 1 -  imprima o numero da tentativa antes de digitar
        // Desafio 2 - Se errar 3 vezes , encerrar e dizer que a palavra secreta era "banana"
        String texto;
        int voltas = 0;
        do {

            System.out.println("digite qualquer palavra (1 chance): ");
            texto = leitura.next();
            voltas++;// Soma mais 1 em voltas
if (voltas<3){
    voltas--;
    System.out.print("digite uma palavra ("+voltas+"chance: ");
    break;
}
        } while( (voltas<=3)&&(!texto.equalsIgnoreCase("banana")) );
        System.out.print("Voce tentou "+voltas+" vezes\n");
        if (texto.equalsIgnoreCase("banana")){
            System.out.println(" Parabens vc acerto ! :  ");
        }
    }

}