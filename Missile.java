import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Missile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Missile extends Actor
{
    GifImage myGif = new GifImage("missile.gif");
    //acceleration for missile
    double initialSpeed = 1;
    double acceleration = 0.5;
    /**
     * Act - do whatever the Missile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //gif
        setImage(myGif.getCurrentImage());
        World myWorld = getWorld();
        MyWorld mw = (MyWorld)myWorld;
        int speed = (int)(initialSpeed+acceleration);
        move(speed);
        initialSpeed = initialSpeed+acceleration;
        //see if missile hits the hero
        Actor heroKilled = getOneObjectAtOffset(0, 0, Hero.class);
        if(heroKilled!=null){
            Explosion explosion = new Explosion();
            mw.addObject(explosion,getX(),getY());
            mw.removeObject(this);
            mw.getHealthBar().loseHealth(5);
            Greenfoot.playSound("explosion.wav");
        }else{ //isAtEdge
            if(getX() < 1 || getX() > getWorld().getWidth() - 1){
                mw.removeObject(this);
            }else if(getY() < 1 || getY() > getWorld().getHeight() - 1){
                mw.removeObject(this);
            }
        }
    }    
}
