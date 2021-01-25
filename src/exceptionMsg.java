package src;

import java.io.*;

public class exceptionMsg {

    public String exceptionTryCatch(){
        String sNull= null;
        String sIndexOut = "";
        //To add try and catch, you can go to the menu, CODE --> Surround it or (Cntrl - Alt - T)
        try {
            //It going to show a error because s is null, and it not have substring.
            var sub = sNull.substring(1);
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Null pointer..");
        }
        try {
            var sub1 = sIndexOut.substring(1);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Index out bounds..");
        }
        return sNull + sIndexOut;
    }

/*  It is possible add more than one catch in one try
   try {
                var test = t.substring(1);
    } catch (NullPointerException e) {
        e.printStackTrace();
        System.out.println("Null pointer..");
    } catch (IndexOutOfBoundsException e) {
        e.printStackTrace();
        System.out.println("Index out bounds..");
    }*/
    //ALSO IT IS POSSIBLE ADD ARG TO THE TRY
    //This help to close the objets and not use memory of the system.
    public String fileExeption(String path)
    {
        var text = "";
        try (FileReader reader = new FileReader(path);
             BufferedReader br = new BufferedReader(reader))
        {
            text = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return text;
    }

}
