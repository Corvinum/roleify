package io.roleify.creator;

import io.roleify.item.*;
import io.roleify.utility.*;

public class ItemCreator{
    //CONSTRUCTOR POR DEFECTO

    public void createItem(){
        System.out.println("--------------------------------------------------------------------------------------------");
        Colorator.titleMessage("CREAR OBJETO");

        System.out.print("Introduzca el nombre de su objeto: ");
        String name = InputHandler.readString();

        //Sanitizando
        name = name.trim();

        if (name.isEmpty()){
            Colorator.redMessage("ERROR: No puedes tener un nombre vacío :(");
        } else {
            System.out.print("Introduzca la descripción del objeto: ");
            String description = InputHandler.readString();

            //Sanitizando
            description = description.trim();

            System.out.println("--------------------------------------------------------------------------------------------");
            Colorator.greenMessage("Objeto creado con exito :)");
            ItemDatabase.addItem(new Item(name, description));
        }
    }
}
