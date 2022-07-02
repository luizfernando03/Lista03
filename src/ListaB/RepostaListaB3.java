package ListaB;
import java.util.Scanner;

public class RepostaListaB3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Digite 10 numeros e o sistema identificara qual maior e qual menor: ");
    int quantidade = 10;
    int maior = 0;
    int menor = 0;
    int[] numeros;
    numeros = new int[quantidade];

        for(int i = 0; i < quantidade; i++){
        System.out.println("digite o " + (i + 1) + " numero: ");
        numeros[i] = sc.nextInt();
        maior = numeros[i];
        menor =  numeros[i];
    }

        for(int i = 0; i < quantidade; i++){
        if(numeros[i] > maior){
            maior = numeros[i];
        } else if(numeros[i] < menor){
            menor = numeros[i];
        }
    }
        System.out.println("O maior numero digitado foi:  " + maior);
        System.out.println("O menor numero digitado foi:  " + menor);

        sc.close();
}
}

