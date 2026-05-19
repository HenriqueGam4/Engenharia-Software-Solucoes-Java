package com.mycompany.descontoproduto;

import java.util.Scanner;

public class DescontoProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Nome do produto: ");
        String nomeProduto = scanner.nextLine();

        
        System.out.print("Digite o valor do produto: ");
        double valorUnitario = scanner.nextDouble();

        
        double desconto = valorUnitario * 0.09;
        double valorComDesconto = valorUnitario - desconto;

        
        System.out.printf("Produto: %s%n", nomeProduto);
        System.out.printf("Valor original: R$ %.2f%n", valorUnitario);
        System.out.printf("Valor c/ desconto: R$ %.2f%n", valorComDesconto);
        
        scanner.close();
    }
}