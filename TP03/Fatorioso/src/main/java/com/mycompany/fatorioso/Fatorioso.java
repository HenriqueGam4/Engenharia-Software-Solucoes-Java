package com.mycompany.fatorioso;

import java.util.Scanner;

public class Fatorioso {
 public static long calcularFatorial(int num) {
     long fatorial = 1;
     for(int i = 1; i <= num; i++) {
         fatorial *= i;
     }
     return fatorial;
 }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Numero para calcular fatorial: ");
        int num = scanner.nextInt();
        
        long fatorial = calcularFatorial(num);
        System.out.printf("O fatorial de %d eh: %d%n", num, fatorial);
        
        scanner.close();
                
    }
}
