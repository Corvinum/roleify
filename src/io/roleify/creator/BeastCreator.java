package io.roleify.creator;

import io.roleify.beast.*;
import io.roleify.utility.*;

public class BeastCreator{
    //CONSTRUCTOR POR DEFECTO

    public void createBeast(){
        System.out.println("--------------------------------------------------------------------------------------------");
        Colorator.titleMessage("CREAR BESTIA");

        System.out.print("Introduzca el nombre de su bestia: ");
        String name = InputHandler.readString();

        //Sanitizando
        name = name.trim();

        if (name.isEmpty()){
            Colorator.redMessage("ERROR: No puedes tener un nombre vacío :(");
        } else {
            System.out.print("Introduzca la descripción de la bestia: ");
            String description = InputHandler.readString();

            //Sanitizando
            description = description.trim();

            System.out.println("--------------------------------------------------------------------------------------------");
            Colorator.greenMessage("Bestia creada con exito :)");
            BeastDatabase.addBeast(new Beast(name, description));
        }
    }
}
