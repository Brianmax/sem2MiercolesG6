package ejercicio4;

public class Book extends LibraryItem {
    private String author;

    public Book(String title, int itemId, boolean isLoaned, String author) {
        super(title, itemId, isLoaned);
        this.author = author;
    }

//    @Override
//    public void showDetails()
//    {
//        System.out.println("Author: " + author);
//        System.out.println("Libro: " + title);
//        System.out.println("Id: " + itemId);
//        System.out.println("Disponibilidad: " + isLoaned);
//    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void showDetails()
    {
        super.showDetails();
        System.out.println(author);
    }
    // sobreescribir el metodo showDetails en la clase dvd
    // para que muestre los atributos propios de la clase
}
