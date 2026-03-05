import java.util.Scanner;
/**
 * Write a description of class DiceContest here.
 *
 * @author Shrujan Mapari
 * @version 06-03-2026
 */
public class DiceContest
{
    public static void main(String[] args){
        String winner = "";
        int player;
        int bot;
        int[] roll = new int[2];
        int num_of_contest = 1;
        Scanner sc = new Scanner(System.in);
        int round = 1;       
        
        
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        
        
        String option;
        boolean repeat = true;
        
        while (repeat) {
            for (int count = 1; count <= num_of_contest; count++){
                //Dice roll
                for (int i = 0; i < roll.length; i++) {
                    dice1.roll();
                    int roll1 = dice1.getFaceValue();
                    
                    dice2.roll();
                    int roll2 = dice2.getFaceValue();
                    
                    roll[i] = roll1 + roll2;
                }
                
                player = roll[0];
                bot = roll[1];
                    
                System.out.println("Player: " + player);
                System.out.println("Bot: " + bot);
                    
                if (player>bot) {
                    dice1.playerScore();
                    System.out.println("Player wins! Bot loses!");
                } else if(player<bot){
                    dice2.botScore();
                    System.out.println("Bot wins! Player loses!");
                } else{
                    System.out.println("It is a tie!");
                }
            }
            
            System.out.println("Would you like to play again (y/n)?");
            option = sc.nextLine().toLowerCase(); //Read the line of user input
            
            //Check the option string
            if (option.equals("y")) {
                System.out.println("Round " + round);
            } else if (option.equals("n")) {
                System.out.println("Goodbye");
                repeat = false;
            } else {
                System.out.println("enter y or n");
            }
            
                
        }
    }
}
