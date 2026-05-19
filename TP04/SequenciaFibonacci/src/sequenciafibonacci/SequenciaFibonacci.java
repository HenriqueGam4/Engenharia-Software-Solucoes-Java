package sequenciafibonacci;

import java.util.Scanner;
 
public class SequenciaFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Digite um valor de n: ");
            int n = sc.nextInt();
            if (n <= 0) throw new IllegalArgumentException("O n não pode ser negativo e/ou 0.");
            
            int a = 1, b = 1;
            System.out.print("O seu segmento Fibonacci vai ate o " + n + ": ");
            
            for (int i = 1; i <= n; i++) {
                System.out.print(a + " ");
                int temp = a;
                a = b;
                b = temp + b;
            }
        } catch (Exception e) {
            System.out.println("Falha: " );
        } finally {
            sc.close();
        }
    }
}