/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author try
 */
public class Kadai05_2 {

    public static void main(String[] args) {
        try {
            String driverUrl = "jdbc:derby://localhost:1527/twitter";
            Connection con = DriverManager.getConnection(driverUrl, "db", "db");
            String sql = "insert into T_TWEET (twitterid, tweettext, iine) values(?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "abc");
            ps.setString(2, "おいしい!");
            ps.setInt(3, 5);
            int count=ps.executeUpdate();
            System.out.println(count);
            ps.close();
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
       
    }
}
