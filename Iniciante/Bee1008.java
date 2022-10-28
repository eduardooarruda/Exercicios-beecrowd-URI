import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroFuncionario = sc.nextInt();
        int numeroHoras = sc.nextInt();
        double valorPorHora = sc.nextDouble();
        double salario = numeroHoras * valorPorHora;
        
        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);

    }
}