/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kougi05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author try
 */
public class Ex51 {
    public static void main(String[] args) {
          try {
            //meiboデータベースへの接続
            String driverUrl = "jdbc:derby://localhost:1527/meibo";

            //コネクションの確立
            Connection con
                    = DriverManager.getConnection(driverUrl,"db" , "db");

            //ステートメントの作成
            

            //実行するSQL文を記述
            String sql ="insert into T_STUDENT_A (fullname, gakubu_id, grade) values (?,?,?)";
            
              PreparedStatement ps =con.prepareStatement(sql);
              
              ps.setString(1, "星野源");
              ps.setInt(2, 2);
              ps.setInt(3, 3);
            
            //SQLを実行してResultSetの形式で結果を取得
           int count=ps.executeUpdate();

            //取得したレコードを一つずつ処理
                System.out.println(count + "件のレコードを追加しました。");
            
            //メモリの開放
            ps.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
