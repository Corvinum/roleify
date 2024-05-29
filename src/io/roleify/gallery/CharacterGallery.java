package io.roleify.gallery;

import io.roleify.character.*;
import io.roleify.character.Character;
import io.roleify.utility.*;

public class CharacterGallery {
    public static void printCharacters() {
        System.out.println("--------------------------------------------------------------------------------------------");

        if(CharacterDatabase.getSize()==0) {
            Colorator.redMessage("No tienes personajes :(");
        } else {
            Colorator.titleMessage("GALERIA(pulsa ENTER para continuar)");
        };

        for (int i = 0; i < CharacterDatabase.getCharacters().size(); i++){
            Character character = CharacterDatabase.getCharacters().get(i);
            System.out.print(character);
            try {
                //Esperar a pulsar ENTER para continuar
                InputHandler.readString();
            } catch (Exception E){}
            if (i != CharacterDatabase.getSize()-1){
                System.out.println("--------------------------------------------------------------------------------------------");
            }
        }
    }
}
