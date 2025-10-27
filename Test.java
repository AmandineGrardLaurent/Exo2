import java.util.Scanner;

public class Test {

    public static void parity(int number) {
        if (number == 0) System.out.println("");
        else if(number % 2 == 0) System.out.println(" et pair");
        else System.out.println(" et impair");
    }
    
    public static void positivity(int number) {
        if(number < 0) System.out.print(number + " est un chiffre négatif");
        else if (number > 0) System.out.print(number + " est un chiffre positif");
        else System.out.print(number + " est un chiffre nul");
        
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Chiffre à tester : ");

        int number = scan.nextInt();

        positivity(number);
        parity(number);
    }
}
