package io.roleify.creator;

import io.roleify.character.Character;
import io.roleify.character.CharacterDatabase;
import io.roleify.utility.Colorator;
import io.roleify.utility.InputHandler;

public class CharacterCreator {
    //CONSTRUCTOR POR DEFECTO

    public void createCharacter(){
        System.out.println("--------------------------------------------------------------------------------------------");
        Colorator.titleMessage("CREAR PERSONAJE");

        System.out.print("Introduzca el nombre de su personaje: ");
        String name = InputHandler.readString();

        //Sanitizando
        name = name.trim();

        if (name.isEmpty()){
            Colorator.redMessage("ERROR: No puedes tener un nombre vacío :(");
        } else {
            System.out.print("Introduzca la descripción del personaje: ");
            String description = InputHandler.readString();

            //Sanitizando
            description = description.trim();

            System.out.println("--------------------------------------------------------------------------------------------");
            Colorator.greenMessage("Personaje creado con exito :)");
            CharacterDatabase.addCharacter(new Character(name, description));
        }

    }
}
