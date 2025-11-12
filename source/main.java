//Exercício 5
void main() {
    double grausCelcius = 25.0;
    double grausFahrenheit = ConversaoGrausCelcius(grausCelcius);
    System.out.println(grausCelcius + " graus Celsius é igual a " + grausFahrenheit + " graus Fahrenheit.");
}

static double ConversaoGrausCelcius(double grausCelcius) {
    return (grausCelcius * 9/5) + 32;
}