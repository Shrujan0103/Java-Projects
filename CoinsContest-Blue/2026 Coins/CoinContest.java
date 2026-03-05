
/**
 * Write a description of class coin_contest here.
 *
 * @author Shrujan Mapari
 * @version (a version number or a date)
 */
public class CoinContest
{
    public static void main(String[] args){
        //to get only 1 winner for only 1 contest
        String winner = "";
        int side;
        int num_of_contests = 3;
        
        Coin coin1 = new Coin();
        Coin coin2 = new Coin();
        
          
        for(int count=1; count <= num_of_contests; count++)
        { 
            //Coin1 flip
            coin1.flip();
            side = coin1.getFaceValue();
            
            if (coin1.isHeads(side)) { //head
                coin1.addScore();   
                System.out.println("Coin1 landed on Heads!");
            } else{
                System.out.println("Coin1 landed on Tails!");
            }
            
            //Coin2 flip
            coin2.flip();
            side = coin2.getFaceValue();
        
            if (coin2.isHeads(side)) { //head
                coin2.addScore();
                System.out.println("Coin2 landed on Heads!");
            } else{
                System.out.println("Coin2 landed on Tails!");
            }
        }
        
        //count score
        int score1 = coin1.getScore();
        int score2 = coin2.getScore();
        
        if (score1 == 3){
            System.out.println("Congratulations! Coin1 hit the jackpot!!");
        } else if (score2 == 3) {
            System.out.println("Congratulations! Coin2 hit the jackpot!");
        } else if (score1 == score2){
            System.out.println("It is a tie!");
        } else{
            System.out.println("No one wins.");
        }
    }
       
    
}