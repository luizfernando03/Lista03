package ListaB;
import java.util.Scanner;

public class RepostaListaB8 {
    public static void main(String[] args) {
        int total = 0;

        Scanner sc = new Scanner(System.in);

        for (int x = 0; x < 5; x++) {
            System.out.println("Digite um numero");
            int numero = sc.nextInt();

            if ((numero % 2 != 0)) {
                total = total + numero;

                System.out.println("A Soma dos numeros impares é: " + total);

            }

        }
    }
}