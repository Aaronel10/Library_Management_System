import java.util.ArrayList;

public class librarian {
    protected ArrayList<book> currentBooks = new ArrayList<>();
    protected ArrayList<String> currentIDs = new ArrayList<>();

    protected void deleteBook(String ID)
    {
        int index = currentIDs.indexOf(ID);
        currentBooks.remove(index);
        currentIDs.remove(index);
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String username;
    private String password;

    public librarian(String username, String password){
        this.username = username;
        this.password = password;
    }

    protected void addBook(String name, String author, String ID)
    {
        if(currentIDs.contains(ID))
        {
            System.out.println("Current ID is already taken plz generate another one");
            return;
        }
        book Book = new book(name, author, ID);
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
