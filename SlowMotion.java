import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SlowMotion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SlowMotion extends Actor
{
    int counter = 0;
    /**
     * Act - do whatever the SlowMotion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //slow motion
        if(counter < 150){
            Greenfoot.setSpeed(40);
        } else{
            Greenfoot.setSpeed(50);
            getWorld().removeObject(this);
        }
        counter++;
    }    
}
