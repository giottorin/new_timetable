package Main;

import sun.applet.Main;

import java.util.Scanner;

public class Chat {

    public void run(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello \n"+ GetAnser("help"));
        while (true){
            String s = scan.nextLine().toLowerCase();
            if (s.equals("exit"))
                break;
            else
                System.out.println(GetAnser(s));
        }
        scan.close();
    }
    public static String GetAnser(String str) {
        String x = Read.dict.get(str);
        return x;
    }

}
