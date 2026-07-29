import java.util.Locale;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Integer code, qtd;
        Double price, total;

        code = sc.nextInt();
        qtd = sc.nextInt();
        price = 0.0;

        switch (code) {
            case 1:
                price = 4.0;
                break;
            case 2:
                price = 4.5;
                break;
            case 3:
                price = 5.0;
                break;
            case 4:
                price = 2.0;
                break;
            case 5:
                price = 1.5;
                break;
            default:
                break;
        }

        total = price * qtd;

        System.out.printf("%nTotal: R$ %.2f%n", total);

        sc.close();
    }
}
