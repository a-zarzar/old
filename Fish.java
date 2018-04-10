import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.Timer; 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Write a description of class Fishs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish extends Actor implements ActionListener
{
    Timer timer;
    ActionListener updateProBar;
    
    public Fish()
    {
        timer = new Timer(100, this);
        timer.setInitialDelay(0);
        timer.start();
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if ( Greenfoot.isKeyDown("left") )
        {
            if(getX() != 100)
            {
                turnTowards(getX() - 1, getY());
                move(100);
            }
        }
        if ( Greenfoot.isKeyDown("right") )
        {
            if(getX() != 500)
            {
                turnTowards(getX() + 1, getY());
                move(100);
            }
        }
        if( Greenfoot.isKeyDown("r"))
        {
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
