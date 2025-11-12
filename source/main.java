//Exercício 1
import java.util.Scanner;
void main() {
    Scanner scanner = new Scanner(System.in);
    final int PIN_CORRETO = 1234;
    int tentativas = 0;
    boolean pinCorreto = false;

    System.out.println("Introduza o seu PIN (máximo de 3 tentativas):");

    while (tentativas < 3 && !pinCorreto) {
        System.out.print("Tentativa " + (tentativas + 1) + ": ");
        int pin = scanner.nextInt();

        if (pin == PIN_CORRETO) {
            System.out.println("PIN CORRETO");
            pinCorreto = true;
        } else {
            System.out.println("PIN ERRADO");
            tentativas++;
        }
    }

    if (!pinCorreto) {
        System.out.println("Demasiadas tentativas falhadas. Acesso bloqueado.");
    }

    scanner.close();
}