package io.roleify.character;

import io.roleify.utility.Colorator;
import io.roleify.utility.InputHandler;
import java.util.ArrayList;
import java.util.List;

public class CharacterDatabase {
    static List <Character> characters = new ArrayList<>();

    //Añadir personajes a la base de datos local...
    public static void addCharacter(Character character){
        characters.add(character);
    }

    public static int getCharacterId(Character character){
        return characters.indexOf(character);
    }
    //GETTER DE 1 CHARACTER POR ID
    public static Character getCharacter(int ID){
        return characters.get(ID);
    }
    // GETTER DE TODOS LOS CHARACTERS
    public static void getCharacters() {
        System.out.println("--------------------------------------------------------------------------------------------");

        if(characters.size()==0) {
            Colorator.redMessage("No tienes personajes :(");
        } else {
            Colorator.titleMessage("GALERIA(pulsa ENTER para continuar)");
        };

        for (Character character : characters){
            System.out.print(character);
            try {
                //Esperar a pulsar ENTER para continuar
                InputHandler.readString();
            } catch (Exception E){}
            if (character != characters.get(characters.size()-1)){
                System.out.println("--------------------------------------------------------------------------------------------");
            }
        }
    }

    public static boolean isEmpty(){
        return characters.isEmpty();
    }
    public static void removeCharacter(int id){
        characters.remove(id);
    }
}
