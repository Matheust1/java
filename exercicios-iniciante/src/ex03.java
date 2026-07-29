import java.util.Locale;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Integer a, b, c, d, resultado;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        resultado = (a*b) - (c*d);

        IO.println("DIFERENÇA = " + resultado);

        sc.close();
    }
}