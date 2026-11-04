import java.util.Scanner;
// FAÇA UM PROGRAMA QUE PERGUNTE A LETRA DA CATEGORIA DA CARTEIRA DE MOTORISTA
// E IMPRIMA A DESCRIÇÃO DESSA CATEGORIA.
// A PESSOA SÓ PODE INFORMAR UMA LETRA DE CADA VEZ ( NÃO PODE INFORMAR "AB" )

public class CarteiraMotorista {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);


        // FAÇA UM PROGRAMA QUE PERGUNTE A LETRA DA CATEGORIA DA CARTEIRA DE MOTORISTA

// E IMPRIMA A DESCRIÇÃO DESSA CATEGORIA.
        String Categoria = (" A moto , B carro ");


// A PESSOA SÓ PODE INFORMAR UMA LETRA DE CADA VEZ ( NÃO PODE INFORMAR "AB" )
        System.out.println("Vc Têm a categoria A ou B :");
        Categoria = leitura.next();
        if (Categoria.equalsIgnoreCase("A")) {
            System.out.println("Categoria A: Você tem habilitação para moto.");
        } else if (Categoria.equalsIgnoreCase("B")) {
            System.out.println("Categoria B: Você tem habilitação para carro.");
        } else {
            System.out.println("Categoria inválida! Por favor, digite apenas A ou B.");
        }
    }
}





