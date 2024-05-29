package io.roleify.gallery;

import io.roleify.beast.*;
import io.roleify.utility.*;

public class BeastGallery {
    public static void printBeasts() {
        System.out.println("--------------------------------------------------------------------------------------------");

        if(BeastDatabase.getSize()==0) {
            Colorator.redMessage("ERROR: No tienes bestias :(");
        } else {
            Colorator.titleMessage("GALERIA(pulsa ENTER para continuar)");
        };

        for (int i = 0; i < BeastDatabase.getBeasts().size(); i++){
            Beast beast = BeastDatabase.getBeasts().get(i);
            System.out.print(beast);
            try {
                //Esperar a pulsar ENTER para continuar
                InputHandler.readString();
            } catch (Exception E){}
            if (i != BeastDatabase.getSize()-1){
                System.out.println("--------------------------------------------------------------------------------------------");
            }
        }
    }
}
