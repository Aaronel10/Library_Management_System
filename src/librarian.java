import java.sql.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Scanner;

public class librarian {
    private static Scanner input = new Scanner(System.in);

   public static void addBook() throws Exception {
       try {
           Connection conn = User.getConnection();
           String query = "INSERT INTO current_inventory (" +
                   " book_id," +
                   "Title," +
                   "Author) VALUES (?, ?, ?)";

           System.out.printf("Enter ID:");
           int id = input.nextInt();
           System.out.printf("Enter Title:");
           String title = input.next();
           System.out.printf("Enter Author:");
           String author = input.next();

           PreparedStatement st = conn.prepareStatement(query);
           st.setInt(1, id);
           st.setString(2, title);
           st.setString(3, author);
           st.executeUpdate();
           st.close();

           conn.close();
       } catch (Exception e) {
           System.err.println(e.getMessage());
       }
   }
    public static void deleteBook() throws Exception {
        try {
            Connection conn = User.getConnection();
            System.out.printf("Enter Id of book to delete");
            int id = input.nextInt();
            PreparedStatement st = conn.prepareStatement("DELETE FROM current_inventory WHERE book_id = ?");
            st.setInt(1, id);
            st.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static void issueBook() throws Exception
    {
        try{
        Connection conn = User.getConnection();
            System.out.printf("Enter ID of book you are issuing:");
        int id = input.nextInt();
        PreparedStatement st = conn.prepareStatement("UPDATE current_inventory set Is_Availible=false WHERE book_id= "+ id);
        st.executeUpdate();
        st.close(); // can add issue date and return date
        conn.close();
        }catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }
    public static void returnBook() throws Exception
    {
        try{
            Connection conn = User.getConnection();
            System.out.printf("Enter ID of book you are returning:");
            int id = input.nextInt();
            PreparedStatement st = conn.prepareStatement("UPDATE current_inventory set Is_Availible=true WHERE book_id= "+ id);
            st.executeUpdate();
            st.close(); // can add issue date and return date
            conn.close();
        }catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }





    }






