package src;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        /*
        int a = 3;
        int b = 4;
        int c = 6;
        Triangle t = new Triangle(a, b, c);
        Triangle t2 = new Triangle(6, 5, 3);

        int R = t.method_args(a, b, c);
        int R2 = t2.method_direct();
        System.out.println("Result with method_args is : " + R);
        System.out.println("Result with method_direct is : " + R2);
        */

        //For class StringOperations
        System.out.println("Enter the string:");
        Scanner sc = new Scanner(System.in);
        String sc_input = sc.next();
        StringOperations sp = new StringOperations();
        /*
        String show = sp.reverseString(sc_input);
        String show1 = sp.reverseString("arroz");
        System.out.println("Your name reverse is: " + show + " The original is: "+ sc_input);
        */
        String countVC = sp.countVowelsConsonants(sc_input);
        System.out.println("> - - "+countVC);




    }

}