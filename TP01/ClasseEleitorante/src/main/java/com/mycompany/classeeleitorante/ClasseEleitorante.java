package com.mycompany.classeeleitorante;

import java.util.Scanner;

public class ClasseEleitorante {

    public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);

System.out.print("Digite a idade! ");
int idd = scanner.nextInt();

if (idd < 16) {
    System.out.println("Nao eleitor (- de 16 anos)");
} else if (idd >= 18 && idd <= 65) {
    System.out.println("Eleitor obrigatorio: (entre 18 e 65 anos)");
} else {
    System.out.println("Eleitor facultativo (entre 16 e 18 anos e + de 65)");

scanner.close();    
}
    }
}