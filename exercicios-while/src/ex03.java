import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a = 0, g = 0, d = 0, input = 0;

        while (!input.equals(4)) {
            input = sc.nextInt();
            switch (input) {
                case 1:
                    a += 1;
                    break;
                case 2:
                    g += 1;
                    break;
                case 3:
                    d += 1;
                    break;
                default:
                    break;
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + a);
        System.out.println("Gasolina: " + g);
        System.out.println("Diesel: " + d);

        sc.close();
    }
}
