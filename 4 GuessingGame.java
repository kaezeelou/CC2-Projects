
package guessinggame;
import java.util.Scanner;

public class GuessingGame {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        
        System.out.println("Enter your number: ");
        int value = sc.nextInt();
        System.out.println("___________________________");
        System.out.println("Guess a number between 0-1000");
        
        int guess = sc.nextInt();
        
        if (value % 2 ==0) {
            System.out.println("The number is even");
        }else {
            System.out.println("The number is odd");
        }
        do {
            if(guess < value) {
                System.out.println("Enter a Higher number: ");
                guess = sc.nextInt();
            }else if (guess > value ) {
                System.out.println("Enter a Lower number: ");
                guess = sc.nextInt();
            
            }
        }while (guess != value);
        System.out.println("You guessed the correct number!");
    }
    
}
