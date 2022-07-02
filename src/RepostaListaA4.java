import java.util.Scanner;
public class RepostaListaA4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Calculo para reajuste de salarios");
        System.out.println("Digite o valor do salario atual para ser reajustado: ");
    double salarioAtual =  sc.nextDouble();
    int porcentagem = 0;
    double salarioReajustado = 0;
    double totalAumento = 0;

        if(salarioAtual <= 280.00){
        totalAumento = (salarioAtual * 20) / 100;
        salarioReajustado = salarioAtual + totalAumento;
        porcentagem = 20;

    } else if (salarioAtual > 280.00 && salarioAtual <= 700.00) {
        totalAumento = (salarioAtual * 15) / 100;
        salarioReajustado = salarioAtual + totalAumento;
        porcentagem = 15;

    } else if (salarioAtual > 700.00 && salarioAtual <= 1500.00) {
        totalAumento = (salarioAtual * 10) / 100;
        salarioReajustado = salarioAtual + totalAumento;
        porcentagem = 10;

    } else {
        totalAumento = (salarioAtual * 5) / 100;
        salarioReajustado = salarioAtual + totalAumento;
        porcentagem = 5;
    }
        System.out.println("salario antes do reajuste: " + salarioAtual);
        System.out.println("porcentagem de aumento aplicada: " + porcentagem);
        System.out.println("Total de aumento: " + totalAumento);
        System.out.println("Novo salario: " + salarioReajustado);

}
}

