// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a Onslow College 13DTC assignment.
// You may not distribute it in any other way without permission.

/* Exercise for WGC 13DT
 * Name: Shrujan Mapari
 * Email: Maparish@gmail.com
 * Date: 22/04/2026 
 */

import ecs100.*;
import java.awt.Color;

/** A Lamp object represents a table lamp on the graphics pane. A lamp consists of a colored bulb and a stem.
 *   It remembers its current position, its color and whether it is on or off.
 *   Its initial position and its color are set when it is constructed.
 *   The diameter of a bulb should be 80.
 *   The height of the stem should be 80.
 *   The width of the stem should be 20.
 *   It has three methods:
 *     draw(),        which draws the lamp at its current position.
 *     onBulb(x,y),   which reports whether the point(x,y) is on the bulb.
 *     onStem(x,y),   which reports whether the point(x,y) is on the stem.
 *     turnOff(),     which turns the light off.
 *     changeColor(), which turns the light on if it is off; changes its color to a random bright colour if it is already on. 
 */

public class Lamp{

    public static final double SIZE = 80;
    private static final double STEM_WIDTH = 20;
    // diameter of the bulb and height of the stem
    // width of the stem is SIZE/4
    private double lampX;
    private double lampY;
    
    private boolean isOn;
    
    private Color color;
 
    //fields
    /** Constructor: passed the initial position.
     * Initialises the fields
     */
    public Lamp(double x, double y){
        lampX = x;
        lampY = y;
        color = Color.yellow;
        isOn = false;
               
    }

    /**
     * draws the lamp at its current position:
     * - the bulb of the right colour.
     * - the stem darkGray
     * The height of the stem is the same as the diameter of the bulb
     * The width of the stem is a quater of its height
     */
    public void draw(){
        // YOUR CODE HERE
        UI.setColor(Color.darkGray);
        UI.fillRect(lampX + SIZE/2 - STEM_WIDTH/2, lampY +SIZE, STEM_WIDTH, SIZE);
        
        if (isOn) {
            UI.setColor(color);
        } else {
            UI.setColor(Color.darkGray);
        }
        
        UI.fillOval(lampX, lampY, SIZE, SIZE);
    }   

    /** 
     * Reports whether the point (x,y) is on the bulb.
     * (x and y represent the position where the mouse was released):
     */
    public boolean onBulb(double x, double y){
        // an easy approximation is to pretend it is the enclosing rectangle.
        // It is nicer to do a little bit of geometry and get it right
        //YOUR CODE HERE
        double cx = lampX + SIZE / 2; //lampX, lampY = top-left of the bulb. The bulb is a circle. A circle is easiest to work with from its center
        double cy = lampY + SIZE / 2;

        double dx = x - cx; //This measures: how far left or right the click is from center 'dx' and how far up or down it is 'dy'
        double dy = y - cy;

        return (dx * dx + dy * dy) <= (SIZE / 2) * (SIZE / 2); 
    }   

    /**
     * Reports whether the point (x,y) is on the stem.
     * (x and y represent the position where the mouse was released):
     */
    public boolean onStem(double x, double y){
        // YOUR CODE HERE 
        double stemX = lampX + SIZE/2 - STEM_WIDTH/2; //In the middle of the blub
        double stemY = lampY + SIZE; //Below of the blub

        return (x >= stemX && x <= stemX + STEM_WIDTH && y >= stemY && y <= stemY + SIZE);
    }   

    /**
     * Turns the light off.
     * Does not redraw
     */
    public void turnOff(){
        //YOUR CODE HERE 
        isOn = false;
    }   

    /** changeColor method (no parameters):
     * Turns the light on (if it is off)
     * Changes its color to a random bright colour (if it is already on).
     * Does not redraw
     */
    public void changeColor(){
        // YOUR CODE HERE 
        if (!isOn) {
            isOn = true;
        } else {
            this.color = Color.getHSBColor((float)(Math.random()), 1.0f, 1.0f);
        }
        
    }   
}
