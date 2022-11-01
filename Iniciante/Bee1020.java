import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dias = sc.nextInt();
		
		int anos = dias/365;
		dias  -= anos*365;
		int mes = dias/ 30;
		dias -= mes*30;
		
		sc.close();
		
		System.out.println(anos + " ano(s)");
		System.out.println(mes + " mes(es)");
		System.out.println(dias + " dia(s)");
	      
	}
}