import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color; 

/**
 * Write a description of class DisplayedScore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisplayedScore extends Actor
{
    /**
     * Act - do whatever the DisplayedScore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public DisplayedScore(Score score)
    {
        setImage(new GreenfootImage("Score: " + score.getScore(), 25, Color.WHITE, Color.BLACK));
    } 
}
