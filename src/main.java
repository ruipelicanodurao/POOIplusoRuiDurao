import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercicios #1
        //• Somar 5 nümeros inteiros e imprimir para a consola.
        int sum = 0;
        for(int cnt = 0; cnt < 5; cnt++){
            System.out.print("Digite um numero inteiro: ");
            sum += scanner.nextInt();
        }
        System.out.println(sum);
        scanner.close();

    }
}
