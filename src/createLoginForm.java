//import required classes and packages  
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Array;
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
  Admin aaron = new Admin("aaronel@gmail.com", "password123", "administrator");



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
        newPanel.add(button1);

        // set border to panel
        add(newPanel, BorderLayout.CENTER);
        setTitle("Login Form");
        // perform an action on button click
        button1.addActionListener(this); // add action lister to button this just calls the action performed function when it gets clicked

    }
    public void actionPerformed(ActionEvent ae)
    {
        String usernameValue = textField1.getText();
        String passwordValue = textField2.getText();

        if(usernameValue.equals("aaronel@gmail.com") && passwordValue.equals("password123")) //means they entered the correct credentials
        {
            JOptionPane.showMessageDialog(this, "Login successful");

        } else
        {
            //show error
            JOptionPane.showMessageDialog(this, "Not valid credentials");
            System.exit(0);

        }

        JComponent comp = (JComponent) ae.getSource();
        Window win = SwingUtilities.getWindowAncestor(comp);
        win.dispose();

    }



}


