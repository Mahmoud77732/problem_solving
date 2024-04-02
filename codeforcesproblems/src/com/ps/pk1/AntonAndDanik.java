/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ps.pk1;

import java.util.Scanner;

/**
 *
 * @author mm887
 */
public class AntonAndDanik {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int numOfGames = scanner.nextInt();
        scanner.nextLine();
        String gamesPlayed = scanner.nextLine();
        int anton = 0, danik = 0;
        for(int i = 0; i < gamesPlayed.length(); i++){
            if((gamesPlayed.charAt(i) + "").equals("A")){
                anton++;
            }
            else{
                danik++;
            }
        }
        
        if(anton > danik){
            System.out.println("Anton");
        }
        else if(anton < danik){
            System.out.println("Danik");
        }
        else{
            System.out.println("Friendship");
        }
        
        
    }
    
}
