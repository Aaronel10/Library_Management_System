import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private static Scanner input = new Scanner(System.in);


    public static void viewBooks() throws Exception{
        try {
            Connection conn = getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM current_inventory");
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnNumbers = rsmd.getColumnCount();

            //iterate through data and display it
            while(rs.next())
            {
                for (int i = 1; i <+ columnNumbers; i++) {
                    System.out.print(rs.getString(i) + " ");
                }
                System.out.println();
            }

            conn.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }


    public static void searchBook()
    {
        try{
            Connection conn = getConnection();
            System.out.printf("Enter Book Id:");
            int id = input.nextInt();
            PreparedStatement st = conn.prepareStatement("SELECT * FROM current_inventory WHERE book_id = " + id);
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                System.out.println(rs.getString("Title"));
            }
            conn.close();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }


    public static Connection getConnection() throws Exception{
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/library_database", "root", "rootpassword");
            return connection;
        } catch (Exception e)
        {
        e.printStackTrace();
        }
        return null;
    }


    public static void view_issued_books()
    {
        try{
            Connection conn = getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM current_inventory WHERE Is_Availible=0");
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnNumbers = rsmd.getColumnCount();

            //iterate through data and display it
            while(rs.next())
            {
                for (int i = 1; i <+ columnNumbers; i++) {
                    System.out.print(rs.getString(i) + " ");
                }
                System.out.println();
            }

            conn.close();
        }catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }




}
