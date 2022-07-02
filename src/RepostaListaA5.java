import java.util.Scanner;

public class RepostaListaA5 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um dia da semana (1 - 7):");

        int diaSemana = ler.nextInt();
        if (diaSemana == 1) {
            System.out.println("Domingo");
        } else if (diaSemana == 2) {
            System.out.println("Segunda");
        } else if (diaSemana == 3) {
            System.out.println("terça - Feira");
        } else if (diaSemana == 4) {
            System.out.println("Quarta - feira");
        } else if (diaSemana == 5) {
            System.out.println("Quinta - Feira");
        } else if (diaSemana == 6) {
            System.out.println("Sexta - Feira");
        } else if (diaSemana == 7) {
            System.out.println("Sabado");
        } else {
            System.out.println("Não é um dia da sema valido !");

        }
    }

}
