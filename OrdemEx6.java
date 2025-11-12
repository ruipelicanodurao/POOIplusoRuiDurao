import java.util.Scanner;

public class OrdemEx2 {
    public static void main(String[] args) {
        Scanner Ex2 = new Scanner(System.in);

        System.out.print("1º numero: ");
        int num1 = Ex2.nextInt();

        System.out.print("1º numero: ");
        int num2 = Ex2.nextInt();

        System.out.print("1º numero: ");
        int num3 = Ex2.nextInt();

        int temp; 
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        
        if (num1 > num3) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }
        
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        
        System.out.println("Numeros em ordem crescente: " + num1 + ", " + num2 + ", " + num3);
        Ex2.close();
    }
}