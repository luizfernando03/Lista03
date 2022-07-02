import java.util.Scanner;
public class RespostaListaA2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o primeiro produto: ");
        double produto1 = ler.nextDouble();

        System.out.print("Digite o segundo produto: ");
        double produto2 = ler.nextDouble();

        System.out.print("Digite o terceiro produto: ");
        double produto3 = ler.nextDouble();

        ler.close();

        if (produto1 < produto2 && produto2 < produto3) {
            System.out.println("o menor numero digitado foi: " + produto1);
        } else if (produto2 < produto3) {
            System.out.println("o menor produto digitado foi: " + produto2);
        } else {
            System.out.println("o menor produto digitado foi: " + produto3);
        }
    }
}
