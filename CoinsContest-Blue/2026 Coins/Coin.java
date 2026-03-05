/**
 * Write a description of class Coin here.
 *
 * @author Shrujan Mapari
 * 24/02/2026
 */
public class Coin
{
    private final int SIDES = 2;
    private final int HEADS = 0;
    private int faceValue;
    private int score;

    /**
     * Constructor for objects of class Coin
     */
    public Coin()
    {
        // initialise instance variable
         flip();
         this.score = 0;
    }

    /**
     * Flip the coin generate 0 or 1 : this is setter
     */
     public void flip()
    {
        this.faceValue =  (int)(Math.random() * SIDES);
    }
    
    /**
     * Getter current side showing return 0 or 1
     */
    public int getFaceValue() {
        return this.faceValue;
    }
    
    /**
     * Getter current score of the player coin
     */
    public int getScore() {
        return this.score;
    }
    
    /**
     * Adds the score by 1 for coin
     */
    public void addScore() {
        //this.score = this.score + 1;
        this.score++;
    }
    
    public boolean isHeads(int side)
    {
        if(side == HEADS){
           return true;
        }else {
           return false;
        }
    }
}