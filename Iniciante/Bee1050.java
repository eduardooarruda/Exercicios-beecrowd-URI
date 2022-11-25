import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Map<Integer, String> DDD = new HashMap<>() {
			{
				put(61, "Brasilia");
				put(71, "Salvador");
				put(11, "Sao Paulo");
				put(21, "Rio de Janeiro");
				put(32, "Juiz de Fora");
				put(19, "Campinas");
				put(27, "Vitoria");
				put(31, "Belo Horizonte");
			}
		};

		int ddd = sc.nextInt();
		sc.close();

		if (DDD.containsKey(ddd))
			System.out.println(DDD.get(ddd));
		else
			System.out.println("DDD nao cadastrado");

	}
}