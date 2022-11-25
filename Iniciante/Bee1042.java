import java.io.IOException;
import java.util.Scanner;


class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[3];
        int[] numerosOrdenados = new int[numeros.length];

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = sc.nextInt();
            numerosOrdenados[i] = numeros[i];
        }
        sc.close();
        
        for(int i = 0; i < numerosOrdenados.length; i++){
            for(int j = 0; j < numerosOrdenados.length; j++){
                if(numerosOrdenados[i] < numerosOrdenados[j]){
                    int aux;
                    aux = numerosOrdenados[i];
                    numerosOrdenados[i] = numerosOrdenados[j];
                    numerosOrdenados[j] = aux;
                }
            }
        }

        for( int i = 0; i < numerosOrdenados.length; i++){
            System.out.println(numerosOrdenados[i]);
        }
        
        System.out.println();

        for( int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }

    }
 
}