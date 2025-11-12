import java.util.Scanner;
//Exercício 9
void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Introduza um número para calcular o factorial: ");
    int numero = scanner.nextInt();

    long factorialWhile = 1;
    int contador = numero;

    while (contador > 1) {
        factorialWhile *= contador;
        contador--;
    }

    long factorialFor = 1;

    for (int i = numero; i > 1; i--) {
        factorialFor *= i;
    }

    System.out.println("Factorial de " + numero + " com while: " + factorialWhile);
    System.out.println("Factorial de " + numero + " com for: " + factorialFor);

    scanner.close();
}