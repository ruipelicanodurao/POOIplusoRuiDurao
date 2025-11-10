import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Exercicio 2: Escreva um programa que pergunte ao utilizador por 3 nümeros inteiros
        //quaisquer, e o programa deverå imprimir esses mesmos nümeros por ordem crescente;
        //Tip: Utilize variåveis auxiliares

        int num1, num2, num3;
        System.out.println("Digite o primeiro número inteiro:");
        num1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        num2 = scanner.nextInt();

        System.out.println("Digite o terceiro número inteiro:");
        num3 = scanner.nextInt();

        int aux;
        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
        if (num1 > num3) {
            aux = num1;
            num1 = num3;
            num3 = aux;
        }

        if (num2 > num3) {
            aux = num2;
            num2 = num3;
        }

        System.out.println(String.format("Numeros por ordem crescente: %d %d %d", num1, num2, num3));



    }
}