import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = sc.next();
        double salarioFixo = sc.nextDouble();
        double totalVendasMes = sc.nextDouble();
        double salarioTotal = salarioFixo + (totalVendasMes * 0.15);
        
        System.out.printf("TOTAL = R$ %.2f%n", salarioTotal);
       
    }
}