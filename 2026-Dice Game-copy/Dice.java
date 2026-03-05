
/**
 * Write a description of class Dice here.
 *
 * @author Shrujan Mapari
 * @version 06-03-2026
 */
public class Dice
{
    private int SIDES = 6;
    private int faceValue;
    private int score1; //Score for player 
    private int score2; //Score for bot
    
    /**
     * Constructor for object class dice
     */
    public Dice()
    {
        // initialise instance varible
        roll();
        this.score1 = 0;
        this.score2 = 0;
    }
    
    /**
     * Roll the dice generate 1 to 6 : this is setter
     */
    public void roll()
    {
        this.faceValue =(int)(Math.random() * 6) + 1;
        System.out.println(this.faceValue);
    }
    
    /**
     * Getter current side showing 1 or 2 or 3 or 4 or 5 or 6 
     */
    public int getFaceValue() 
    {
        return this.faceValue;
    }
    
    /**
     * Adds score for Player
     */
    public void playerScore()
    {
        //this.score = this.score + 1
        this.score1++;
    }
    
    public void botScore()
    {
        this.score2++;
    }
      
}