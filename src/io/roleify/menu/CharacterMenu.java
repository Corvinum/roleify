package io.roleify.menu;

import io.roleify.character.CharacterDatabase;
import io.roleify.creator.CharacterCreator;
import io.roleify.modifier.CharacterModifier;
import io.roleify.remover.CharacterRemover;
import io.roleify.utility.*;

public class CharacterMenu extends AbstractMenu{

    @Override
    public void display() {

        do {
            //Separador
            System.out.println("--------------------------------------------------------------------------------------------");
            Colorator.titleMessage("MENU DE PERSONAJES");

            System.out.println("Por favor, selecciona la sección a la que quieras ir introduciendo el numero correspondiente: ");
            System.out.println("1. Creación de personaje:");
            System.out.println("2. Galeria de personajes");
            System.out.println("3. Modificación de personajes");
            System.out.println("4. Eliminación de personajes");
            System.out.println("0. Salir");
            System.out.print("INPUT: ");

            //INPUT DE LA OPCIÓN
            option = InputHandler.readInt();

            //LOGICA DE LA OPCIÓN SELECCIONADA
            switch (option) {
                case 1:
                    CharacterCreator characterCreator = new CharacterCreator();
                    characterCreator.createCharacter();
                    break;
                case 2:
                    CharacterDatabase.getCharacters();
                    break;
                case 3:
                    CharacterModifier characterModifier = new CharacterModifier();
                    characterModifier.modifyCharacter();
                    break;
                case 4:
                    CharacterRemover characterRemover = new CharacterRemover();
                    characterRemover.removeCharacter();
                    break;
                case 0:
                    System.out.println("--------------------------------------------------------------------------------------------");
                    System.out.println("¡SALIENDO AL MENU PRINCIPAL!");
                    System.out.println("--------------------------------------------------------------------------------------------");
                    break;
                default:
                    System.out.println("--------------------------------------------------------------------------------------------");
                    Colorator.redMessage("ERROR: Esa opción no existe :(");
            }
        } while (option != 0);
    }
}