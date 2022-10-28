import java.io.IOException;
import java.util.Scanner;
 
class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int quantidadeDeHO = sc.nextInt();

        for(int i = 1; i < quantidadeDeHO; i++)
            System.out.print("Ho ");

        System.out.println("Ho!");
 
    }
 
}