package io.roleify.gallery;

import io.roleify.item.*;
import io.roleify.utility.*;

public class ItemGallery {
    public static void printItems() {
        System.out.println("--------------------------------------------------------------------------------------------");

        if(ItemDatabase.getSize()==0) {
            Colorator.redMessage("No tienes objetos :(");
        } else {
            Colorator.titleMessage("GALERIA(pulsa ENTER para continuar)");
        };

        for (int i = 0; i < ItemDatabase.getItems().size(); i++){
            Item item = ItemDatabase.getItems().get(i);
            System.out.print(item);
            try {
                //Esperar a pulsar ENTER para continuar
                InputHandler.readString();
            } catch (Exception E){}
            if (i != ItemDatabase.getSize()-1){
                System.out.println("--------------------------------------------------------------------------------------------");
            }
        }
    }
}
