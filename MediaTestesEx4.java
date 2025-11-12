import java.util.Scanner;

public class MediaTestesEx4 {
    public static void main(String[] args) {
        Scanner Ex4 = new Scanner(System.in);

        System.out.print("1º Teste: ");
        double teste1 = Ex4.nextDouble();

        System.out.print("2º Teste: ");
        double teste2 = Ex4.nextDouble();

        System.out.print("3º Teste: ");
        double teste3 = Ex4.nextDouble();


        double testemedia1 = teste1 * 0.40;
        double testemedia2 = teste2 * 0.40;
        double testemedia3 = teste3 * 0.20;

        double media = testemedia1 + testemedia2 + testemedia3;
        System.out.printf("Média: %.2f %n", media);

        Ex4.close();
    }
}