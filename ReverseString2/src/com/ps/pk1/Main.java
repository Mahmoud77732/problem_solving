/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.ps.pk1;

import java.util.Scanner;

/**
 *
 * @author mm887
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
         String str = scanner.nextLine();
         System.out.println("reverse of "+ str +" = " + reverseString(str.toCharArray()));
    }
    
    public static String reverseString(char[] chars){
        int left=0, right=chars.length-1;
        while(left < right){
            swapChars(chars, right, left);
            --right;
            ++left;
        }
        return new String(chars);
    }
    
    public static void swapChars(char[] chars, int indexRight, int indexLeft){
        char temp = chars[indexRight];
        chars[indexRight] = chars[indexLeft];
        chars[indexLeft] = temp;
    }
    
}
