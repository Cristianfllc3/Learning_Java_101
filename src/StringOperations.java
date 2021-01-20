package src;
import java.util.Locale;
import java.util.Scanner;

public class StringOperations {

    public String StringObj (){

    //StringBuilder
    StringBuilder sbuilder = new StringBuilder("abc");
    sbuilder.append("cde");
        sbuilder.append("...");
        //sbuilder.delete(1,3);
    return sbuilder.toString();
    }
    public String StringConcat ()
    {
        String firstName = "Cristian";
        String lastName = "Fernandez";
        //Strings concat types
        String concatPlus = firstName + lastName ;
        String concatMethod = (firstName.concat("").concat(lastName));
        return concatMethod + concatPlus;
    }

    public String StringIterrations () {
        String a = "Tortle";
        String b = "Eagle";
        String c = "Wale";
        String d = "Bear";
        String e = "Ant";
        String r = "";
        //
        //Create a array of strings
        String[] animals = {a, b, c, d, e};

        for (String x : animals)
        {
            //if(x.contains("le")){}
            r = r.concat(x).concat("-");
        }
        return r;
    }

    public String reverseString(String s)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length()-1;i>=0; i-- )
        {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }


}
