package com.mycompany.grausradianos;

import java.util.Scanner;

public class GrausRadianos {
    public static double converterPRadianos(double graus) {
    return graus * Math.PI / 180;
            }
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
           
            System.out.print("Angulo em graus: ");
           double graus = scanner.nextDouble();
           
           double radianos = converterPRadianos(graus);
          
           System.out.printf("angulo em radianos: %.4f%n", radianos);

                   scanner.close();
}

    }



