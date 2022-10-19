package pharmacymanagement;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class manageConsumersClass {
    
    private static final Connection con = DBconnect.Testdb();
    
    public static ArrayList<Users> getAllConsumers() {
        ArrayList<Users> studentList = new ArrayList<>();
        String sql = "SELECT * FROM consumers;";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            Users user;
            while (rs.next()) {
                user = new Users(rs.getString("id"), rs.getString("Name"), rs.getString("Address"), rs.getString("Number"));
                studentList.add(user);
            }
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return studentList;
    }
    
    public static ArrayList<String> getConsumer(String id) {
        ArrayList<String> studentList = new ArrayList<>();
        String sql = "SELECT * FROM consumers WHERE \"id\" LIKE "+id+"";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                //user = new Users(rs.getString("id"), rs.getString("First Name"), rs.getString("Last Name"), rs.getString("Email"), "","", rs.getString("Password"));
                studentList.add(rs.getString("id"));
                studentList.add(rs.getString("Name"));
                studentList.add(rs.getString("Address"));
                studentList.add(rs.getString("Number"));

            }
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return studentList;
    }

    public static void addConsumer(String name, String address, String number) {
        String sql = "INSERT INTO \"main\".\"consumers\"(\"Name\",\"Address\",\"Number\") VALUES (?,?,?);";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, address);
            pst.setString(3, number);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully Added Consumer!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static String[] searchConsumer(String fname, String lname, String grade) {
        String sql2 = "SELECT * FROM consumers WHERE \"Name\" LIKE ? AND \"Address\" LIKE ? AND \"Number\" LIKE ?;";
        try {
            PreparedStatement pst = con.prepareStatement(sql2);
            pst.setString(1, fname);
            pst.setString(2, lname);
            pst.setString(3, grade);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "User Found");
                String[] arr = new String[]{rs.getString("id"), fname, lname, grade, rs.getString("email")};
                return arr;
            } else {
                JOptionPane.showMessageDialog(null, "User Not Found");
                return null;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public static void updateConsumer(String newName, String newAddress, String newNumber, String id) {
        String sql = "UPDATE consumers SET \"Name\" = ?, \"Address\" = ?, \"Number\" = ? WHERE \"id\"=" + id;
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, newName);
            pst.setString(2, newAddress);
            pst.setString(3, newNumber);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "User Updated");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void deleteConsumer(String id) {
        String sql = "DELETE FROM consumers WHERE \"id\" = "+id+";";
        String sql2 = "DELETE FROM sqlite_sequence WHERE \"name\" = \"consumers\";";
        try {
            System.out.println(sql);
            Statement st = con.createStatement();
            Statement st2 = con.createStatement();
            st.executeUpdate(sql);
            st2.executeUpdate(sql2);
            JOptionPane.showMessageDialog(null, "User Deleted");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
