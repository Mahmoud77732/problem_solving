/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorialnumber1;

/**
 *
 * @author mm887
 */
public class FactorialNumber1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // 5! = 5 * 4 * 3 * 2 * 1 = 120
        System.out.println("Factorial of 5 is: " + factorial(5)); 
        
    }
    
    // solved using Recursion
    public static int factorial(int num){
        if(num == 0){
            return 0;
        }
        else if(num == 1){
            return 1;
        }
        else{
            return num * factorial(num-1);
        }
    }
}
