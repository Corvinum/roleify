package io.roleify.menu;

import io.roleify.utility.InputHandler;
import io.roleify.creator.CharacterCreator;

public class CharacterMenu extends AbstractMenu{

    @Override
    public void start() {
        System.out.println("Por favor, selecciona una opción introduciendo el numero: ");
        System.out.println("1. Creación de personaje:");
        System.out.println("2.Galeria de personajes");
        System.out.println("0.Salir");
        System.out.print("INPUT: ");

        switch (option){
            case 1: CharacterCreator characterCreator = new CharacterCreator();
                characterCreator.start();
                break;
            case 2 : System.out.println("2");
            case 3: System.out.println("3");
            case 0: System.out.println("¡HASTA PRONTO!");
    }
    //ATTRIBS

    }
}