//Exercício 3
void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Nota do Teste A (40%): ");
    double testeA = scanner.nextDouble();

    System.out.print("Nota do Teste B (40%): ");
    double testeB = scanner.nextDouble();

    System.out.print("Nota do Teste C (20%): ");
    double testeC = scanner.nextDouble();

    double notaFinal = (testeA * 0.4) + (testeB * 0.4) + (testeC * 0.2);
    double media = (testeA + testeB + testeC) / 3.0;

    System.out.println("\n--- Resultados ---");
    System.out.println("Nota do Teste A: " + testeA);
    System.out.println("Nota do Teste B: " + testeB);
    System.out.println("Nota do Teste C: " + testeC);
    System.out.printf("Nota Final (com pesos): %.2f\n", notaFinal);
    System.out.printf("Média Simples: %.2f\n", media);

    scanner.close();
}