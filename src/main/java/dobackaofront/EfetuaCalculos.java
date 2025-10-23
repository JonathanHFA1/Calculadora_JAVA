package dobackaofront;

public class EfetuaCalculos {
    public void EfetuaCalculos() {
        Calculadora calc = new Calculadora();
        System.out.println("Soma: " + calc.somar(2.3, 6.1, 1.0));
        System.out.println("Subtração: " + calc.subtrair(2.3, 6.1, 1.0));
        System.out.println("Multiplicação: " + calc.multiplicar(2.3, 6.1, 1.0));
        System.out.println("Divisão: " + calc.dividir(2.3, 6.1, 1.0));
        System.out.println("Resto: " + calc.dividir(2.3, 6.1, 1.0));
        System.out.println("Potencia 2 numeros: " + calc.potencia(2, 2));


    }
    public void executarCientifica() {
        // 1. Criar instância da classe Cientifica
        Cientifica calc = new Cientifica();

        // 2. Soma dos valores 10.5 e 17.4
        System.out.println("Soma: " + calc.somar(10.5, 17.4,2));

        // 3. Multiplicação dos valores 19, 3 e -23.3
        System.out.println("Multiplicação: " + calc.multiplicar(19, 3, -23.3));

        // 4. Potência de 3 elevado a 2
        System.out.println("Potência: " + calc.potencia(3, 2));

        // 5. Raiz quadrada de 25
        System.out.println("Raiz quadrada: " + calc.raizQuadrada(25));

    }
}
