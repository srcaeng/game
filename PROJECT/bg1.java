import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bg1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bg1 extends World
{
    //private int map;
    //int counter=0;
    Jalan jalan=new Jalan();
    Tarzan tarzan=new Tarzan();
    Pohon pohon=new Pohon();
    Kelinci kelinci=new Kelinci();
    Hr harimau = new Hr();
    //Batu1 batu1= new Batu1();
    int loop=0;
    /**
     * Constructor for objects of class bg1.
     * 
     */
    public bg1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 301, 1,false);
        addObject (jalan,this.getWidth()/2,this.getHeight()/1);
        addObject (tarzan,this.getWidth()-750,this.getHeight()-70);
        addObject (pohon,this.getWidth()-30,this.getHeight()-175);
        addObject (kelinci,this.getWidth()-650,this.getHeight()-210);
        addObject (harimau,this.getWidth()-230,this.getHeight()-90);
        //addObject (batu1,this.getWidth()-20,this.getHeight()-50);
    }
    public void act(){
        int acak=Greenfoot.getRandomNumber(1);
        if(loop==0){
            addObject(new Batu1(),getWidth()-2,getHeight()-(50)-acak);
            loop=-100;
        }else{
            loop++;
}
    }
}


