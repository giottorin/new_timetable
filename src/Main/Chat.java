package Main;

import sun.applet.Main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Chat {


    Read read = new Read();
    private Map<String, String> dictionary = read.read();


    public void run(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Hello \n"+ getanser("help"));
        while (true){
            String s = scan.nextLine().toLowerCase();
            if (s.equals("exit"))
                break;
            else
                System.out.println(getanser(s));
        }
        scan.close();
    }

    public String getanser(String str) {
        String x = dictionary.get(str);
        return x;
    }


}
