package com.mycompany.maiorvalor;

import java.util.Scanner;

public class MaiorValor {
public static void mostrarMaior(double num1, double num2){
    if (num1 > num2) {
        System.out.printf("O maior valor eh: %.2f%n", num1);
    } else if (num2 > num1) {
        System.out.printf("o maior valor eh: %.2f%n", num2);
} else {
        System.out.println("Os dois valores sao iguais");
    }
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o 1o numero! ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Digite o 2o numero: ");
        double num2 = scanner.nextDouble();
        
        mostrarMaior(num1, num2);
        
        scanner.close();
    } 
}
