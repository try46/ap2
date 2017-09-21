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
public class Q03 {
    public static void main(String[] args) {
        String str;
        String input="Hello,World";
       str=input.toUpperCase();
        System.out.println(str);
        str=input.substring(1, 5);
        System.out.println(str);
        String [] astr=input.split("o");
        for (String string : astr) {
            System.out.println(string);
        }
       
    }
}
