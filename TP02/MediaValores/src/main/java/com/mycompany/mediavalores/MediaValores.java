package com.mycompany.mediavalores;

import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class MediaValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário

        // Entrada do primeiro valor
        System.out.print("Digite o primeiro valor: ");
        float valor1 = scanner.nextFloat(); // Lê o primeiro valor e armazena na variável valor1

        // Entrada do segundo valor
        System.out.print("Digite o segundo valor: ");
        float valor2 = scanner.nextFloat(); // Lê o segundo valor e armazena na variável valor2

        // Cálculo da média
        float media = (valor1 + valor2) / 2; // Calcula a média entre os dois valores

        // Exibição do resultado
        System.out.printf("A media entre %.2f e %.2f: %.2f%n", valor1, valor2, media); // Exibe a média formatada

        scanner.close(); // Fecha o objeto Scanner para liberar recursos
    }
}
