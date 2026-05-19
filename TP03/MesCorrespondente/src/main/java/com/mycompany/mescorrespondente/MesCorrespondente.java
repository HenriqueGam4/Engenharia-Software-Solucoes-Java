package com.mycompany.mescorrespondente;

import java.util.Scanner;

public class MesCorrespondente {
public static void mostrarMes(int num){
    switch (num){
        case 1:
            System.out.println("Jan");
            break;
        case 2:
            System.out.println("Fev");
            break;
        case 3:
            System.out.println("Mar");
            break;
            
        default:
        
            System.out.println("Invalido");
            break;
            
    }
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um numero (1 a 3) para o mes do 1o trimestre! ");
        int num = scanner.nextInt();
        
        mostrarMes(num);
        
        scanner.close();
    }
}
