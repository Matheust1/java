import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer x = 1, y = 1;

        while (!x.equals(0) && !y.equals(0)) {
            x = sc.nextInt();
            y = sc.nextInt();

            if (!(x == 0 || y == 0)) {
                if (x > 0 && y > 0) {
                    System.out.println("primeiro");
                }
                else if (x > 0 && y < 0) {
                    System.out.println("quarto");
                }
                else if (x < 0 && y > 0) {
                    System.out.println("segundo");
                }
                else if (x < 0 && y < 0) {
                    System.out.println("terceiro");
                }
            }
        }

        sc.close();
    }
}
