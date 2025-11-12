import java.util.Scanner;

public class NomeEx3 {
    public static void main(String[] args) {
        Scanner Ex3 = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = Ex3.nextLine();

        System.out.print("Idade: ");
        int Idade = Ex3.nextInt();

        System.out.print("Peso: ");
        int Peso = Ex3.nextInt();

        System.out.print("Altura: ");
        double altura = Ex3.nextDouble();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + Idade);
        System.out.println("Peso: " + Peso);
        System.out.printf("Altura: %.2f %n", altura);
        Ex3.close();
    }
}