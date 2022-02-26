/*
 * "ThePracticeKing" is a game that will reward the king with
 * land and treasures for each day that some type of programming
 * progress has been made.
 * 
 * [TO-DO]
 * Saving System
 * Gold System
 * 
 * [IDEAS]
 * Land System
 * Reward System
 * Streak Rewards
 * 
 * 
 */
import java.io.Serializable; // Used for save system.
import java.util.Scanner; // Used for inputs to update game state.

public class ThePracticeKing {
    public static void main(String[] args) {
    
        int gold = 0; // Start at 0 gold.
        char intent; // This will be used to determine the next action to take.         
        
        char[] intentMenu = { // Game menu initialization.
            'm', 's'
        }; // m = Menu options  ;   s = Save game
        
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("\nWelcome King!\nYou have " + gold + " coins!\n");
        System.out.print("What would you like to do next? (Enter \"M\" for a menu.) ");
        
        // ############################################
        // WE WILL NEED A LOOP HERE FOR OBVIOUS REASONS
        // ############################################
        
        intent = Character.toLowerCase(scnr.next().charAt(0)); // Figure out what the user wants to do next.
        
        if (intent == 'm') {
            System.out.println("We currently only have two options, and one doesn't even work. \nM = Menu \nS = Save (Being worked on)");
        } 
        else if (intent == 's') {
            System.out.println("If it was working, we'd be saving right now.");
        }
        else {
            System.out.println("Something went wrong!");
        }
        
    }
}