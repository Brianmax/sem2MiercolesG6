package ejercicio4;

import java.util.ArrayList;

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
    }
}
