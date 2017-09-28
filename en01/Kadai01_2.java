/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author try
 */
public class Kadai01_2 {
    public static void main(String[] args) {
        ArrayList<String> out11List=new ArrayList<>();
        try {
            BufferedReader br=new BufferedReader(new FileReader(new File("out11.txt")));
            
            while(true){
                String line=br.readLine();
                if(line==null){
                    break;
                }else{
                    out11List.add(line);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        ArrayList<String> nameList=new ArrayList<>();
        int sum=0;
        int lineCount=1;
        int num=0;
        
        for (String line : out11List) {
            if(lineCount%2!=0){
                nameList.add(line);
                num++;
            }else{
                sum+=Integer.parseInt(line);
            }
            lineCount++;
            
        }
        double ave=sum/num;
       
      
        try {
            BufferedWriter bw=new BufferedWriter(new FileWriter(new File("out12.txt")));
            bw.write("名前リスト:");
            for (String nameString : nameList) {
                bw.write(nameString+"/");
            }
            bw.newLine();
            bw.write("平均点:"+ave);
        bw.close();
        } catch (IOException e) {
            
            System.out.println(e.getMessage());
        }
    }
}
