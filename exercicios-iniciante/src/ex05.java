import java.util.Locale;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Integer cod1, num1, cod2, num2;
        Double valUni1, valUni2, valTotal;

        cod1 = sc.nextInt();
        num1 = sc.nextInt();
        valUni1 = sc.nextDouble();

        cod2 = sc.nextInt();
        num2 = sc.nextInt();
        valUni2 = sc.nextDouble();

        valTotal = (num1 * valUni1) + (num2 * valUni2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", valTotal);

        sc.close();
    }
}
