import java.io.IOException;
import java.util.Scanner;
 

class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);

        int numeroCliques = sc.nextInt();

        System.out.println(numeroCliques * 4);
    }
 
}