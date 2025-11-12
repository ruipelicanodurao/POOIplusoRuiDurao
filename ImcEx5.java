import java.util.Scanner;

public class ImcEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu peso (kg): ");
        double peso = sc.nextDouble();

        System.out.print("Digite a sua altura (m): ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("O seu IMC é: %.2f%n", imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Classificação: Peso ideal (parabéns)");
        } else if (imc <= 29.9) {
            System.out.println("Classificação: Levemente acima do peso");
        } else if (imc <= 34.9) {
            System.out.println("Classificação: Obesidade grau I");
        } else if (imc <= 39.9) {
            System.out.println("Classificação: Obesidade grau II (severa)");
        } else {
            System.out.println("Classificação: Obesidade grau III (mórbida)");
        }

        sc.close();
    }
}
