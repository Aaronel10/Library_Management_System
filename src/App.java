import javax.swing.*;
import java.util.*;


public class App {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // create user interface
        int response = checkUser();
        if (response == 1)
        {
            librarianApp.runLibrarianMenu();
        } else
        {
            userApp.runUserMenu();
        }
    }

    private static int checkUser() {
        int index = -1;
        System.out.printf("Press 0 for User or 1 for Librarian\n");
        do{
            try{
                index = input.nextInt();
            } catch (InputMismatchException e)
            {
                System.out.println("Answer must be between 0 and 1 inclusive\n");
            } finally {
                input.nextLine();
            }
        } while (index != 1 && index != 0);
        return index;
    }

    private void menu()
    {
        while(true)
        {



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
