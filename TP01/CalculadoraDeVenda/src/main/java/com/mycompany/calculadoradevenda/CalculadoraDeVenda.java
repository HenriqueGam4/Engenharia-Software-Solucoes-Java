
package com.mycompany.calculadoradevenda;

import java.util.Scanner;

public class CalculadoraDeVenda {
    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

        System.out.print("Valor de compra do produto! R$");
        double valCompra = scanner.nextDouble();
        
        double lucro;
        double valVenda;
        
        if (valCompra < 20.00) {
            lucro = 0.45;
            } else {
            lucro = 0.30;
        }
  
        valVenda = valCompra + (valCompra * lucro);
  System.out.printf("O valor de venda do produto eh: R$%.2f%n", valVenda);
   
  scanner.close();
}

}