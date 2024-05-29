package io.roleify.menu;

import io.roleify.creator.ItemCreator;
import io.roleify.gallery.ItemGallery;
import io.roleify.modifier.ItemModifier;
import io.roleify.remover.ItemRemover;
import io.roleify.utility.Colorator;
import io.roleify.utility.InputHandler;

public class ItemMenu extends AbstractMenu{

    @Override
    public void display() {

        do {
            //Separador
            System.out.println("--------------------------------------------------------------------------------------------");
            Colorator.titleMessage("MENU DE OBJETOS");

            System.out.println("Por favor, selecciona la sección a la que quieras ir introduciendo el numero correspondiente: ");
            System.out.println("1. Creación de objetos:");
            System.out.println("2. Galeria de objetos");
            System.out.println("3. Modificación de objetos");
            System.out.println("4. Eliminación de objetos");
            System.out.println("0. Salir");
            System.out.print("INPUT: ");

            //INPUT DE LA OPCIÓN
            option = InputHandler.readInt();

            //LOGICA DE LA OPCIÓN SELECCIONADA
            switch (option) {
                case 1:
                    ItemCreator itemCreator = new ItemCreator();
                    itemCreator.createItem();
                    break;
                case 2:
                    ItemGallery.printItems();
                    break;
                case 3:
                    ItemModifier itemModifier = new ItemModifier();
                    itemModifier.modifyItem();
                    break;
                case 4:
                    ItemRemover itemRemover = new ItemRemover();
                    itemRemover.removeItem();
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