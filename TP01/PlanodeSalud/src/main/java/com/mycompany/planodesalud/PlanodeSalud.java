package com.mycompany.planodesalud;

import java.util.Scanner;

public class PlanodeSalud {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nome! ");
    String nome = scanner.nextLine();
    
        System.out.print("idade: ");
        int idd = scanner.nextInt();
        
        double val;
        
        if (idd <= 10) {
            val = 30.00;
         } else if (idd <= 29){
             val = 60.00;
         } else if (idd <= 59){
             val = 120.00;
         } else if (idd <= 65){
             val = 250.00;    
         } else {
             val = 400.00;
         }
        
    System.out.printf("Valor da mensalidade para %s! R$ %.2f%n", nome, val);
    
    scanner.close();
    }
}
