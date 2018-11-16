package javaapplication15;
import java.util.Scanner;

public class JavaApplication15 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter number of columns: ");
        int c = sc.nextInt();
        System.out.println("Enter number of rows: ");
        int r  = sc.nextInt();
        
        int [][] num = new int [c][r];
        for (int i = 0; i< num.length; i++){
            for (int a=0; a<num[i].length; a++){
            System.out.println("Enter the number for row "+ (i + 0) + " and Column " + (a + 0) +":");
            num[i][a] = sc.nextInt();
         
            }
        }
        for (int i =0;i<num.length; i++){
            for (int a =0; a<num[i].length;a++){
              System.out.print(num[i][a]+ "\t");
            }
            System.out.println("");
        }
        
        
    }
    }
    

