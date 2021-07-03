//import required classes and packages  
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


//create CreateLoginForm class to create login form  
//class extends JFrame to create a window where our component add  
//class implements ActionListener to perform an action on button click  
class CreateLoginForm extends JFrame implements ActionListener
{
  JButton button1;
  JPanel newPanel;
  JLabel usernameLabel, passwordLabel;
  final JTextField textField1, textField2;
  ArrayList<User> users = new ArrayList<>();
  // librarian aaron = new librarian("aaronel@gmail.com", "password123", "administrator");
  public boolean isLibrarian;

  JComboBox cb;
  //calling constructor
    CreateLoginForm()
    {
        usernameLabel = new JLabel(); //making label for username
        usernameLabel.setText("Username");

        textField1 = new JTextField(15); // length for username

        passwordLabel = new JLabel(); //creating label for password
        passwordLabel.setText("Password");

        textField2 = new JTextField(15); // length for password

        button1 = new JButton("Submit"); // making submit button

        // make panel and put form elements
        newPanel = new JPanel(new GridLayout(3, 1));
        newPanel.add(usernameLabel);
        newPanel.add(textField1);
        newPanel.add(passwordLabel);
        newPanel.add(textField2);
        String[] choices = {"", "Librarian", "User"};
        cb = new JComboBox<>(choices);
        cb.setVisible(true);
        newPanel.add(cb);
        cb.addActionListener(this);
        newPanel.add(button1);

        // set border to panel
        add(newPanel, BorderLayout.CENTER);
        setTitle("Login Form");
        // perform an action on button click
        button1.addActionListener(this); // add action lister to button this just calls the action performed function when it gets clicked;

    }
    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource() == cb)
        {
            if(cb.getSelectedItem() == "Librarian") {
                isLibrarian = true;
            }
            if(cb.getSelectedItem() == "User")
            {
                isLibrarian = false;
            }
             return;
        }

        String usernameValue = textField1.getText();
        String passwordValue = textField2.getText();

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/library_database", "root", "rootpassword");

            Statement statement = connection.createStatement();

            String src = "";
            if (isLibrarian)
            {
                src = "librarian_accounts";
            }else
            {
                src = "user_accounts";
            }
            ResultSet resultSet = statement.executeQuery("select username, password from " + src);

            while(resultSet.next())
            {
                if(resultSet.getString(1)!= null && resultSet.getString(1).equals(usernameValue))
                {
                    if(resultSet.getString(2) != null && resultSet.getString(2).equals(passwordValue))
                    {
                        JOptionPane.showMessageDialog(this, "Login successful");

                        JComponent comp = (JComponent) ae.getSource();
                        Window win = SwingUtilities.getWindowAncestor(comp);
                        win.dispose();
                        if(isLibrarian)
                        {
                            librarian_menu ob = new librarian_menu();
                            JFrame frame = new JFrame("librarian_menu");
                            frame.setContentPane(new librarian_menu().panel_main);
                            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            frame.pack();
                            frame.setVisible(true);
                        } else
                        { // put user menu here
                            user_menu ob = new user_menu();
                            JFrame frame = new JFrame("user-menu");
                            frame.setContentPane(new user_menu().userPanel);
                            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            frame.pack();
                            frame.setVisible(true);

                        }
                        return;
                    }
                }
            }
                //show error
            JOptionPane.showMessageDialog(this, "Not valid credentials");
            JComponent comp = (JComponent) ae.getSource();
            Window win = SwingUtilities.getWindowAncestor(comp);
            win.dispose();
        } catch (Exception e)
        {
            e.printStackTrace();
        }


    }


}

