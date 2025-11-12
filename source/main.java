//Exercício 1
import java.util.Scanner;
void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Introduza o seu peso (kg): ");
    double peso = scanner.nextDouble();

    System.out.print("Introduza a sua altura (m): ");
    double altura = scanner.nextDouble();

    double imc = peso / (altura * altura);

    System.out.printf("\nO seu IMC é: %.2f\n", imc);

    if (imc < 18.5) {
        System.out.println("Categoria: Abaixo do peso");
    } else if (imc >= 18.5 && imc <= 24.9) {
        System.out.println("Categoria: Peso ideal (parabéns)");
    } else if (imc >= 25.0 && imc <= 29.9) {
        System.out.println("Categoria: Levemente acima do peso");
    } else if (imc >= 30.0 && imc <= 34.9) {
        System.out.println("Categoria: Obesidade grau I");
    } else if (imc >= 35.0 && imc <= 39.9) {
        System.out.println("Categoria: Obesidade grau II (severa)");
    } else {
        System.out.println("Categoria: Obesidade grau III (mórbida)");
    }

    scanner.close();
}