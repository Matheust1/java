import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer senha = 2002;
        Integer input = 0;

        while (!input.equals(senha)) {
            input = sc.nextInt();
            if (input.equals(senha)) {
                System.out.println("Acesso Permitido");
            }
            else {
                System.out.println("Senha Invalida");
            }
        }

        sc.close();
    }
}
