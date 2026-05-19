package com.mycompany.multiplodetres;

import java.util.Scanner;

public class MultiploDeTres {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um valor: ");
        int val = scanner.nextInt();
        
        if (val % 3 == 0) {
           System.out.print(val + " eh multiplo de 3 ");
        } else {
             System.out.println(val + "nao eh multiplo de 3 ");
        }
         scanner.close();
        }
    }
    