import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Exercicio #2
        //Calcular a årea de um circulo de acordo com um certo raio, e imprimir para a consola;
        //Utilizar "raio" como argumento ao compilar na consola
        //Årea de um circulo: pi * raio * raio

        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println(String.format("Área do circulo: %.2f", area));

    }
}
