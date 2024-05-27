package io.roleify.remover;

import io.roleify.character.CharacterDatabase;
import io.roleify.utility.Colorator;
import io.roleify.utility.InputHandler;

import java.util.Locale;

public class CharacterRemover {
    //DEFAULT CONSTRUCTOR BY COMPILER

    public void removeCharacter(){
        System.out.println("--------------------------------------------------------------------------------------------");
        if (CharacterDatabase.isEmpty()){
            Colorator.redMessage("ERROR: ¡No tienes personajes!");
        }else {
            Colorator.titleMessage("MODIFICAR PERSONAJE");
            System.out.print("Introduzca el ID del personaje a borrar: ");
            int id = InputHandler.readInt();
            boolean check = false;
            try {
                CharacterDatabase.getCharacter(id);
                check = true;
            }catch (IndexOutOfBoundsException e){
                System.out.println("--------------------------------------------------------------------------------------------");
                Colorator.redMessage("ERROR: Ese ID de personaje no existe :(");
            } finally {
                if (check) {
                    System.out.println("--------------------------------------------------------------------------------------------");
                    System.out.println("Personaje seleccionado a ELIMINAR:");
                    System.out.println(CharacterDatabase.getCharacter(id));

                    //Confirmación
                    Colorator.yellowMessage(" (S) para confirmar o cualquier otro caracter para cancelar.");
                    System.out.print("RESPUESTA: ");
                    //Sanitizando decisión luego del input
                    String dec = InputHandler.readString().trim().toLowerCase();

                    if (dec.equals("s")) {
                        CharacterDatabase.removeCharacter(id);
                        System.out.println("--------------------------------------------------------------------------------------------");
                        Colorator.greenMessage("¡PERSONAJE ELIMINADO!");
                    } else {
                        Colorator.redMessage("Eliminación cancelada");
                    }
                }
            }
        }
    }
}