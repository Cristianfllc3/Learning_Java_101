package src;

public class Triangle {

    int A;
    int B;
    int C;

    public Triangle (int A, int B, int C)
    {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public int method (int a, int b, int c)
    {
        int calc = a + b + c;
        return calc;
    }

}
