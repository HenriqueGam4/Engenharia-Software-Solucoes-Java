package com.mycompany.conversaotemperatura;

import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        
        System.out.print("Digite a temperatura em Celsius: ");
        float tempC = scanner.nextFloat();
        
        float tempF = (9 * tempC + 160) / 5;
        
        System.out.printf("Temperatura em Fahrenheit: %.2fF%n", tempF);
    
        scanner.close();
    }
}