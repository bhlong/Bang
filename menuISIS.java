import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menuISIS here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menuISIS extends Actor
{
    int x = 0;
    /**
     * Act - do whatever the menuISIS wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        permAnimate(x++);
    }    
     public void permAnimate(int time){
        if (time == 1){
            setImage("EOneTwo.png");

        }
        if (time == 5){
            setImage("EOneThree.png");

        }
        if (time == 10){
            setImage("EOneFour.png");

        }
        if (time == 15){
            x = 0;
        } 
    }
}
