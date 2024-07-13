package ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(
                "Abril Rojo",
                1,
                false,
                "Santiago Roncagliolo");

        LibraryItem book2 = new Book(
                "Harry Potter",
                2,
                false,
                "J.K Rowling");
        LibraryItem dvd1 = new DVD(
                "Spiderman",
                4,
                false,
                "Sam Raymi",
                120);

        LibraryItem dvd2 = new DVD(
                "Transformers 2",
                5,
                false,
                "Michael Bay",
                120);

        LibraryItem book3 = new Book(
                "No se lo digas a nadie",
                6,
                false,
                "Jaime Bayli"
        );

        ArrayList<LibraryItem> libraryItems = new ArrayList<>();
        ArrayList<LibraryUser> libraryUsers = new ArrayList<>();
        Library library1 = new Library(
                libraryItems,
                libraryUsers);

        library1.addItem(book1);
        library1.addItem(book2);
        library1.addItem(book3);
        library1.addItem(dvd1);
        library1.addItem(dvd2);

        LibraryUser libraryUser1 = new LibraryUser(
                "george_12",
                1,
                new ArrayList<LibraryItem>()
                );
        LibraryUser libraryUser2 = new LibraryUser(
                "pedro_12",
                2,
                new ArrayList<LibraryItem>()
        );
        LibraryUser libraryUser3 = new LibraryUser(
                "andrea_08",
                3,
                new ArrayList<LibraryItem>()
        );
        LibraryUser libraryUser4 = new LibraryUser(
                "vero_12",
                4,
                new ArrayList<LibraryItem>()
        );
        LibraryUser libraryUser5 = new LibraryUser(
                "fiore_78",
                5,
                new ArrayList<LibraryItem>()
        );

        library1.addUser(libraryUser1);
        library1.addUser(libraryUser2);
        library1.addUser(libraryUser3);
        library1.addUser(libraryUser4);
        library1.addUser(libraryUser5);

        library1.loanItem(1, "fiore_78");
        //library1.showAllItems();
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("1. Ingresar un DVD");
            System.out.println("2. Ingresar un Libro");
            System.out.println("3. Ingresar un usuario");
            System.out.println("4. Prestar un item");
            System.out.println("5. Mostrar todos los items");
            System.out.println("0. Salir");

            int opcion = sc.nextInt();

            if (opcion == 1)
            {
                System.out.println("Ingrese el titulo");
                sc.nextLine();
                String titulo = sc.nextLine();
                System.out.println("Ingrese el Id");
                int idItem = sc.nextInt();

                System.out.println("Ingrese el director");
                sc.nextLine();
                String director = sc.nextLine();
                System.out.println("Ingrese la duracion");
                int duracion = sc.nextInt();
                DVD dvd = new DVD(titulo, idItem, false, director, duracion);
                library1.addItem(dvd);
            }
            else if (opcion==2)
            {
                // insertamos un libro
            }
            else if (opcion==3)
            {
                // insertar un usuario
            }
            else if (opcion==4)
            {
                // prestar un item
            }
            else if (opcion==5)
            {
                library1.showAllItems();
            }
            else if (opcion==0) {
                break;
            }
        }
    }
}
