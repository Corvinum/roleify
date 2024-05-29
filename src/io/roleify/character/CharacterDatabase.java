package io.roleify.character;

import java.util.ArrayList;
import java.util.List;

public class CharacterDatabase {
    static List <Character> characters = new ArrayList<>();

    //Añadir personajes a la base de datos local...
    public static void addCharacter(Character character){
        characters.add(character);
    }
    // GETTERS
    //Getter del ID de un CHARACTER
    public static int getCharacterId(Character character){
        return characters.indexOf(character);
    }
    //GETTER de Character por ID
    public static Character getCharacter(int ID){
        return characters.get(ID);
    }


    public static List<Character> getCharacters(){
        return characters;
    }

    public static int getSize(){
        return characters.size();
    }

    public static boolean isEmpty(){
        return characters.isEmpty();
    }
    public static void removeCharacter(int id){
        characters.remove(id);
    }
}
