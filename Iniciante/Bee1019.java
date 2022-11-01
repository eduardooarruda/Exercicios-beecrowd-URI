import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int segundos = sc.nextInt();
		int horas = segundos/3600;
		segundos -= horas*3600;	
		int minutos = segundos/60;
		segundos -= minutos*60;
		
		
		System.out.printf("%d:%d:%d%n", horas, minutos, segundos );
		
		
	}
}