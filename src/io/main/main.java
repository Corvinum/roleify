package io.main;

import io.roleify.menu.*;

import java.io.File;
import java.io.IOException;

public class main {
    static void display(){
        MainMenu menu = new MainMenu();
        menu.start();
    }
    public static void main(String[] args) throws IOException {
        display();
    }
}
