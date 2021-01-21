package src;
import java.util.Arrays;
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
    //How many senteces in a paragraph
    public int sentecesString(String s){
        //Count how many senteces are in a paragraph
        String[] senteces = s.split("\\.");
        return senteces.length;
    }
    //How many words
    public int wordCount (String s){
        String[] words = s.split(" ");
        return words.length;
    }
    //to replace
    //String stg = text.replace("word_to_replace", "replace")
    public String countVowelsConsonants(String str)
    {
        String s = (str.toLowerCase().trim());
        char[] charArray = s.toCharArray();
        int countVowels = 0;
        int countConsonants = 0;
        //TYPE 1 char[] vowels = {'a','e','i','o','u','y'};
        String vowels = "aeiouy";
        for (char a: charArray){
            //TYPE 1
            //if(a == vowels[0] || a == vowels[1]  ||  a == vowels[2] || a == vowels[3] || a == vowels[4] || a == vowels[5])
            if (vowels.indexOf(a)!=-1)
            {
                countVowels++;
            }
            else {
                countConsonants++;
            }
        }
        return "Count of vowels: "+countVowels + "  Count of consonants:  "+countConsonants;
    }

}
