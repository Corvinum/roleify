package io.roleify.modifier;

import io.roleify.item.ItemDatabase;
import io.roleify.utility.Colorator;
import io.roleify.utility.InputHandler;

public class ItemModifier {

    public void modifyItem () {
        System.out.println("--------------------------------------------------------------------------------------------");
        if (ItemDatabase.isEmpty()){
            Colorator.redMessage("ERROR: ¡No tienes bestias!");
        }else {
            Colorator.titleMessage("MODIFICAR BESTIA");
            System.out.print("Introduzca el ID de la bestia a modificar: ");
            int id = InputHandler.readInt();
            boolean check = false;
            try {
                ItemDatabase.getItem(id);
                check = true;
            }catch (IndexOutOfBoundsException e){
                System.out.println("--------------------------------------------------------------------------------------------");
                Colorator.redMessage("ERROR: Ese ID de bestia no existe :(");
            } finally {
                if (check) {
                    System.out.println("--------------------------------------------------------------------------------------------");
                    System.out.println("bestia seleccionado a MODIFICAR:");
                    System.out.println(ItemDatabase.getItem(id));
                    //Confirmación de opción
                    System.out.println("Introduzca el campo que desee modificar(excepto ID):");
                    String field = InputHandler.readString().trim().toLowerCase();

                    System.out.println("Introduzca el valor que desee establecer:");
                    String data = InputHandler.readString();

                    //Confirmación
                    Colorator.yellowMessage(" (S) para confirmar o cualquier otro caracter para cancelar.");
                    String dec = InputHandler.readString();

                    //Sanitizando decisión
                    dec = dec.trim().toLowerCase();

                    if (dec.equals("s")) {
                        switch (field){
                            case "nombre":
                                ItemDatabase.getItem(id).setName(data);
                                break;
                            case "descripcion":
                            case  "descripción":
                                ItemDatabase.getItem(id).setDescription(data);
                                break;
                        }
                        System.out.println("--------------------------------------------------------------------------------------------");
                        Colorator.greenMessage("¡BESTIA MODIFICADA!");
                    } else {
                        Colorator.redMessage("Modificación cancelada");
                    }
                }
            }
        }
    }
}
