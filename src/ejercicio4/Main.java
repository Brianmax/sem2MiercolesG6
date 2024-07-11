package ejercicio4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(
                "Abril Rojo",
                1,
                true,
                "Santiago Roncagliolo");

        book1.showDetails();

        LibraryItem book2 = new Book(
                "Harry Potter",
                2,
                true,
                "J.K Rowling");
        LibraryItem dvd1 = new DVD(
                "Spiderman",
                4,
                true,
                "Sam Raymi",
                120);

        ArrayList<LibraryItem> items = new ArrayList<>();
        items.add(book2);
        items.add(dvd1);

        ArrayList<Book> bookItems = new ArrayList<>();
        bookItems.add(book1);
    }
}
