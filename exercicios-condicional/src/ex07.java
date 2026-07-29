import java.util.Locale;
import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Double x, y;
        String quad = "";

        x = sc.nextDouble();
        y = sc.nextDouble();

        if (x > 0 && y > 0) {
            quad = "Q1";
        }
        else if (x != 0 && y == 0) {
            quad = "Eixo X";
        }
        else if (x > 0 && y < 0) {
            quad = "Q4";
        }
        else if (x == 0 && y != 0) {
            quad = "Eixo Y";
        }
        else if (x < 0 && y > 0) {
            quad = "Q2";
        }
        else if (x < 0 && y < 0) {
            quad = "Q3";
        }
        else if (x == 0 && y == 0) {
            quad = "Origem";
        }

        System.out.println(quad);

        sc.close();
    }
}
