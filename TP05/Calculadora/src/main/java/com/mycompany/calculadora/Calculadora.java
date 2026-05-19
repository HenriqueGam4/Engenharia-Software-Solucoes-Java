package com.mycompany.calculadora;

import java.util.Scanner;

public class Calculadora {
    private double num1;
    private double num2;
    private char operacao;

    public Calculadora(double num1, double num2, char operacao) {
        this.num1 = num1;
        this.num2 = num2;
        this.operacao = operacao;
    }

    public double calcular() {
        switch (operacao) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Divisao por 0 nao existe.");
                    return Double.NaN;
                }
            default:
                System.out.println("Operacao invalida.");
                return Double.NaN;
        }
    }

    public void imprimirResultado(double resultado) {
        if (!Double.isNaN(resultado)) {
            System.out.println("O resultado eh: " + resultado);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite a operacao (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);

        Calculadora calc = new Calculadora(num1, num2, operacao);
        double resultado = calc.calcular();
        calc.imprimirResultado(resultado);

        scanner.close();
    }
}
