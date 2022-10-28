import java.io.IOException;
import java.util.Scanner;
 

class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);

        int tipoCha = sc.nextInt();
        int quantidadeRespostasCorretas = 0; 

        for(int i = 1; i <= 5; i++){
            int respostaCompetidor = sc.nextInt();
            if(respostaCompetidor == tipoCha){
                quantidadeRespostasCorretas++;
            }
        }

        System.out.println(quantidadeRespostasCorretas);
 
    }
 
}