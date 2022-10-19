/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacymanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author aarogya
 */
public class manageProducerClass {
    private static final Connection con = DBconnect.Testdb();
    
    public static ArrayList<Users> getAllProducers() {
        ArrayList<Users> studentList = new ArrayList<>();
        String sql = "SELECT * FROM producer;";
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
    
    public static ArrayList<String> getProducer(String id) {
        ArrayList<String> studentList = new ArrayList<>();
        String sql = "SELECT * FROM producer WHERE \"id\" LIKE "+id+"";
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

    public static void addProducer(String name, String address, String number) {
        String sql = "INSERT INTO \"main\".\"producer\"(\"Name\",\"Address\",\"Number\") VALUES (?,?,?);";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, address);
            pst.setString(3, number);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully Added Producer!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void updateProducer(String newName, String newAddress, String newNumber, String id) {
        String sql = "UPDATE producer SET \"Name\" = ?, \"Address\" = ?, \"Number\" = ? WHERE \"id\"=" + id;
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

    public static void deleteProducer(String id) {
        String sql = "DELETE FROM producer WHERE \"id\" = "+id+";";
        String sql2 = "DELETE FROM sqlite_sequence WHERE \"name\" = \"producer\";";
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
