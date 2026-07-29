import java.util.Locale;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Double raio, area;

        raio = sc.nextDouble();
        area = 3.14159 * (raio * raio);

        IO.println("A=%.4f" + area);

        sc.close();
    }
}
