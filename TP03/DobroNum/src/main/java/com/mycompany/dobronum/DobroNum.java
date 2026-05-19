package com.mycompany.dobronum;

import java.util.Scanner;

public class DobroNum {

    public static int calcDobro(int num) {
        return num * 2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um numero inteiro: ");
          int num = scanner.nextInt();
  
        int dobro = calcDobro(num);
        System.out.println("O dobro de " + num + "eh: " + dobro);
    
scanner.close();
    }
}
