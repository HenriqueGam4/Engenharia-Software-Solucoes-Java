package com.mycompany.numerosparesintervalo;

import java.util.Scanner;

public class NumerosParesIntervalo {
        public static void main (String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Valor inicial do intervalo: ");
int valinicial = scanner.nextInt();

System.out.print("Valor final do intervalo: ");
int valfinal = scanner.nextInt();

System.out.println("Numeros pares no intervalo");

for (int i = valinicial; i <= valfinal; i++) {
if (i % 2 == 0) {
 System.out.println(i);
}

}

scanner.close();

        }
}