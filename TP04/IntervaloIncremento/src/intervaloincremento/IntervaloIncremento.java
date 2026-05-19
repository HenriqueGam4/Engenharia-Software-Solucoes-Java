package intervaloincremento;

import java.util.Scanner;



public class IntervaloIncremento {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        

        try {

            System.out.print("Escreva o limite superior: ");

            int limiteSuperior = sc.nextInt();

            System.out.print("Nmr max do intervalo: ");

            int incremento = sc.nextInt();

            

            if (limiteSuperior <= 0 || incremento <= 0) throw new IllegalArgumentException("Os numeros devem ser maiores que zero.");



            System.out.print("Numeros naturais no intervalo de 0 até " + limiteSuperior + " com incremento de " + incremento + ": ");

            for (int i = 0; i <= limiteSuperior; i += incremento) {

                System.out.print(i + " ");

            }

        } catch (Exception e) {

            System.out.println("Erro: " + e.getMessage());

        } finally {

            sc.close();

        }

    }

}