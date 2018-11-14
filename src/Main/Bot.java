package Main;

import java.io.*;
import java.util.Scanner;


public class Bot {
    public static void main(String[] args) {
        Read.read();
        Chat chat = new Chat();
        chat.run();



    }
}
