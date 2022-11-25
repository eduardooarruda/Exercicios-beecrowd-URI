import java.io.IOException;
import java.util.Scanner;

class Main {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int numberCases = sc.nextInt();

        for(int i = 1; i <= numberCases; i++ ){
            int number1 = sc.nextInt(); 
            String operation = sc.next();
            int number2 = sc.nextInt();
            sc.next();
            int result = sc.nextInt();
            int resultAux;

            switch(operation){
                case "+":
                    resultAux = number1 + number2;
                    break;
                case "-":
                    resultAux = number1 - number2;
                    break;
                default:
                    resultAux = number1 * number2;;
            }

            if(result != resultAux){
                int amountOfR = Math.abs(result- resultAux);
        
                System.out.print("E");


                while(amountOfR-- > 0){
                    System.out.print("r");
                    
                }

                System.out.println("ou!");
            }
        }
 
    }
 
}