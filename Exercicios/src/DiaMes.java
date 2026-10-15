import java.util.Scanner;


// peça pra digitar o dia e o mês de vencimento
// se a data for inválida, reclame
// se está tudo ok diga "pagamento agendado"
// não precisa repetir
public class DiaMes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // esse é um jeito de declarar vetores já preenchidos
        int[] tamanhoMes = {31,28,31,30,31,30,31,31,30,31,30,31};
        String[] nomeMes = {"janeiro","fevereiro","março","abril",
                "maio","juno","julho","agosto",
                "setembro","outubro","novembro","dezembro"};

        System.out.print("Digite o dia de vencimento: ");
        int dia = entrada.nextInt();
        System.out.print("Digite o mês de vencimento: ");
        int mes = entrada.nextInt();

        // agora diga se essa data é válida
        // se o dia for maior que tamanho do mês que ele deu
        if(mes < 1 || mes > 12){
            System.out.println("ERRO: Não existe o mês "+mes);
        } else if(dia < 1 || dia > tamanhoMes[mes-1]){
            System.out.println("Não existe dia "+dia+" no mês "+nomeMes[mes-1]);
        } else {
            System.out.println("Pagamento agendado");
        }
    }
}









