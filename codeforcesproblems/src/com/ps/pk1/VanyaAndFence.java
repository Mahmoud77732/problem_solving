package com.ps.pk1;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mm887
 */
public class VanyaAndFence {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int numOfFriends = scanner.nextInt();
        int fenceHeight = scanner.nextInt();
        int[] heights = new int[numOfFriends];
        int result = 0;
        
        for(int index = 0; index < numOfFriends; index++){
            heights[index] = scanner.nextInt();
            result += 1;
            if(heights[index] > fenceHeight){
                result += 1;
            }
        }
        
        System.out.println(result);
        
    }
    
}
