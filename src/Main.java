import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Escreva um programa que imprima a nota de 3 testes na consola e calcule a nota final
        //das avaliacöes desse mesmo aluno, sabendo que o teste A e B valem 40%, mas o teste C
        //vale 20%. Calcule tambem a média entre os 3 testes.
        //Tip: multiplique o valor da nota escolhida aleatoriamente pela percentagem que equivale

        float teste_A;
        float teste_B;
        float teste_C;
        double media;
        float nota_final;
        System.out.println("Insira a nota do primeiro teste: ");
        teste_A = scanner.nextFloat();

        System.out.println("Insira a nota do segundo teste: ");
        teste_B = scanner.nextFloat();

        System.out.println("Insira a nota do terceiro teste: ");
        teste_C = scanner.nextFloat();

        nota_final = teste_A * 0.4f + teste_B * 0.4f + teste_C * 0.2f;
        media = (teste_A + teste_B + teste_C) / 3;
        System.out.println(String.format("Nota final do aluno: %.2f, media: %.2f", nota_final, media));
    }
}