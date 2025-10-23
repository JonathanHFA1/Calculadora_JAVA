package dobackaofront;

import java.util.Scanner;

public class EfetuaCalculosInput {

    public void EfetuaCalculosInput() {
        Scanner leitor = new Scanner(System.in);
        double valor1;
        double valor2;
        double valor3;
        int condicao;
        Calculadora calc = new Calculadora();

        do {
            System.out.println("Escolha a operação:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Resto");
            System.out.println("6 - Potencia 2 Números (Valor1^valor2)");
            System.out.println("7 - Raiz de 1 Número");
            System.out.println("8 - Mostrar Todas Opções");
            int opcao = leitor.nextInt();


            do {
                System.out.print("Por favor, insira o valor 1: ");
                valor1 = leitor.nextDouble();
                if (valor1 <= 0) {
                    System.out.println("Por favor, insira valor válido.");
                }
            } while (valor1 <= 0);

            do {
                System.out.print("Por favor, insira o valor 2: ");
                valor2 = leitor.nextDouble();
                if (valor2 <= 0) {
                    System.out.println("Por favor, insira valor válido.");
                }
            } while (valor2 <= 0);
            do {
                System.out.print("Por favor, insira o valor 3: ");
                valor3 = leitor.nextDouble();
                if (valor3 <= 0) {
                    System.out.println("Por favor, insira valor válido.");
                }
            } while (valor3 <= 0);


            switch (opcao) {
                case 1:
                    System.out.println("Resultado: " + calc.somar(valor1, valor2, valor3));
                    break;
                case 2:
                    System.out.println("Resultado: " + calc.subtrair(valor1, valor2, valor3));
                    break;
                case 3:
                    System.out.println("Resultado: " + calc.multiplicar(valor1, valor2, valor3));
                    break;
                case 4:
                    System.out.println("Resultado: " + calc.dividir(valor1, valor2, valor3));
                    break;
                case 5:
                    System.out.println("Resultado: " + calc.resto(valor1, valor2, valor3));
                    break;
                case 6:
                    System.out.println("Resultado: " + calc.potencia(valor1, valor2));
                    break;
                case 7:
                    System.out.println("Qual valor quer calcular? 1,2 ou 3: ");
                    int raiz = leitor.nextInt();
                    switch (raiz) {
                        case 1:
                            valor1 = raiz;
                            System.out.println("Resultado: " + calc.raiz(valor1));
                            break;
                        case 2:
                            valor2 = raiz;
                            System.out.println("Resultado: " + calc.raiz(valor2));
                            break;
                        case 3:
                            valor3 = raiz;
                            System.out.println("Resultado: " + calc.raiz(valor3));
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }

                    break;
                case 8:
                    System.out.println("Soma: " + calc.somar(valor1, valor2, valor3));
                    System.out.println("Subtração: " + calc.subtrair(valor1, valor2, valor3));
                    System.out.println("Multiplicação: " + calc.multiplicar(valor1, valor2, valor3));
                    System.out.println("Divisão: " + calc.dividir(valor1, valor2, valor3));
                    System.out.println("Resto: " + calc.resto(valor1, valor2, valor3));
                    System.out.println("Resultado: " + calc.potencia(valor1, valor2));
                    System.out.println("Resultado Raiz 1: " + calc.raiz(valor1));
                    System.out.println("Resultado Raiz 2: " + calc.raiz(valor2));
                    System.out.println("Resultado Raiz 3: " + calc.raiz(valor3));

                    break;
                default:
                    System.out.println("Opção inválida!");
            }


            System.out.println("Quer fazer novamente? 1- sim 0- não");
            condicao = leitor.nextInt();
        } while (condicao == 1);
    }
}
