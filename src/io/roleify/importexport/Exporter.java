package io.roleify.importexport;

import io.roleify.beast.*;
import io.roleify.character.Character;
import io.roleify.character.CharacterDatabase;
import io.roleify.item.*;
import io.roleify.utility.Colorator;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Exporter {

    public static void exportfile(){
        String newLn = System.lineSeparator();

        File myFile = new File("roleify.txt");
        System.out.println(myFile.getAbsoluteFile());

        try {
            myFile.createNewFile();
            PrintWriter myPrintWriter = new PrintWriter(myFile);

            myPrintWriter.write("roleify{" + newLn);
            myPrintWriter.write("   personajes{" + newLn);

            //Comprobación de la existencia de personajes
            if (!CharacterDatabase.isEmpty()){
                for (Character character : CharacterDatabase.getCharacters()) {
                    myPrintWriter.write("       personaje: \"" + character.getName() + "\"" + newLn);
                    myPrintWriter.write("       descripción: \"" + character.getDescription() + "\"" + newLn);

                    if (character == CharacterDatabase.getCharacter(CharacterDatabase.getSize()-1)){
                        myPrintWriter.write("   }");
                    }
                }
            } else {
                myPrintWriter.write("       empty" + newLn);
                myPrintWriter.write("   }" + newLn);
            }

            myPrintWriter.write("   bestias{" + newLn);
            //Comprobación de la existencia de bestias
            if (!BeastDatabase.isEmpty()){
                for (Beast beast : BeastDatabase.getBeasts()) {
                    myPrintWriter.write("       nombre: \"" + beast.getName() + "\"" + newLn);
                    myPrintWriter.write("       descripción: \"" + beast.getDescription() + "\"" + newLn);

                    if (beast == BeastDatabase.getBeast(BeastDatabase.getSize()-1)){
                        myPrintWriter.write("   }" + newLn);
                    }
                }
            } else {
                myPrintWriter.write("       empty" + newLn);
                myPrintWriter.write("   }" + newLn);
            }

            myPrintWriter.write("   objetos{" + newLn);
            //Comprobación de la existencia de personajes
            if (!ItemDatabase.isEmpty()){
                for (Item myItem : ItemDatabase.getItems()) {
                    myPrintWriter.write("       nombre: \"" + myItem.getName() + "\"" +  newLn);
                    myPrintWriter.write("       descripción: \"" + myItem.getDescription() +"\"" + newLn);

                    if (myItem == ItemDatabase.getItem(ItemDatabase.getSize()-1)){
                        myPrintWriter.write("   }" + newLn);
                    }
                }
            } else {
                myPrintWriter.write("       empty" + newLn);
                myPrintWriter.write("   }" + newLn);
            }
            myPrintWriter.write("}");
            myPrintWriter.close();

            System.out.println("--------------------------------------------------------------------------------------------");
            Colorator.greenMessage("Datos importados :)");
            System.out.println("--------------------------------------------------------------------------------------------");
        } catch (IOException e){
            System.out.println("NO SE CREO EL ARCHIVO");
        }
    }
}
