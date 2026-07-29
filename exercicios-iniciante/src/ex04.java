import java.util.Locale;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Integer num, hours;
        Double valHour;

        num = sc.nextInt();
        hours = sc.nextInt();
        valHour = sc.nextDouble();

        Double sal = hours * valHour;

        IO.println("NUMBER = " + num);
        System.out.printf("SALARY = U$ %.2f" , sal);

        sc.close();
    }
}
