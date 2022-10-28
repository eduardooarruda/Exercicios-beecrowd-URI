import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadeRegistros = sc.nextInt();

        for(int i = 1; i <= quantidadeRegistros; i++){
            int minutos = sc.nextInt();
            String tempo = sc.next();
            
            if(tempo.equals("1T")){
                if(minutos <= 45)
                    System.out.println(minutos);
                else
                    System.out.printf("45+%d%n", (minutos-45));
            
            }else{
                if(minutos <= 45)
                    System.out.println(minutos+45);
                else
                    System.out.printf("90+%d%n", (minutos-45));
            }
        }
    }
}