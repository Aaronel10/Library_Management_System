import javax.swing.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class App {


    public static void main(String[] args) {
        librarian omar = new librarian("omar", "242", "librarian");
        omar.addBook("percy", "riordan", "4122", "fantasy");
        omar.addBook("zeus", "riordan", "4421", "fantasy");
        omar.addBook("hades", "riordan", "4242", "fantasy");
        omar.issue_book("hades");
        //omar.viewBooksThatAreIssued();
        System.out.println("Current stock");
        //omar.viewBooks();
        omar.return_book("hades");
        omar.viewBooksThatAreIssued();
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
