import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String palavra = sc.next();

        if(palavra.length() >= 10)
            System.out.println("palavrao");
        else
            System.out.println("palavrinha");

    }
}