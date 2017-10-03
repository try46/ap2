/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kougi02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author try
 */
public class Ex21 {
    public static void main(String[] args) {
        try {
            BufferedReader br=new BufferedReader(new FileReader(new File("tweet.csv")));
            String line;
            while ((line=br.readLine())!=null) {                
                String [] world=line.split(",");
                System.out.println("TwitterID:"+world[0]);
                System.out.println("氏名:"+world[1]);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
