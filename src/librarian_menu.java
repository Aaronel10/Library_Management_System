import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

public class librarian_menu {
    private JButton button_view;
    public JPanel panel_main;
    private JButton deleteBookButton;
    private JButton returnBookButton;
    private JButton addBookButton;
    private JButton searchBookButton;
    private JButton viewIssuedBooksButton;
    private JButton issueBookButton;
    private Scanner input = new Scanner(System.in);


    public librarian_menu() {

        button_view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    User.viewBooks();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });
        searchBookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    User.searchBook();
                }catch (Exception exception)
                {
                    exception.printStackTrace();
                }

            }
        });


        issueBookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    librarian.issueBook();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }

            }
        });
        returnBookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    librarian.returnBook();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }

            }
        });
        viewIssuedBooksButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            User.view_issued_books();
            }
        });
        addBookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    librarian.addBook();
                    JOptionPane.showMessageDialog(null, "Book Added from Database");
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });
        deleteBookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    librarian.deleteBook();
                    JOptionPane.showMessageDialog(null, "Book Deleted from Database");

                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });
    }
}
