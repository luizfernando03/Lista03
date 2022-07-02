package ListaB;
import java.util.Scanner;
public class RepostaListaB7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n;
        System.out.printf("Informe um número inteiro n: ");
        n = ler.nextInt();

        if (ehPrimo(n)){
            System.out.println("é primo");
        }else{
            System.out.println("não é primo");
        }

    }
    private static boolean ehPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;
        }
        return true;
    }

}

