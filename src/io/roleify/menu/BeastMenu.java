package io.roleify.menu;

import io.roleify.beast.BeastDatabase;
import io.roleify.creator.BeastCreator;
import io.roleify.gallery.BeastGallery;
import io.roleify.modifier.BeastModifier;
import io.roleify.remover.BeastRemover;
import io.roleify.utility.*;

public class BeastMenu extends AbstractMenu{

    @Override
    public void display() {

        do {
            //Separador
            System.out.println("--------------------------------------------------------------------------------------------");
            Colorator.titleMessage("MENU DE BESTIAS");

            System.out.println("Por favor, selecciona la sección a la que quieras ir introduciendo el numero correspondiente: ");
            System.out.println("1. Creación de bestia");
            System.out.println("2. Galeria de bestias");
            System.out.println("3. Modificación de bestias");
            System.out.println("4. Eliminación de bestias");
            System.out.println("0. Salir");
            System.out.print("INPUT: ");

            //INPUT DE LA OPCIÓN
            option = InputHandler.readInt();

            //LOGICA DE LA OPCIÓN SELECCIONADA
            switch (option) {
                case 1:
                    BeastCreator beastCreator = new BeastCreator();
                    beastCreator.createBeast();
                    break;
                case 2:
                    BeastGallery.printBeasts();
                    break;
                case 3:
                    BeastModifier beastModifier = new BeastModifier();
                    beastModifier.modifyBeast();
                    break;
                case 4:
                    BeastRemover beastRemover = new BeastRemover();
                    beastRemover.removeBeast();
                    break;
                case 0:
                    System.out.println("--------------------------------------------------------------------------------------------");
                    System.out.println("¡SALIENDO AL MENU PRINCIPAL!");
                    System.out.println("--------------------------------------------------------------------------------------------");
                    break;
                default:
                    System.out.println("--------------------------------------------------------------------------------------------");
                    Colorator.redMessage("ERROR: Esa opción no existe :(");
            }
        } while (option != 0);
    }
}