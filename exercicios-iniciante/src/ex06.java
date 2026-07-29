import java.util.Locale;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Double a, b, c, areaTriangle, areaCircle, areaTrapezoid, areaSquare, areaRectangle;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        areaTriangle = (a * c) / 2;
        areaCircle = 3.14159 * (c*c);
        areaTrapezoid = ((a + b) * c) / 2;
        areaSquare = b * b;
        areaRectangle = a * b;

        IO.println("TRIANGULO: " + areaTriangle);
        IO.println("CIRCULO: " + areaCircle);
        IO.println("TRAPEZIO: " + areaTrapezoid);
        IO.println("QUADRADO: " + areaSquare);
        IO.println("RETANGULO: " + areaRectangle);

        sc.close();
    }
}
