package ListaB;
import java.util.Scanner;
public class RepostaListaB6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Softwere que determina a soma de numeros impar num intervalo: ");
        System.out.println("Digite o intervalo inicial: ");
        int inicio = sc.nextInt();
        System.out.println("Digite o intervalo final: ");
        int fim = sc.nextInt();
        int totalImpares = 0;

        for (int i = inicio; i <= fim; i++){
            if (i % 2 == 1){
                totalImpares = totalImpares + i;
            }
        }

        System.out.println("O soma de todos numeros impares foi:  " + totalImpares);

        sc.close();
    }
}

