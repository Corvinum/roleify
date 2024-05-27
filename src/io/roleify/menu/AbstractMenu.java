package io.roleify.menu;

import java.util.Scanner;

public abstract class AbstractMenu {

    //Atributo que almacena la opción
    int option;

    Scanner reader;

    public abstract void display();
}
