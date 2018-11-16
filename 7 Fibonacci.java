
package javaapplication20;
import java.util.Scanner;

public class Fibonacci {
   
    public static void main(String[] args) {
        display();
        
    }
    
    static int user(){
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter your number: ");
         int n = sc.nextInt();
         return n;
    }
    static int f(int n) {
        if (n <= 1)
        return n;
        else {
            return f(n-1) + f(n-2);
        }
    }
    static void display(){
        int sum = user();
        
        for (int b= 0; b<=sum;b++){
            System.out.print("f("+ b +")\t");
        
        }
        System.out.println("");
        for (int y = 0; y<=sum; y++){
        for(int xb = 0; xb <= y; xb++){
            System.out.print(f(xb) + "\t");
        }
        System.out.println("");
        }
        
    
    
    }
}