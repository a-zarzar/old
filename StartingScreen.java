import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color; 

/**
 * Write a description of class StartingScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartingScreen extends Actor
{
    public StartingScreen()
    {
        setImage(new GreenfootImage("-Dodge the birds using left and right keys.\n-Press enter to start", 
            25, Color.WHITE, Color.BLACK));
    }
    
    /**
     * Act - do whatever the StartingScreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("enter"))
        {
            MyWorld w = (MyWorld) getWorld();
            w.startGame();
            getWorld().removeObject(this); 
        }
    }    
}
