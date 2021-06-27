import java.util.ArrayList;

public class User extends currentStock{
    private String username;
    private String password;



    public String getPermissions() {
        return permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    private String permissions;

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

    protected ArrayList<book> searchBook(String arg, boolean isTitle) // Is either title or autho name, if boolean is false its author name
    {
        ArrayList<book> booksThatMatch = new ArrayList<>();
        for(book novel: currentBooks)
        {
            if(!isTitle)
            {
                if(novel.getAuthor().equalsIgnoreCase(arg))
                {
                    booksThatMatch.add(novel);
                }
            } else{
                if(novel.getName().equalsIgnoreCase(arg))
                {
                    booksThatMatch.add(novel);
                }
            }
        }
        if(booksThatMatch.size() == 0)
        {
            System.out.println("No matches found\n");
        }
        return booksThatMatch;
    }


}
