import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 

class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);

        Map<Integer, Double> lanche = new HashMap<>(){{
            put(1, 4.00);
            put(2, 4.50);
            put(3, 5.00);
            put(4, 2.00);
            put(5, 1.50);
        }};

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        double total = lanche.get(codigo) * quantidade;

        sc.close();

        System.out.printf("Total: R$ %.2f%n", total);
        
    }
 
}

// Outra forma semelhante:

/* 

class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);

        double[] lanches = {4.00, 4.50, 5.00, 2.00, 1.50};

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        double total = lanches[codigo-1] * quantidade;

        sc.close();

        System.out.printf("Total: R$ %.2f%n", total);
        
    }
 
}

*/