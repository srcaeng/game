import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tarzan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tarzan extends Actor{
    private int ySpeed;
    private int vSpeed=0;
    private int X=45;
    private int Y=238;
    
    
    public Tarzan()
    {
    }
    
    /**
     * Act - do whatever the Tarzan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      //checkKillers();
      checkKeys();
      
      int groundLevel =getWorld().getHeight() - getImage().getHeight()/2-20;
      boolean onGround = (getY() ==groundLevel);
         
    if(!onGround)
    {
        ySpeed++;
        setLocation(getX(),getY()+ySpeed);
        if (getY()>=groundLevel){
            setLocation(getX(),groundLevel);
            Greenfoot.getKey();
        }
    }
    else
    {
        if("space".equals(Greenfoot.getKey()))
        {
            ySpeed=-18;
            setLocation(getX(),getY()+ySpeed);
        }
    }
    
    if (getOneIntersectingObject(Batu1.class)!=null){
        Greenfoot.stop ();
        getWorld().addObject (new GameOver(),
        getWorld().getWidth()/2,
        getWorld().getHeight()/2);
    }
    if (getOneIntersectingObject(Daun.class)!=null){
        Greenfoot.stop ();
        getWorld().addObject (new GameOver(),
        getWorld().getWidth()/2,
        getWorld().getHeight()/2);
    }
}
private void checkKeys(){
    if(Greenfoot.isKeyDown("left")){
        move(-2);
    }
    if(Greenfoot.isKeyDown("right")){
        move(3);
    }
}
}
    
        

