package src;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        int a = 3;
        int b = 4;
        int c = 6;
        Triangle t = new Triangle(a, b, c);

        int R = t.method(a, b, c);
        System.out.println("El resultado es : " + R);

    }

}