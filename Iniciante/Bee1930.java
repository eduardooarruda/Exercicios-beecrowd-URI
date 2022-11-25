import java.io.IOException;
import java.util.Scanner;
 

class Main {
 
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int totalTomadas = 0;

        for(int i = 1; i <= 4; i++){
            totalTomadas += sc.nextInt();
        }

        System.out.println(totalTomadas - 3);
    }
 
}