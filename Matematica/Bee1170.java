import java.io.IOException;
import java.util.Scanner;
 

class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);

        int numeroTeste = sc.nextInt();

        for(int i = 1; i <= numeroTeste; i++ ){
            double quantidadeComida = sc.nextDouble();
            int numeroDias = 0;
            while(quantidadeComida > 1 ){
                numeroDias++;
                quantidadeComida /= 2;
            }
            System.out.printf("%d dias%n", numeroDias);
        
        }
    }
 
}
