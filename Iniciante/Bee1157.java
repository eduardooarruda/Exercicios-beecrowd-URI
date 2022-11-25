import java.io.IOException;
import java.util.Scanner;
 

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        sc.close();

        System.out.println("1");

        for(int i = 2; i <= numero/2; i++){
            if(numero%i == 0){
                System.out.println(i);
            }
        }

        System.out.println(numero);
        
    }
}