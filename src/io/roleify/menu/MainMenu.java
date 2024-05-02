package io.roleify.menu;

import java.util.Scanner;

public class MainMenu extends AbstractMenu{
    //ATTRIBS
    int option;
    Scanner reader;

    @Override
    public void start() {
        while (option!=0){
            System.out.println("¡BIENVENIDO A ROLEIFY!");
            System.out.println("Por favor, selecciona la sección a la que quieras ir introduciendo el numero correspondiente: ");
            System.out.println("1.Personajes");
            System.out.println("2.Razas");
            System.out.println("3.Objetos");
            System.out.println("0.Salir");
            System.out.print("INPUT: ");
            option = reader.nextInt();
            switch (option){
                case 1: CharacterMenu characterMenu = new CharacterMenu();
                    characterMenu.start(); break;
                case 2 : ;
                case 3: ;
                case 0: System.out.println("¡HASTA PRONTO!");
            }
        }
    }
}