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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author try
 */
public class Ex23 {

    public static void main(String[] args) {
        List<Tweet> tlist = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(
                    "tweet2.csv")));
            String line = "";
            while ((line = br.readLine()) != null) {
                Tweet tweet = new Tweet();
                String[] word = line.split(",");
                tweet.setNo(Integer.parseInt(word[0]));
                tweet.setTID(word[1]);
                tweet.setName(word[2]);
                tweet.setTime(word[3]);
                tweet.setText(word[4]);

                tlist.add(tweet);

               
            }
            br.close();
            
            for (Tweet tweet : tlist) {
                tweet.printTweet();
                
            }
        } catch (IOException | NumberFormatException e) {
        e.printStackTrace();
        }
    }
}
