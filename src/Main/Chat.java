package Main;

import sun.applet.Main;

import java.util.Scanner;

public class Chat {

    // todo add map field


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
    public String getanser(String str) { // todo camel case
        String x = Read.dict.get(str);
        return x;
    }

}
