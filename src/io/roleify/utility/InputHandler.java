package io.roleify.utility;

import java.util.Scanner;

public class InputHandler {
    final private Scanner reader = new Scanner(System.in);

    public int readInt(){
        return reader.nextInt();
    }

    public String readLine(){
        return reader.nextLine();
    }
}
