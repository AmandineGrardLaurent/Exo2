import java.util.Scanner;

public class Test {

    public static String parity(int number) {
        if(number % 2 == 0) return "pair";
        else return "impair";
    }
    
    public static String positivity(int number) {
        if(number < 0) return "négatif";
        else if (number > 0) return "positif";
        else return "nul";
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Chiffre à tester : ");

        int number = scan.nextInt();

        String positivityResult = positivity(number);
        String parityResult = parity(number);

        System.out.println(number + " est " + positivityResult + " et " + parityResult);
    }
}
