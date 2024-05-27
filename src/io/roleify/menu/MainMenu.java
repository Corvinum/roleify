package io.roleify.menu;

import io.roleify.utility.*;

public class MainMenu extends AbstractMenu{

    @Override
    public void display() {
        //Mensaje de bienvenida
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("¡BIENVENIDO A ROLEIFY!");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.flush();

        do {
            //SEPARADOR
            Colorator.titleMessage("MENU PRINCIPAL");
            System.out.flush();

            System.out.println("Por favor, selecciona la sección a la que quieras ir introduciendo el numero correspondiente: ");
            System.out.println("1. Personajes");
            System.out.println("0. Salir");
            System.out.println("Otras opciones disponibles pronto");
            System.out.print("INPUT: ");
            System.out.flush();

            //INPUT DE LA OPCIÓN
            option = InputHandler.readInt();

            //LOGICA DE LA OPCIÓN SELECCIONADA
            switch (option){
                case 1: CharacterMenu characterMenu = new CharacterMenu();
                    characterMenu.display();
                    break;
                case 0:
                    System.out.println("--------------------------------------------------------------------------------------------");
                    System.out.println("¡HASTA PRONTO! :)");
                    System.out.println("--------------------------------------------------------------------------------------------");
                    System.out.flush();
                    break;
                default:
                    System.out.println("--------------------------------------------------------------------------------------------");
                    Colorator.redMessage("ERROR: Esa opción no existe :(");
                    System.out.println("--------------------------------------------------------------------------------------------");
            }
        }while (option!=0);
    }
}