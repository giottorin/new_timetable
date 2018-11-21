package Main;

import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Read {

    static Map<String, String> dict = new HashMap<String, String>(); // todo private
    // todo add getter

    public static void read () { // todo return map<>
        try (FileReader fr = new FileReader("dict.txt");
             Scanner scan = new Scanner(fr))
        {
            int i = 1;
            while (scan.hasNextLine()) {
                dict.put(scan.nextLine(),scan.nextLine());
                i++;

            }
            fr.close();
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }




    }
}

