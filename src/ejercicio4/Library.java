package ejercicio4;

import java.util.ArrayList;

public class Library {
    private ArrayList<LibraryItem> libraryItems;
    private ArrayList<LibraryUser> libraryUsers;

    Library(ArrayList<LibraryItem> libraryItems, ArrayList<LibraryUser> libraryUsers) {
        this.libraryItems = libraryItems;
        this.libraryUsers = libraryUsers;
    }

    public void addItem(LibraryItem libraryItem) {
        int idItem = libraryItem.getItemId();
        boolean isFound = false;

        for (int i = 0; i < libraryItems.size(); i++)
        {
            LibraryItem libraryItemArray = libraryItems.get(i);
            if (libraryItemArray.getItemId() == libraryItem.itemId)
            {
                isFound = true;
                break;
            }
        }
        if (isFound){
            System.out.println("El ID ya existe");
        }
        else {
            libraryItems.add(libraryItem);
            System.out.println("Item agregado correctamente");
        }
    }
    // crear el metodo para agregar un nuevo usuario
    // reglas para agregar a un usuario:
    // el usuario no debe de tener el campo id repetido
    // el usuario no debe de tener el campo username repetido
}
