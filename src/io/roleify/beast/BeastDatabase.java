package io.roleify.beast;

import io.roleify.utility.Colorator;
import io.roleify.utility.InputHandler;
import java.util.ArrayList;
import java.util.List;

public class BeastDatabase {
    static List <Beast> beasts = new ArrayList<>();

    //Añade bestias a la base de datos local...
    public static void addBeast(Beast beast){
        beasts.add(beast);
    }
    // GETTERS
    //Getter del ID de un BEAST
    public static int getBeastId(Beast beast){
        return beasts.indexOf(beast);
    }
    //GETTER de Beast por  ID
    public static Beast getBeast(int ID){
        return beasts.get(ID);
    }


    public static List<Beast> getBeasts(){
        return beasts;
    }

    public static int getSize(){
        return beasts.size();
    }


    public static boolean isEmpty(){
        return beasts.isEmpty();
    }
    public static void removeBeast(int id){
        beasts.remove(id);
    }
}
