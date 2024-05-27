package io.roleify.modifier;

import io.roleify.character.CharacterDatabase;
import io.roleify.utility.Colorator;
import io.roleify.utility.InputHandler;

import java.util.Locale;

public class CharacterModifier {

    public void modifyCharacter () {
        System.out.println("--------------------------------------------------------------------------------------------");
        if (CharacterDatabase.isEmpty()){
            Colorator.redMessage("ERROR: ¡No tienes personajes!");
        }else {
            Colorator.titleMessage("MODIFICAR PERSONAJE");
            System.out.print("Introduzca el ID del personaje a modificar: ");
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
                    System.out.println("Personaje seleccionado a MODIFICAR:");
                    System.out.println(CharacterDatabase.getCharacter(id));
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
                                CharacterDatabase.getCharacter(id).setName(data);
                                break;
                            case "descripcion":
                            case  "descripción":
                                CharacterDatabase.getCharacter(id).setDescription(data);
                                break;
                        }
                        System.out.println("--------------------------------------------------------------------------------------------");
                        Colorator.greenMessage("¡PERSONAJE MODIFICADO!");
                    } else {
                        Colorator.redMessage("Modificación cancelada");
                    }
                }
            }
        }
    }
}
