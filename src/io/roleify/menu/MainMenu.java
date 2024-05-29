package io.roleify.menu;

import io.roleify.importexport.Exporter;
import io.roleify.importexport.Importer;
import io.roleify.utility.*;

public class MainMenu extends AbstractMenu{

    @Override
    public void display() {
        //Mensaje de bienvenida
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("¡BIENVENIDO A ROLEIFY!");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.flush();

        do {
            //SEPARADOR
            Colorator.titleMessage("MENU PRINCIPAL");
            System.out.flush();

            System.out.println("Por favor, selecciona la sección a la que quieras ir introduciendo el numero correspondiente: ");
            System.out.println("1. Personajes");
            System.out.println("2. Bestias");
            System.out.println("3. Objetos");
            System.out.println("4. Exportar");
//            System.out.println("5. Importar");
            System.out.println("0. Salir");
            System.out.println("Otras opciones disponibles pronto");
            System.out.print("INPUT: ");
            System.out.flush();

            //INPUT DE LA OPCIÓN
            option = InputHandler.readInt();

            //LOGICA DE LA OPCIÓN SELECCIONADA
            switch (option){
                case 1: CharacterMenu myCharacterMenu = new CharacterMenu();
                    myCharacterMenu.display();
                    break;
                case 2: BeastMenu myBeastMenu = new BeastMenu();
                    myBeastMenu.display();
                    break;
                case 3:
                    ItemMenu myItemMenu = new ItemMenu();
                    myItemMenu.display();
                    break;
                case 4:
                    Exporter myExporter = new Exporter();
                    myExporter.exportfile();
                    break;
//                case 5:
//                    Importer myImporter = new Importer();
//                    myImporter.importfile();
                case 0:
                    System.out.println("--------------------------------------------------------------------------------------------");
                    System.out.println("¡HASTA PRONTO! :)");
                    System.out.println("--------------------------------------------------------------------------------------------");
                    System.out.flush();
                    break;
                default:
                    System.out.println("--------------------------------------------------------------------------------------------");
                    Colorator.redMessage("ERROR: Esa opción no existe :(");
                    System.out.println("--------------------------------------------------------------------------------------------");
            }
        }while (option!=0);
    }
}