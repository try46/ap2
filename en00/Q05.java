/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en00;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author try
 */
public class Q05 {
    public static void main(String[] args) {
        Date date=new Date();
        String output;
        DateFormat dft;
        dft=new SimpleDateFormat("yyyy年M月dd日(E) H時mm分ss秒");
        output=dft.format(date);
        System.out.println(output);
    }
   
}
