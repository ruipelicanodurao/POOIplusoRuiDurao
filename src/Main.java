import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Exercicio 3: Escreva um programa para ler o número de lados de um poligono regular e
        //a medida do lado (em cm). Calcule e imprimir o seguinte:
        //• Se o número de lados for igual a 3, escrever TRIÄNGULO e o valor da årea
        //• Se o número de lados for igual a 4, escrever QUADRADO e o valor da sua årea.
        //• Se o número de lados for igual a 5 escrever PENTÅGONO

        int numeroDeLados;
        float medidaDoLado;
        System.out.print("Digite o número de lados do polígono regular: ");
        numeroDeLados = scanner.nextInt();
        System.out.print("Digite a medida do lado (em cm): ");
        medidaDoLado = scanner.nextFloat();
        switch (numeroDeLados) {
            case 3:
                double areaTriangulo = (Math.sqrt(3) / 4) * Math.pow(medidaDoLado, 2);
                System.out.printf("TRIÂNGULO - Área: %.2f cm²%n", areaTriangulo);
                break;
            case 4:
                double areaQuadrado = Math.pow(medidaDoLado, 2);
                System.out.printf("QUADRADO - Área: %.2f cm²%n", areaQuadrado);
                break;
            case 5:
                System.out.println("PENTÁGONO");
                break;
            default:
                System.out.println("Polígono não reconhecido.");
                break;
        }
        scanner.close();



    }
}