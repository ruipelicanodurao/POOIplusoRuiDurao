import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Exercicio 1: Escreva um programa que pergunte ao utilizador qual é a sua altura e peso,
        //de modo a calcular o IMC, e dizer ao utilizador qual o valor e em que categoria se insere.
        //Tip: IMC = Peso / AlturaA2

        System.out.print("Digite a sua altura em metros (ex: 1.75): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite o seu peso em kg (ex: 68.5): ");
        double peso = scanner.nextDouble();

        // Calcular IMC
        double imc = peso / Math.pow(altura, 2);

        // Determinar categoria
        String categoria;
        if (imc < 18.5) {
            categoria = "Abaixo do peso";
        } else if (imc < 25) {
            categoria = "Peso normal";
        } else if (imc < 30) {
            categoria = "Excesso de peso"; // Sobrepeso
        } else if (imc < 35) {
            categoria = "Obesidade grau I";
        } else if (imc < 40) {
            categoria = "Obesidade grau II";
        } else {
            categoria = "Obesidade grau III";
        }

        System.out.println(String.format("O seu IMC é: %.2f (%s)", imc, categoria));
        scanner.close();


        //new line

    }
}