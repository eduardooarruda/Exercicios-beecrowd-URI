import java.io.IOException;
import java.util.Scanner;
 

class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int tempoGasto = sc.nextInt();
        int velocidadeMedia = sc.nextInt();
        System.out.printf("%.3f%n", (tempoGasto*velocidadeMedia/12.0));

    }
 
}