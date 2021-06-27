//import required classes and packages  
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


//create CreateLoginForm class to create login form  
//class extends JFrame to create a window where our component add  
//class implements ActionListener to perform an action on button click  
class CreateLoginForm extends JFrame implements ActionListener
{
  JButton button1;
  JPanel newPanel;
  JLabel usernameLabel, passwordLabel;
  final JTextField textField1, textField2;

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

        // perform an action on button click
        button1.addActionListener(this); // add action lister to button this just calls the action performed function when it gets clicked
        setTitle("Login Form");
    }
    public void actionPerformed(ActionEvent ae)
    {
        String usernameValue = textField1.getText();
        String passwordValue = textField2.getText();

        if(usernameValue.equals("aaronel@gmail.com") && passwordValue.equals("password123")) //means they entered the correct credentials
        {


        } else
        {
            //show error
            System.out.println("Enter valid username and password");
        }

    }



}


