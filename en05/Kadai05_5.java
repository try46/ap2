/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Calendar;

/**
 *
 * @author try
 */
public class Kadai05_5 {

    public static void main(String[] args) {
  Calendar cal = Calendar.getInstance();
            System.out.println("現在の日時" + cal.getTime());
            cal.add(Calendar.DATE, -10);
            System.out.println("10日前" + cal.getTime());
        try {
            //meiboデータベースへの接続

            String driverUrl = "jdbc:derby://localhost:1527/twitter";

            //コネクションの確立
            Connection con
                    = DriverManager.getConnection(driverUrl, "db", "db");

            //ステートメントの作成
            //実行するSQL文を記述
            String sql = "select * from T_TWEET where tweetdate > ?";

            PreparedStatement ps = con.prepareStatement(sql);
          

                      //SQLを実行してResultSetの形式で結果を取得
            Timestamp tm = new Timestamp(cal.getTimeInMillis());
        
            ps.setTimestamp(1, tm);
              ResultSet rs = ps.executeQuery();
         //   System.out.println(ps);
         //String result ="";
            while (rs.next()) {
                 String result ="";
                result += rs.getInt("tweetno") + ":";
                result += rs.getString("twitterid") + ":";
                result += rs.getString("tweettext") + ":";
                result += rs.getInt("iine") + ":";
                result += rs.getTimestamp("tweetdate");
                     System.out.println(result);
            }
//             System.out.println(result);

            //取得したレコードを一つずつ処理
            //System.out.println(count + "件のレコードを追加しました。");
            //メモリの開放
            ps.close();
            con.close();
            rs.close();
            tm.clone();
        } catch (NumberFormatException | SQLException ex) {
            //System.out.println(ex.getMessage());
        }
    }
}
