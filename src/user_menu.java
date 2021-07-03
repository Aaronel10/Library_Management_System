import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class user_menu {

    private JButton button_search;
    public JPanel userPanel;
    private JButton button_view;
    private JButton viewBooksThatAreButton;

    public user_menu() {
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

        viewBooksThatAreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                User.view_issued_books();
            }
        });
        button_search.addActionListener(new ActionListener() {
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
    }
}
