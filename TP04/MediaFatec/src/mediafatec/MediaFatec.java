package mediafatec;

import java.util.Scanner;



public class MediaFatec {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        

        try {

            System.out.print("Nota da P1: ");

            double prova = sc.nextDouble();

            System.out.print("Nota da P2: ");

            double p2 = sc.nextDouble();
            
            System.out.print("Digite a nota do Trabalho: ");

            double trabalho = sc.nextDouble();

            System.out.print("Digite a nota da Participação: ");

            double participacao = sc.nextDouble();

            

            if (prova < 0 || prova > 10 || trabalho < 0 || trabalho > 10 || participacao < 0 || participacao > 10) {

                throw new IllegalArgumentException("As notas devem estar entre 0 e 10.");

            }



            double media = (prova * 0.5) + (trabalho * 0.3) + (participacao * 0.2);

            System.out.printf("A média final do aluno é: %.2f \n", media);

        } catch (Exception e) {

            System.out.println("Erro: " + e.getMessage());

        } finally {

            sc.close();

        }

    }

}