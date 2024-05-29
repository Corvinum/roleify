package io.roleify.item;

import java.util.ArrayList;
import java.util.List;

public class ItemDatabase {
    static List <Item> items = new ArrayList<>();

    //Añade un objeto a la base de datos local...
    public static void addItem(Item beast){
        items.add(beast);
    }
    // GETTERS
    //Getter del ID de un ITEM
    public static int getItemId(Item item){
        return items.indexOf(item);
    }
    //GETTER de Item por ID
    public static Item getItem(int ID){
        return items.get(ID);
    }

    public static List<Item> getItems(){
        return items;
    }

    public static int getSize(){
        return items.size();
    }


    public static boolean isEmpty(){
        return items.isEmpty();
    }
    public static void removeItem(int id){
        items.remove(id);
    }
}
