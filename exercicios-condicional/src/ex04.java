import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer hInicial, hFinal, time;

        hInicial = sc.nextInt();
        hFinal = sc.nextInt();
        time = 0;

        if (hInicial < hFinal) {
            time = hFinal - hInicial;
        }
        else if (hInicial > hFinal) {
            time = 24 - hInicial + hFinal;
        }
        else if (hInicial == hFinal) {
            time = 24;
        }

        IO.println("O JOGO DUROU "+time+" HORA(S)");
    }
}
