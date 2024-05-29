package io.roleify.remover;

import io.roleify.item.ItemDatabase;
import io.roleify.utility.Colorator;
import io.roleify.utility.InputHandler;

public class ItemRemover {
    //DEFAULT CONSTRUCTOR BY COMPILER

    public void removeItem(){
        System.out.println("--------------------------------------------------------------------------------------------");
        if (ItemDatabase.isEmpty()){
            Colorator.redMessage("ERROR: ¡No tienes objetos!");
        }else {
            Colorator.titleMessage("ELIMINAR OBJETO");
            System.out.print("Introduzca el ID del objeto a eliminar: ");
            int id = InputHandler.readInt();
            boolean check = false;
            try {
                ItemDatabase.getItem(id);
                check = true;
            }catch (IndexOutOfBoundsException e){
                System.out.println("--------------------------------------------------------------------------------------------");
                Colorator.redMessage("ERROR: Ese ID de objeto no existe :(");
            } finally {
                if (check) {
                    System.out.println("--------------------------------------------------------------------------------------------");
                    System.out.println("Objeto seleccionado a ELIMINAR:");
                    System.out.println(ItemDatabase.getItem(id));

                    //Confirmación
                    Colorator.yellowMessage(" (S) para confirmar o cualquier otro carácter para cancelar.");
                    System.out.print("RESPUESTA: ");
                    //Sanitizando decisión luego del input
                    String dec = InputHandler.readString().trim().toLowerCase();

                    if (dec.equals("s")) {
                        ItemDatabase.removeItem(id);
                        System.out.println("--------------------------------------------------------------------------------------------");
                        Colorator.greenMessage("¡OBJETO ELIMINADO!");
                    } else {
                        Colorator.redMessage("Eliminación cancelada");
                    }
                }
            }
        }
    }
}