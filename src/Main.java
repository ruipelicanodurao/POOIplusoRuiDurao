import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Exercicio #3
        //Escreva um programa onde apresenta (imprime para a consola) o seu nome, idade,
        //altura, peso, utilizando o conhecimento de variaveis e impressäo das mesmas
        //Tip: Defina as variaveis corretas conforme o que é pedido (idade = int, nome = String, etc)

        int idade;
        String nome;
        double altura;
        double peso;
        System.out.println("Digite seu nome: ");
        nome = scanner.nextLine();
        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();
        System.out.println("Digite sua altura: ");
        altura = scanner.nextDouble();
        System.out.println("Digite seu peso: ");
        peso = scanner.nextDouble();
        System.out.println(String.format("Nome: %s, Idade: %d, Altura: %.2f, Peso: %.2f", nome, idade, altura, peso));
        scanner.close();
    }
}