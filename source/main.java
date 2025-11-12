//Exercício 9
void main() {
    int somaWhile = 0;
    int contador = 1;

    while (contador <= 100) {
        somaWhile += contador;
        contador++;
    }

    System.out.println("Soma de 1 a 100 com while: " + somaWhile);

    int somaFor = 0;

    for (int i = 1; i <= 100; i++) {
        somaFor += i;
    }

    System.out.println("Soma de 1 a 100 com for: " + somaFor);
}