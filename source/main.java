import java.util.Scanner;
//Exercício 3

void main() {
    int n1, n2;
    Scanner myObj = new Scanner(System.in);
    System.out.println("Introduza o Primeiro Número Inteiro: ");
    n1 = myObj.nextInt();
    System.out.println("Introduza o Segundo Número Inteiro: ");
    n2 = myObj.nextInt();
    System.out.println("A Soma dos Números Inteiros é: " + soma(n1,n2));
    System.out.println("A Subtração dos Números Inteiros é: " + subtracao(n1,n2));
    System.out.println("A Multiplicação dos Números Inteiros é: " + multiplicacao(n1,n2));
    System.out.println("A Divisão dos Números Inteiros é: " + divisao(n1,n2));
}

static int soma(int n1, int n2) {
    return n1 + n2;
}

static int subtracao(int n1, int n2) {
    return n1 - n2;
}

static int multiplicacao(int n1, int n2) {
    return n1 * n2;
}

static int divisao(int n1, int n2) {
    return n1 / n2;
}