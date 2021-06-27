import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;


public class App {


    public static void main(String[] args) {
        librarian omar = new librarian("omar", "242","librarian");
        User aaron = new User("Aaron", "24", "user");
        omar.addBook("percy", "riordan", "41", "fantasy");
        ArrayList<book> my_book = aaron.searchBook("percy", true);
        for(book novel: my_book)
        {
            System.out.println(novel.getName());
        }

    }

    public static void login()
    {
        try
        {
            //create instance of the CreateLoginForm
            CreateLoginForm form = new CreateLoginForm();
            form.setSize(500,200);  //set size of the frame
            form.setVisible(true);  //make form visible to the user
        }
        catch(Exception e)
        {
            //handle exception
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }


}
