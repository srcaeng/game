import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pohon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pohon extends Actor
{
    /**
     * Act - do whatever the Pohon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (isTouching(Tarzan.class))
        { 
            Greenfoot.setWorld(new bg2());
    }    
}
}
