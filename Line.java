import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obstacle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Line extends Actor 
{
    Score score; 
    
    public Line()
    {
        score = new Score();
    }  
    
    public void act()
    {
        if(isTouching(Obstacle.class))
        {
            removeTouching(Obstacle.class); 
            score.increment();
        }
    }
    
    public Score getScore()
    {
        return score; 
    }
}
