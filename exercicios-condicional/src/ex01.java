import java.util.Locale;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Integer n = sc.nextInt();

        if (n < 0) {
            IO.println("NEGATIVO");
        }
        else {
            IO.println("NÃO NEGATIVO");
        }

        sc.close();
    }
}
