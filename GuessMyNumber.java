/**
 * Mikayla Doering
 * 8/16/17
*/
import java.util.*;
public class GuessMyNumber {
    public static void main(String[] args) {
        int count = 15;
        int guess = 0;
       
        Scanner input = new Scanner(System.in);  
        for(int texas = 2; texas > -1; texas--) {
            System.out.println("Pick a number between 1 and 30: ");
            guess = input.nextInt();
           
            if (guess < count){
                System.out.println(" Sorry, your guess is too low. You have "+texas+" guesses left. ");
            }
            else if(guess > count){
                System.out.println(" Sorry, your guess is too high. You have "+texas+" guesses left. ");
            } else {
             System.out.println(" Amazing! It was " + count + ". You are a good guesser! ");
             break;
            }
     System.out.println("The game is now over. Thanks for playing.");
     
       }