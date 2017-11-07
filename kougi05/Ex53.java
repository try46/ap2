/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kougi05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author try
 */
public class Ex53 {

    public static void main(String[] args) {
        try {
            //meiboデータベースへの接続
            String driverUrl = "jdbc:derby://localhost:1527/meibo";

            //コネクションの確立
            Connection con
                    = DriverManager.getConnection(driverUrl, "db", "db");

            //ステートメントの作成
            //実行するSQL文を記述
            String sql = "insert into T_STUDENT_A (fullname, gakubu_id, grade) values (?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);
            BufferedReader br = new BufferedReader(new FileReader(new File(
                    "student.csv")));
            String line;

            //SQLを実行してResultSetの形式で結果を取得
            int count = 0;
            while ((line = br.readLine()) != null) {
                String[] word = line.split(",");
                ps.setString(1, word[0]);
                ps.setInt(2, Integer.parseInt(word[1]));
                ps.setInt(3, Integer.parseInt(word[2]));
                count += ps.executeUpdate();
            }
            //取得したレコードを一つずつ処理
            System.out.println(count + "件のレコードを追加しました。");

            //メモリの開放
            ps.close();
            br.close();
            con.close();
        } catch (IOException | NumberFormatException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
