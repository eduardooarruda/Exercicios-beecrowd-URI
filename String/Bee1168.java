import java.io.IOException;
import java.util.Scanner;
 

class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);

        int numeroTeste = sc.nextInt();

        for(int i = 1; i <= numeroTeste; i++){

            int quantidadeLeds = 0;
            String valor = sc.next();

            for(int e = 0; e < valor.length(); e++) {
                
                switch(valor.charAt(e)){
                    case '1':
                        quantidadeLeds += 2;
                        break;
                    case '2':
                    case '3':
                    case '5':
                        quantidadeLeds += 5;
                        break;
                    case '4':
                        quantidadeLeds += 4;
                        break;
                    case '6':
                    case '9':
                    case '0':
                        quantidadeLeds += 6;
                        break;
                    case '7':
                        quantidadeLeds += 3;
                        break;
                    case '8':
                        quantidadeLeds += 7;
                        break;
                }
            }
            System.out.printf("%d leds%n", quantidadeLeds);
            quantidadeLeds = 0;
        }
 
    }
 
}