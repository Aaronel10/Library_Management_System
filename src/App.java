import java.util.ArrayList;

public class App {


    public static void main(String[] args) {
        librarian Omar = new librarian("Omar123", "Password123");
        Omar.addBook("Twilight", "Random Author", "12515");
        Omar.addBook("Percy Jackson", "Riordan", "51421");
        Omar.viewBooks();
        System.out.println("Delete book 2");
        Omar.deleteBook("51421");
        Omar.viewBooks();

    }

}
