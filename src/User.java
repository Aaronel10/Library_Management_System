import java.util.ArrayList;

public class User extends currentStock{
    private String username;
    private String password;
    private String permissions;


    public String getPermissions() {
        return permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
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


    User(String username, String password, String permissions)
    {
        this.username = username;
        this.password = password;
        this.permissions = permissions;

    }
    User()
    {
        System.out.println("Error need information to create account");
        System.exit(1);
    }

    protected ArrayList<book> searchBookByAuthor(String author) // returns a array list of books that have the same author
    {
        ArrayList<book> booksThatMatch = new ArrayList<>();
        for(book novel: currentBooks)
        {
                if(novel.getAuthor().equalsIgnoreCase(author))
                {
                    booksThatMatch.add(novel);
                }

        }
        if(booksThatMatch.size() == 0)
        {
            System.out.println("No matches found\n");
        }
        return booksThatMatch;
    }

    protected int searchByTitle(String title)
    {
        for(book novel: currentBooks)
        {
            if(novel.getName()!= null && novel.getName().equalsIgnoreCase(title)){
                int index = currentBooks.indexOf(novel);
                return index;
            }
        }

        return -1;
    }



}
