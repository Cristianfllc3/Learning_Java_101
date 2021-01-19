package src;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        int a = 3;
        int b = 4;
        int c = 6;
        Triangle t = new Triangle(a, b, c);
        Triangle t2 = new Triangle(6, 5, 3);

        int R = t.method_args(a, b, c);
        int R2 = t2.method_direct();
        System.out.println("Result with method_args is : " + R);
        System.out.println("Result with method_direct is : " + R2);

    }

}