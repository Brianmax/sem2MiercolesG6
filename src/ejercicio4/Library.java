package ejercicio4;

import java.util.ArrayList;

public class Library {
    private ArrayList<LibraryItem> libraryItems;
    private ArrayList<LibraryUser> users;

    Library(ArrayList<LibraryItem> libraryItems, ArrayList<LibraryUser> users) {
        this.libraryItems = libraryItems;
        this.users = users;
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

    public void addUser(LibraryUser libraryUser)
    {
        boolean isFound = false;

        for (int i = 0; i < users.size(); i++)
        {
            LibraryUser libraryUserArray = users.get(i);
            if (libraryUserArray.getUserId() == libraryUser.getUserId()
                || libraryUserArray.getUsername().equals(libraryUser.getUsername()))
            {
                isFound = true;
                break;
            }
        }
        if (isFound)
        {
            System.out.println("Error en los datos del usuario");
        }
        else {
            users.add(libraryUser);
            System.out.println("Usuario registrado correctamente");
        }
    }
    public void loanItem(int itemId, String username)
    {
        // implementacion
        LibraryItem libraryItem = findItemById(itemId);
        LibraryUser libraryUser = findByUsername(username);
        if (libraryUser == null || libraryItem == null)
        {
            System.out.println("Usuario o item no existen");
            return;
        }
        if (libraryItem.isLoaned())
        {
            System.out.println("El item no esta disponible");
            return;
        }
        libraryUser.getItems().add(libraryItem);
        libraryItem.setLoaned(true);
    }
    public void returnItem(int itemId, String username)
    {
        // implementacion
        // verificar la info
        // cambiar el estado del item devuelto
        // quitar el item de la lista del usuario
    }
    // crear un metodo que permita agregar multiples items
    // al mismo tiempo
    // osea que reciba una lista de items y los agregue
    // a la biblioteca
    // hacer un menu interactivo para poder realizar las
    // operaciones
    public void showAllItems()
    {
        for (LibraryItem item: libraryItems)
        {
            System.out.println("++++++++++++++++++++++");
            if (!item.isLoaned)
            {
                item.showDetails();
            }
        }
    }

    private LibraryItem findItemById(int itemId)
    {
//        for (int i = 0; i < libraryItems.size(); i++)
//        {
//            // implementacion
//            LibraryItem libraryItemArray = libraryItems.get(i);
//        }

        for (LibraryItem item: libraryItems)
        {
            if (item.getItemId() == itemId)
            {
                return item;
            }
        }
        return null;
    }

    private LibraryUser findByUsername(String username)
    {
        for (LibraryUser libraryUser: users)
        {
            if (libraryUser.getUsername().equals(username))
            {
                return libraryUser;
            }
        }
        return null;
    }
}
