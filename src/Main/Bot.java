package Main;

import java.io.*;
import java.util.Scanner;


public class Bot {
    public static void main(String[] args) {
        Read.read(); // todo map
        Chat chat = new Chat(); // todo inject map
        chat.run();



    }
}
