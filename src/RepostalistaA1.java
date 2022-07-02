import java.util.Scanner;
public class RepostalistaA1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero1;
        int numero2;
        System.out.print("Digite o primeiro Número: ");
        numero1 = ler.nextInt();

        System.out.print("Digite o segundo Número: ");
        numero2 = ler.nextInt();

        ler.close();

        if (numero1 > numero2) {
            System.out.println("o maior numero digitado foi: " + numero1);
        }
        System.out.println("o maior numero digitado foi: " + numero2);
    }
    }


