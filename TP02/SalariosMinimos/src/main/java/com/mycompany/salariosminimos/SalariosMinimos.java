package com.mycompany.salariosminimos;

import java.util.Scanner;

public class SalariosMinimos {
    public static void main(String[] args) {
       final double salarioMin = 1412.0;        

       Scanner scanner = new Scanner(System.in);
       
        // Validação do salário mínimo
        if (salarioMin <= 0) {
            System.out.println("O salario minimo deve ser maior que zero.");
            scanner.close();
            return; // Encerra o programa
        }

        // Entrada do valor do salário da pessoa
        System.out.print("Digite o valor do salario da pessoa: R$ ");
        double salarioPessoa = scanner.nextDouble();

        // Cálculo de quantos salários mínimos a pessoa ganha
        double qtdSalariosMins = salarioPessoa / salarioMin;

        // Exibição do resultado
        System.out.printf("A pessoa ganha %.2f salarios minimos.%n", qtdSalariosMins);
        
        scanner.close();
    }
}
