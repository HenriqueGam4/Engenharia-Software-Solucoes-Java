package com.mycompany.medianotas;

import java.util.Scanner;

public class MediaNotas {
        public static double calcMedia (double nota1, double nota2, double nota3, double nota4) {
    return (nota1 + nota2 + nota3 + nota4) / 4;
    }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("1a nota: ");
            double nota1 = scanner.nextDouble();
            System.out.print("2a nota: ");
            double nota2 = scanner.nextDouble();
            System.out.print("3a nota: ");
            double nota3 = scanner.nextDouble();
            System.out.print("4a nota: ");
            double nota4 = scanner.nextDouble();
            
            double media = calcMedia(nota1, nota2, nota3, nota4);
            System.out.printf("Media das notas: %.2f%n", media);
            
            scanner.close();
            }


        }

            

