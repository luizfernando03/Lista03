import java.util.Scanner;
public class RespostaListaa3 {
    public static void main(String[] args) {
        double nota1,nota2,media;

        Scanner ler = new Scanner(System.in);

        System.out.println("digite nota 1 ?");
        nota1 = ler.nextDouble();

        System.out.println("digite nota 2 ?");
        nota2 = ler.nextDouble();

        media = (nota1+nota2) / 2;

        System.out.println("A media do aluno é :"+ media );

        ler.close();

        if (media == 10 ) {
            System.out.println(" Aprovado com Disteinção");
        }else if (media >= 7){
           System.out.println("o aluno esta aprovado");
        }else {
            System.out.println("O aluno esta reprovado");
        }

    }
}
