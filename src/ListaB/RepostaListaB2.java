package ListaB;
import java.util.Scanner;
public class RepostaListaB2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros voce quer digitar: ");
        int quantidade =  sc.nextInt();
        sc.nextLine();
        int total = 0;
        for(int i = 1; i <= quantidade; i++){
            System.out.println("digite 0 " + i + " numero");
            int numeros = sc.nextInt();
            total = total + numeros ;
        }
        int media = total / quantidade;
        System.out.println("A media dos numeros digitados foi:  " + media);
    }
}

