import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner teclado = new
Scanner(System.in);
    System.out.print("Digite o salario:");
    double salario = teclado.nextDouble();
    double imposto = salario * 0.10;
    System.out.println("salario =" + salario);
    System.out.println("imposto =" + imposto);
    }
}
