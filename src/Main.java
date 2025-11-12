import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1. Cria o teu primeiro programa em JAVA. Imprime no ecrã “Hello WORLD!”
        System.out.println("Hello WORLD!");

        //2. Cria um programa que declare as seguintes variáveis: um número inteiro, um número decimal, um boolean
        //e um caracter. Atribui valores a essas variáveis e imprime-os no ecrã.

        int numeroInteiro = 10;
        double numeroDecimal = 10.5;
        boolean booleano = true;
        char caracter = 'a';
        System.out.println("numeroInteiro: " + numeroInteiro);
        System.out.println("numeroDecimal: " + numeroDecimal);
        System.out.println("booleano: " + booleano);
        System.out.println("caracter: " + caracter);

        //3. Cria um programa que declare um número decimal e depois o converta para inteiro.
        //Mostra o resultado no ecrã.

        double numeroDecimal2 = 15.7;
        int numeroConvertido = (int) numeroDecimal2;
        System.out.println("Número decimal: " + numeroDecimal2);
        System.out.println("Número convertido para inteiro: " + numeroConvertido);

        //4. Escreve funções que recebam dois números inteiros como argumentos e retorne a:
        //a) Soma
        //b) Subtração
        //c) Multiplicação
        //d) Divisão
        //Depois, utiliza as funções que criaste e e chama-as no metodo main para serem executadas.

        Scanner scanner = new Scanner(System.in);
        int numero1;
        int numero2;
        System.out.print("Insira o primeiro numero inteiro: ");
        numero1 = scanner.nextInt();
        System.out.print("Insira o segundo numero inteiro: ");
        numero2 = scanner.nextInt();
        System.out.println("Soma: " + soma(numero1, numero2));
        System.out.println("Subtração: " + subtracao(numero1, numero2));
        System.out.println("Multiplicação: " + multiplicacao(numero1, numero2));
        System.out.println("Divisão: " + divisao(numero1, numero2));


        //5. Cria uma função que converta uma temperatura em graus Celsius para Fahrenheit.
        //A fórmula de conversão é: Fahrenheit = (Celsius * 9/5) + 32.
        //No metodo main, converte uma temperatura de 25 graus Celsius e mostra o resultado.

        double celsius;
        System.out.print("Insira a temperatura em graus Celsius: ");
        celsius = scanner.nextDouble();
        double fahrenheit = celsiusParaFahrenheit(celsius);
        System.out.println(celsius + " graus Celsius é igual a " + fahrenheit + " graus Fahrenheit.");

        //6. Escreve um procedimento que receba a altura e a largura de um retângulo e calcule o seu perímetro.
        //Chama esse procedimento no metodo main para calcular o perímetro de um
        //retângulo com altura de 5 e largura de 8.

        float altura;
        float largura;
        System.out.print("Insira a altura do retângulo: ");
        altura = scanner.nextFloat();
        System.out.print("Insira a largura do retângulo: ");
        largura = scanner.nextFloat();
        Main main = new Main();
        main.calcularPerimetroRetangulo(altura, largura);

        //7. Cria uma função que calcule o Índice de Massa Corporal (IMC), dada a altura (em metros)
        //e o peso (em quilogramas). A fórmula do IMC é IMC = peso / (altura * altura).
        //Usa essa função no metodo main para calcular o IMC de uma pessoa com altura de
        //1.75 metros e peso de 70 kg.
        double altura2;
        double peso;
        double imc;
        String Categoria;
        System.out.print("Insira a altura da pessoa: ");
        altura2 = scanner.nextDouble();
        System.out.print("Insira o peso da pessoa: ");
        peso = scanner.nextDouble();
        imc = main.calcularIMC(altura2, peso);

        String categoria;
        if (imc < 18.5) {
            categoria = "Abaixo do peso";
        } else if (imc < 25) {
            categoria = "Peso normal";
        } else if (imc < 30) {
            categoria = "Excesso de peso"; // Sobrepeso
        } else if (imc < 35) {
            categoria = "Obesidade grau I";
        } else if (imc < 40) {
            categoria = "Obesidade grau II";
        } else {
            categoria = "Obesidade grau III";
        }
        System.out.println(String.format("O seu IMC é: %.2f (%s)", imc, categoria));


        //8. Escreve uma função que converta uma medida em metros para centímetros.
        //Sabendo que 1 metro equivale a 100 centímetros, faz a conversão e
        //mostra o resultado no metodo main para uma medida de 5 metros.

        double metros;
        System.out.print("Insira a medida em metros: ");
        metros = scanner.nextDouble();
        System.out.println(metros + " metros equivalem a " + main.converterCentimetros(metros) + " centímetros.");

        //9. Cria uma função que calcule o tempo necessário para percorrer uma
        //determinada distância a uma certa velocidade. A fórmula é tempo = distância / velocidade.
        //No metodo main, calcula o tempo de uma viagem de 300 km a uma velocidade de 80 km/h.

        double distancia;
        double velocidade;
        System.out.print("Insira a distância em km: ");
        distancia = scanner.nextDouble();
        System.out.print("Insira a velocidade em km/h: ");
        velocidade = scanner.nextDouble();
        System.out.println(distancia + " km percorrem " + main.calcularTempoViagem(distancia, velocidade) + " horas.");

    }

    public double calcularTempoViagem(double distancia, double velocidade){
        return distancia / velocidade;
    }

    public double converterCentimetros(double metros){
        return metros * 100;
    }

    public double calcularIMC(double altura, double peso){
        return peso / Math.pow(altura, 2);
    }

    public void calcularPerimetroRetangulo(float altura, float largura){
        float perimetro = (altura * 2) + (largura * 2);
        System.out.println("Perimetro do retângulo: " + perimetro);
    }

    public static double celsiusParaFahrenheit(double celsius){
        return (celsius * 9/5) + 32;
    }

    public static int soma(int numero1, int numero2){
        return numero1 + numero2;
    }

    public static int subtracao(int numero1, int numero2){
        return numero1 - numero2;
    }

    public static int multiplicacao(int numero1, int numero2){
        return numero1 * numero2;
    }

    public static int divisao(int numero1, int numero2){
        return numero1 / numero2;
    }
}