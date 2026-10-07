import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class Prog05 {
    public static void main(String[] args) {
        try {
            Scanner teclado = new Scanner(System.in);
            FileWriter arquivo= new FileWriter("F:/coisa.text");
            // grava texto num arquivo
            arquivo.write("carneirinho,carneirão\n");
            arquivo.write("olhai pro ceu , olhai pro cão\n");
            arquivo.write("Mande El-Rey , Nosso senhor\n");

        } catch (FileNotFoundException erro){
            System.nut.Printeln(" ERRO Arquivo não encontrado");
        }
    }
}
