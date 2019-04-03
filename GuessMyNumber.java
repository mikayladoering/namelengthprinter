/**
 * Mikayla Doering
 * 8/16/17
*/
import java.util.*;
public class GuessMyNumber {
    public static void main(String[] args) {
        int jaydenIsAwesome = 15;
        int jaydenIsIncredible = 0;
       
        Scanner input = new Scanner(System.in);  
        for(int jaydenIsCool = 2; jaydenIsCool > -1; jaydenIsCool--) {
            System.out.println("Pick a number between 1 and 30: ");
            jaydenIsIncredible = input.nextInt();
           
            if (jaydenIsIncredible < jaydenIsAwesome){
                System.out.println(" Sorry, your guess is too low. You have "+ jaydenIsCool+" guesses left. ");
            }
            else if(jaydenIsIncredible > jaydenIsAwesome){
                System.out.println(" Sorry, your guess is too high. You have "+jaydenIsCool+" guesses left. ");
            } else {
             System.out.println(" Amazing! It was " + jaydenIsCool + ". You are a good guesser! ");
             break;
            }
     System.out.println("The game is now over. Thanks for playing.");
     
       }
        //I hope you have a good day
