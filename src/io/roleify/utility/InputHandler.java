package io.roleify.utility;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputHandler {
    private static final  Scanner reader = new Scanner(System.in);

    //ENTRADA DE CADENAS
    public static String readString() {
        return reader.nextLine();
    }

    //ENTRADA DE ENTEROS
    public static int readInt() {
        try {
            int number = reader.nextInt();
            reader.nextLine();
            return number;
        } catch (InputMismatchException e){
            reader.nextLine();
            return -1;
        }
    }
}