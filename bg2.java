import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bg2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bg2 extends World
{
    Tarzan tarzan = new Tarzan ();
    TarzanCewek tarzancewek = new TarzanCewek ();
    //Daun daun = new Daun();
    int loop=0;
    //Batu2 batu2 = new Batu2();
    /**
     * Constructor for objects of class bg2.
     * 
     */
    public bg2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 494, 1,false);
        
        addObject(tarzan,this.getWidth()-750,this.getHeight()- 10);
        addObject(tarzancewek,this.getWidth()-40,this.getHeight()-80);
        //addObject(daun,this.getWidth()-90,this.getHeight()-80);
        //addObject(batu2,this.getWidth()-750,this.getHeight()- 10);
    }
    
     public void act(){
        //int acak=Greenfoot.getRandomNumber(1);
        if(loop==0){
            addObject(new Daun(),getWidth()-90,getHeight()-80);
            loop=-100;
        }else{
            loop++;
        }
    }
}