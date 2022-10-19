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
public class manageProductClass {
    private static final Connection con = DBconnect.Testdb();
    
    public static ArrayList<Users> getAllProducts() {
        ArrayList<Users> studentList = new ArrayList<>();
        String sql = "SELECT * FROM product;";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            Users user;
            while (rs.next()) {
                user = new Users(rs.getString("id"), rs.getString("Name"), rs.getString("Quantity"), rs.getString("Price"));
                studentList.add(user);
            }
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return studentList;
    }
    
    public static ArrayList<String> getProduct(String id) {
        ArrayList<String> studentList = new ArrayList<>();
        String sql = "SELECT * FROM product WHERE \"id\" LIKE "+id+"";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                //user = new Users(rs.getString("id"), rs.getString("First Name"), rs.getString("Last Name"), rs.getString("Email"), "","", rs.getString("Password"));
                studentList.add(rs.getString("id"));
                studentList.add(rs.getString("Name"));
                studentList.add(rs.getString("Quantity"));
                studentList.add(rs.getString("Price"));

            }
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return studentList;
    }

    public static void addProduct(String name, String quantity, String price) {
        String sql = "INSERT INTO \"main\".\"product\"(\"Name\",\"Quantity\",\"Price\") VALUES (?,?,?);";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, quantity);
            pst.setString(3, price);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully Added Consumer!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void updateProduct(String name, String quantity, String price, String id) {
        String sql = "UPDATE product SET \"Name\" = ?, \"Quantity\" = ?, \"Price\" = ? WHERE \"id\"=" + id;
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, quantity);
            pst.setString(3, price);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "User Updated");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void deleteProduct(String id) {
        String sql = "DELETE FROM product WHERE \"id\" = "+id+";";
        String sql2 = "DELETE FROM sqlite_sequence WHERE \"name\" = \"product\";";
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
