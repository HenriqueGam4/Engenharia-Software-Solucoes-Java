package com.mycompany.volumelataoleo;

import java.util.Scanner;

public class VolumeLataOleo {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        
        System.out.printf("Dados solicitados em metros \n");
       
                System.out.print("Digite o raio da lata: ");
        float raio = scanner.nextFloat();
        
        System.out.print("Digite a altura da lata: ");
        float altura = scanner.nextFloat();
        
        float vol = 3.14159f * (raio * altura) * altura;
        
        System.out.printf("Volume da lata: %.2f metros cubicos%n", vol);
    
        scanner.close();
    }
}
