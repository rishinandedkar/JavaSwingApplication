/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import java.util.Random;

/**
 *
 * @author Rishi Nandedkar
 */
public class HelperClass {
     
    public static String randomID(){
 char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
Random rnd = new Random();
StringBuilder sb = new StringBuilder((100000 + rnd.nextInt(900000)) + "-");
for (int i = 0; i < 5; i++)
{
    sb.append(chars[rnd.nextInt(chars.length)]);
}

return sb.toString();
    }
}
