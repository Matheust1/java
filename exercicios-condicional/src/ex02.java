import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer n = sc.nextInt();

        if (n % 2 == 0) {
            IO.println("PAR");
        }
        else {
            IO.println("IMPAR");
        }

        sc.close();
    }
}
