package io.roleify.modifier;

import io.roleify.beast.BeastDatabase;
import io.roleify.utility.Colorator;
import io.roleify.utility.InputHandler;

public class BeastModifier {

    public void modifyBeast () {
        System.out.println("--------------------------------------------------------------------------------------------");
        if (BeastDatabase.isEmpty()){
            Colorator.redMessage("ERROR: ¡No tienes bestias!");
        }else {
            Colorator.titleMessage("MODIFICAR BESTIA");
            System.out.print("Introduzca el ID de la bestia a modificar: ");
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
                    System.out.println("bestia seleccionado a MODIFICAR:");
                    System.out.println(BeastDatabase.getBeast(id));
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
                                BeastDatabase.getBeast(id).setName(data);
                                break;
                            case "descripcion":
                            case  "descripción":
                                BeastDatabase.getBeast(id).setDescription(data);
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
