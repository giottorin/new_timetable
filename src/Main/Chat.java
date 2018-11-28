package Main;

import sun.applet.Main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Chat {


    public void run(){
        Read reader = new Read();
        Map<String, String>dict = reader.read();
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello \n"+ dict.get("help"));
        while (true){
            String s = scan.nextLine().toLowerCase();
            if (s.equals("exit"))
                break;
            else
                System.out.println(dict.get(s));
        }
        scan.close();
    }


}
