import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random; 
import javax.swing.Timer; 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World implements ActionListener
{
    Timer timer;
    Timer ptimer;
    ActionListener updateProBar;
    Score score; 
    Line line; 
    int delay = 1000;  
    Random rando = new Random();
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    { 
        super(600, 800, 1); 
        
        StartingScreen screen = new StartingScreen();
        addObject(screen, 300, 400);
    }
    
    public void startGame()
    {
        Fish player = new Fish();
        addObject(player, 300, 700);
        line = new Line();
        addObject(line, 300, 799); 
        timer = new Timer(400, this);
        timer.setInitialDelay(250);
        timer.start();
    }
    
    public void actionPerformed(ActionEvent e)
    {
        Obstacle obstacle = new Obstacle(); 
        addObject(obstacle, (rando.nextInt(5) + 1) * 100 , 1);
        
        if(getObjects(Fish.class).isEmpty())
            endGame(); 
        
        if(delay > 50)
        {
            delay -= 7;
            timer.setDelay(delay);
        }
    }
    
    public void endGame()
    {
        timer.stop(); 
        Score score = line.getScore();
        removeObjects(getObjects(null)); 
        addObject(new DisplayedScore(score), 300, 400);
    }
}
