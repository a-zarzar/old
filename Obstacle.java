import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.Timer; 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Write a description of class Obstacle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obstacle extends Actor implements ActionListener
{
    Timer timer;
    ActionListener updateProBar;
    World alertedWorld;
    
    public Obstacle()
    {
        timer = new Timer(20, this);
        timer.setInitialDelay(1000);
        timer.start();
    }  
    
    public void actionPerformed(ActionEvent e)
    {
        turnTowards(getX(), getY() + 1);
        
        if(isAtEdge() == false)
        {
            move(20);
        }
        
        if(isTouching(Fish.class))
        {
            removeTouching(Fish.class);
        }
    }
}
