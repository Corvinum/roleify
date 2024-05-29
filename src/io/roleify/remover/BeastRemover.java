package io.roleify.remover;

import io.roleify.beast.BeastDatabase;
import io.roleify.utility.Colorator;
import io.roleify.utility.InputHandler;

public class BeastRemover {
    //DEFAULT CONSTRUCTOR BY COMPILER

    public void removeBeast(){
        System.out.println("--------------------------------------------------------------------------------------------");
        if (BeastDatabase.isEmpty()){
            Colorator.redMessage("ERROR: ¡No tienes bestias!");
        }else {
            Colorator.titleMessage("MODIFICAR BESTIA");
            System.out.print("Introduzca el ID de la bestia a eliminar: ");
            int id = InputHandler.readInt();
            boolean check = false;
            try {
                BeastDatabase.getBeast(id);
                check = true;
            }catch (IndexOutOfBoundsException e){
                System.out.println("--------------------------------------------------------------------------------------------");
                Colorator.redMessage("ERROR: Ese ID de bestia no existe :(");
            } finally {
                if (check) {
                    System.out.println("--------------------------------------------------------------------------------------------");
                    System.out.println("Bestia seleccionada a ELIMINAR:");
                    System.out.println(BeastDatabase.getBeast(id));

                    //Confirmación
                    Colorator.yellowMessage(" (S) para confirmar o cualquier otro caracter para cancelar.");
                    System.out.print("RESPUESTA: ");
                    //Sanitizando decisión luego del input
                    String dec = InputHandler.readString().trim().toLowerCase();

                    if (dec.equals("s")) {
                        BeastDatabase.removeBeast(id);
                        System.out.println("--------------------------------------------------------------------------------------------");
                        Colorator.greenMessage("¡BESTIA ELIMINADO!");
                    } else {
                        Colorator.redMessage("Eliminación cancelada");
                    }
                }
            }
        }
    }
}