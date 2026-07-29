import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        if (a % b == 0 || b % a == 0) {
            IO.println("Sao Multiplos");
        }
        else {
            IO.println("Nao sao Multiplos");
        }

        sc.close();
    }
}
