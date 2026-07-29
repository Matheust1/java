import java.util.Locale;
import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Double sal, tax;

        sal = sc.nextDouble();
        tax = 0.0;

        if (sal >= 0 && sal <= 2000) {
            tax = 0.0;
        }
        else if (sal >= 2000.01 && sal <= 3000) {
            tax = (sal - 2000) * 0.08;
        }
        else if (sal >= 3000.01 && sal <= 4500) {
            tax = (1000 * 0.08) + ((sal - 3000) * 0.18);
        }
        else if (sal >= 4500.01) {
            tax = (1000 * 0.08) + (1500 * 0.18) + ((sal - 4500) * 0.28);
        }

        if (tax != 0) {
            System.out.printf("%nR$ %.2f%n", tax);
        }
        else {
            System.out.println("Isento");
        }

        sc.close();
    }
}
