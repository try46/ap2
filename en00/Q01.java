/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en00;

/**
 *
 * @author try
 */
public class Q01 {

    public static void main(String[] args) {

        String str = "al";
        try {
            int n = Integer.parseInt(str);
            int ans = n + 6;
            System.out.println(ans);
        } catch (NumberFormatException e) {
            System.out.println("数値に変換できません");
        }

    
   
    }
    
}
