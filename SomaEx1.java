import java.util.Scanner;

public class SomaEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número inteiro: ");
            int num = sc.nextInt();
            soma += num;
        }

        System.out.println("A soma dos 5 números é: " + soma);

        sc.close();
    }
}

