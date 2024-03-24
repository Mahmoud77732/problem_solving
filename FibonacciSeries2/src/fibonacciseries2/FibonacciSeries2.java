/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacciseries2;

/**
 *
 * @author mm887
 */
public class FibonacciSeries2 {

    static int n1 = 0, n2 = 1, n3 = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // FibonacciSeries is : each num is the sum of last two nums before it
        // {0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 ...}
        
        int count=15;
        System.out.print(0 + " " + 1); //printing 0 and 1 .. static in the series start
        printFibo(count-2); //n-2 because 2 numbers{0, 1} are already printed
        
    }
    
    public static void printFibo(int count){
        if(count > 0){
            // int n1 = 0, n2 = 1, n3 = 0;
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            printFibo(count - 1);
        }
        
        /*
        (13)
        {
            check(13 > 0){
                n3 = 0 + 1; => n3 = 1
                n1 = 1;
                n2 = 1;
                print(" 1"); ==> series now: {0 1 1}
                printFibo(12)
            }
        }
        (12)
        {
            check(12 > 0){
                n3 = 1 + 1; => n3 = 2
                n1 = 1;
                n2 = 2;
                print(" 2"); ==> series now: {0 1 1 2}
                printFibo(11)
            }
        }
        (11)
        {
            check(11 > 0){
                n3 = 1 + 2; => n3 = 3 .. 
                n1 = 1;
                n2 = 3;
                print(" 3"); ==> series now: {0 1 1 2 3}
                printFibo(10) 
            }
        } 
        ... {0 1 1 2 3 5 8 13 21 34 55 89 144 233 377}
        (0)
        {
            check(0 > 0){
                ..
            }
        }
        */
    }
    
}
