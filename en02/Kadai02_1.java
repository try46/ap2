/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author try
 */
public class Kadai02_1 {
    public static void main(String[] args) {
        List<Cat> catlist=new ArrayList<>();
        try {
            BufferedReader br=new BufferedReader(new FileReader(new File("data2.csv")));
            String line ="";
            while ((line=br.readLine())!=null) {                
                Cat cat=new Cat();
                String word[]=line.split(",");
                cat.setNo(Integer.parseInt(word[0]));
                cat.setName(word[1]);
                cat.setKind(word[2]);
                cat.setKenami(word[3]);
                cat.setColor(word[4]);
                cat.setSex(word[5]);
                cat.setAge(Integer.parseInt(word[6]));
                cat.setWeight(Double.parseDouble(word[7]));
                
                catlist.add(cat);
                
            }
            br.close();
            for (Cat cat : catlist) {
                cat.printCat();
                
            }
        } catch (Exception e) {
        }
    }
}
