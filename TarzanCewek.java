import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TarzanCewek here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TarzanCewek extends Actor
{
    /**
     * Act - do whatever the TarzanCewek wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         if (getOneIntersectingObject(Tarzan.class)!=null){
        Greenfoot.stop ();
        getWorld().addObject (new Piala(),
        getWorld().getWidth()-400,
        getWorld().getHeight()-100);
    }
  
 }    
}
