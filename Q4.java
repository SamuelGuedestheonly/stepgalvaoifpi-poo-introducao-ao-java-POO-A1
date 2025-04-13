import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner teclado = new
Scanner(System.in);
    System.out.print("Digite a temperatura:");
    double celcius = teclado.nextDouble();
    double farenheit = celcius *1.8 + 32;
    double kelvin = (farenheit + 459.67)/1.8;
    System.out.println("celcius ="+ celcius);
    System.out.println("farenheit =" + farenheit);
    System.out.println("kelvin =" + kelvin);
    }
}
