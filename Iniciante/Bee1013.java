import java.io.IOException;
import java.util.Scanner;
 

class Main {

    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maiorAB = (a + b + Math.abs(a - b))/2;

        maiorAB = maiorAB < c ? c : maiorAB;

        System.out.printf("%d eh o maior%n", maiorAB);
       
    }
 
}