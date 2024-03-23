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
public class Watermelon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int kilos = sc.nextInt();
        
        check(kilos);
        
    }
    
    public static void check(int kilos){
        if(kilos <= 3){
            System.out.println("NO");
        }
        else if(kilos % 2 == 0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    
}
