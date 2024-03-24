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

        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String str = sc.next();
            int num = sc.nextInt();
            // System.out.printf("%s%d\n", str, num); // "str44" + newline for '\n'
            // System.out.printf("%s5%d\n", str, num); // "str544"
            // System.out.printf("%s%5d\n", str, num); // "java   11"
            // System.out.printf("%5s%d\n", str, num); // Allocate num of spaces before string if u can with the str_length, 5 <= the length [firstCharOrSpaceCreatedToFillLength : lastCharInString] --> "mahmoud22", "    a22", " java22"
            // System.out.printf("%-5s%d\n", str, num); // Allocate num of spaces after string if u can with the str_length, 5 <= the length [firstCharInString : lastCharOrSpaceCreatedToFillLength] --> "java 44", "a    44"
            // System.out.printf("%S\n", str); // uppercase "JAVA"
            // System.out.printf("%-15s%-3d\n", str, num); // "java           44 "
            System.out.printf("%-15s%03d\n", str, num); // $03d number include 3_digits --> "java           044"
        }
        System.out.println("================================");

    }

}
