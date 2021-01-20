package src;

public class Triangle {
    //Well it not a triangle :)
    int A;
    int B;
    int C;

    public Triangle (int A, int B, int C)
    {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public int method_args (int a, int b, int c)
    {
        int calc = a + b + c;
        return calc;
    }

    public int method_direct ()
    {
        int calc = this.A + this.B + this.C;
        return calc;
    }

}
