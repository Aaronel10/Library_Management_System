import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class librarian extends User {

    private String username;
    private String password;
    private Scanner input = new Scanner(System.in);

    librarian(String username, String password, String permissions)
    {
        super(username, password, permissions);
    }


    protected void issue_book(String title)
    {
        int index = searchByTitle(title);
        if(index == -1)
        {
            System.out.println("Book not available");
            System.exit(1);
        }
        // getting current book and converting it to book out on issue object
        book book_to_issue = currentBooks.get(index);
        Date cur_date = new Date();
        bookOutOnIssue my_book = new bookOutOnIssue(book_to_issue,cur_date);
        booksOutOnIssue.add(my_book);
        // removing book from current stock until it gets returned
        currentBooks.remove(index);

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

    public void viewBooksThatAreIssued()
    {
        for(bookOutOnIssue novel: booksOutOnIssue)
        {
            System.out.printf("Title: %s, Issue Date: %s, Date to be Returned: %s", novel.getCur_book().getName(), novel.getIssue_date(), novel.getReturn_date());
        }
    }


    public ArrayList<bookOutOnIssue> getBooksOutOnIssues()
    {
        return booksOutOnIssue;
    }





}
