import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();

        double[] notas = {100, 50, 20, 10 ,5, 2};              
        double[] moedas = {1, 0.50, 0.25, 0.10, 0.05, 0.01};

        System.out.println("NOTAS:");
        for(int i = 0; i < notas.length; i++){

            if(valor%notas[i] != valor){
                int quantidadeDeNotas = (int)((valor - valor%notas[i])/notas[i]);
                System.out.printf("%d nota(s) de R$ %.2f%n", quantidadeDeNotas, notas[i]);
                valor -= quantidadeDeNotas*notas[i]; 
            }else{
                System.out.printf("0 nota(s) de R$ %.2f%n", notas[i]);
            }
        }

        System.out.println("MOEDAS:");
        for(int i = 0; i < moedas.length; i++){

            if(valor%moedas[i] != valor){
                int quantidadeDeMoedas = (int)((valor - valor%moedas[i])/moedas[i]);
                System.out.printf("%d moeda(s) de R$ %.2f%n", quantidadeDeMoedas, moedas[i]);
                valor -= quantidadeDeMoedas*moedas[i]; 
            }else{
                System.out.printf("0 moeda(s) de R$ %.2f%n", moedas[i]);
            }
        }
       
    }
}