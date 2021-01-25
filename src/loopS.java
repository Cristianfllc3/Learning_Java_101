package src;

import java.util.Arrays;

public class loopS {

    String[] arrayString = {"A", "B", "C", "D"};
    Integer[] arrayInt = {1, 2, 3, 4};

    //It is the old way for for "This is the way ..." Mandalorian
    public String forLegacy(String[] arrayString){
        var r = ".";
        for (int i = 0; i < arrayString.length; i++) {
            r.concat(arrayString[i]);
        }
        return r;
    }
    //Foreach it is new in JDK 8 i thinks
    public String forEach(String[] arrayString){
        var r = ".";
        for (String array: arrayString) {
            r.concat(array);
        }
        return r;
    }
    public String whileLoop(String[] arrayString){
        var r = ".";
        var i = 0;
        while (i>arrayString.length) {
            r.concat(arrayString[i]);
            i++;
        }
        return r;
    }
    public String doWhileLoop(String[] arrayString){
        var r = ".";
        var i = 0;
        do {
            r.concat(arrayString[i]);
            i++;
        }
        while (i>arrayString.length);
        return r;
    }
    //It is new brand new, i gues...
    public String forJDK15(String[] arrayString){
        var r = ".";
        Arrays.stream(arrayString).forEach(r::concat);
        return r;
    }

    //it is no a loops but i like a lot
    //it it a overload method that allow add n args to the methods really cool
    public int multiArgs (int... values)
    {
        var v = 0;
        for (int val: values) {
            v += val;
        }
        return v;
    }
}
