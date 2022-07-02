package ListaB;

import java.util.Scanner;

public class RepostaListaB4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce quer digitar: ");
        int quantidade = sc.nextInt();
        int total = 0;

        for (int i = 1; i <= quantidade; i++) {
            System.out.println("digite 0 " + i + " numeros");

            int numeros = sc.nextInt();
            total = total + numeros;
            System.out.println("A soma de todos os numero digitados foi : " + total);

        }
    }
}