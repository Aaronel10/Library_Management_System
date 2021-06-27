import java.util.ArrayList;

public class librarian extends User {

    private String username;
    private String password;



    librarian(String username, String password, String permissions)
    {
        super(username, password, permissions);
    }


    protected void issue_books()
    {

    }


    protected void deleteBook(String ID)
    {
        int index = currentIDs.indexOf(ID);
        currentBooks.remove(index);
        currentIDs.remove(index);
    }

    protected void addBook(String name, String author, String ID, String genre)
    {
        if(currentIDs.contains(ID))
        {
            System.out.println("Current ID is already taken plz generate another one");
            return;
        }
        book Book = new book(name, author, ID, genre);
        currentBooks.add(Book);
        currentIDs.add(ID);
    }

    public void viewBooks()
    {
        for (book novel: currentBooks)
        {
            System.out.printf("%s: %s: %s\n", novel.getName(), novel.getAuthor(), novel.getID());
        }
    }

    public ArrayList<book> getCurrentBooks()
    {
        return currentBooks;
    }






}
