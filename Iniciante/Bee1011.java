import java.io.IOException;
import java.util.Scanner;
 

class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14159;
        int raio = sc.nextInt();
        double volumeEsfera = (4/3.0) * PI * Math.pow(raio, 3); 

        System.out.printf("VOLUME = %.3f%n", volumeEsfera);
    }
 
}