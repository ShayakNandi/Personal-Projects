/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacymanagement;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author aarog
 */
public class loginClass {

    private static final Connection con = DBconnect.Testdb();

    public static boolean login(String id, String password) {

        String sql = "SELECT * FROM \"users\"  WHERE id LIKE ? AND password LIKE ?;";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, id);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Login is Successful");
                while(rs.next()){}
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Try Again!");
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return false;
    }
}
