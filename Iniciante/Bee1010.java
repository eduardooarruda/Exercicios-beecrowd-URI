import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        double valorTotal = 0.0;

        for(int i = 1; i <= 2; i++){
            int codigoPeca = sc.nextInt();
            int quantidadePecas = sc.nextInt();
            double valorPeca = sc.nextDouble();
            valorTotal += quantidadePecas*valorPeca;
        }

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);
           
    }
}