import java.util.ArrayList;

public class currentStock {
    protected ArrayList<book> currentBooks = new ArrayList<>();
    protected ArrayList<String> currentIDs = new ArrayList<>();
    protected ArrayList<bookOutOnIssue> booksOutOnIssue = new ArrayList<>();


    public ArrayList<book> getCurrentBooks() {
        return currentBooks;
    }

    public void setCurrentBooks(ArrayList<book> currentBooks) {
        this.currentBooks = currentBooks;
    }

    public ArrayList<String> getCurrentIDs() {
        return currentIDs;
    }

    public void setCurrentIDs(ArrayList<String> currentIDs) {
        this.currentIDs = currentIDs;
    }

    public ArrayList<bookOutOnIssue> getBooksOutOnIssue() {
        return booksOutOnIssue;
    }

    public void setBooksOutOnIssue(ArrayList<bookOutOnIssue> booksOutOnIssue) {
        this.booksOutOnIssue = booksOutOnIssue;
    }



}
