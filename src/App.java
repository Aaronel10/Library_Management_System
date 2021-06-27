import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;


public class App {


    public static void main(String[] args) {
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
