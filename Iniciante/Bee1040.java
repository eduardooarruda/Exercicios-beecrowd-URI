import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        double N1 = sc.nextDouble();
        double N2 = sc.nextDouble();
        double N3 = sc.nextDouble();
        double N4 = sc.nextDouble();
        
        double media = (N1*2 + N2*3 + N3*4 + N4*1)/10.0;

        System.out.println("Nota do exame: " + df.format(media));

        if(media >= 7.0)
            System.out.println("Aluno aprovado.");
        
        else if(media >= 5.0 ){
            System.out.println("Aluno em exame.");

            double notaExame = sc.nextDouble();
            sc.close();
            System.out.printf("Nota do exame: %.1f%n", notaExame);

            media = (media + notaExame)/2.0;

            if(media >= 5.0 )
                System.out.println("Aluno aprovado.");
            else
                System.out.println("Aluno reprovado.");

            
            System.out.println("Nota do exame: " + df.format(media));
        }

        else
            System.out.println("Aluno reprovado.");

    }
 
}