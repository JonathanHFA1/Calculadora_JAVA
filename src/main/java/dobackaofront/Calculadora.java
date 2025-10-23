package dobackaofront;

// Classe Calculadora
public class Calculadora {
    // Construtor padrão
    public Calculadora() {
        // Não faz nada especial
    }

    public double somar(double a, double b, double c) {
        return a + b + c;
    }

    public double subtrair(double a, double b, double c) {
        return a - b - c;
    }

    public double multiplicar(double a, double b, double c) {
        return a * b * c;
    }

    public double dividir(double a, double b, double c) {
        return a / b / c;
    }

    public double resto(double a, double b, double c) { return a % b % c; }

    public double potencia(double a,double b) { return Math.pow(a, b); }
    public double raiz(double a) { return Math.sqrt(a); }

}
