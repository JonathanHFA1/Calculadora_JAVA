package dobackaofront;

// Cientifica herda Calculadora e adiciona potência e raiz quadrada
public class Cientifica extends Calculadora {

    // Construtor padrão
    public Cientifica() {
        super(); // Chama o construtor da classe Calculadora
    }

    // Calcula base elevado ao expoente
    public double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }

    // Calcula a raiz quadrada de um valor
    public double raizQuadrada(double valor) {
        return Math.sqrt(valor);
    }
}
