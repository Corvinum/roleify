package io.roleify.utility;

public class Colorator {

    public static void redMessage(String message){
        System.out.println("\u001B[31m" + message + "\u001B[0m");
    }

    public static void yellowMessage(String message){
        System.out.println("\u001B[33m" + message + "\u001B[0m");
    }

    public static void greenMessage(String message){
        System.out.println("\u001B[32m" + message + "\u001B[0m");
    }

    public static void titleMessage(String message){
        System.out.println("\u001B[1m" + message + "\u001B[0m");
    }

}