public class book {
    private String name;
    private String author;
    private String ID;
    private String genre;
    private boolean available;

    public book(String name, String author, String ID, String genre){
        this.name = name;
        this.author = author;
        this.ID = ID;
        this.genre = genre;
        available = true;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }



}
