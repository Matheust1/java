import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n1, n2;

        n1 = sc.nextInt();
        n2 = sc.nextInt();
        Integer soma = n1 + n2;

        IO.println("SOMA = " + soma);

        sc.close();
    }
}
