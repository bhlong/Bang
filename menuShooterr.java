import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class meuShooter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menuShooterr extends Actor
{
    int x = 0;
    /**
     * Act - do whatever the meuShooter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        animate(x++);
    }   
    public void animate(int atime){
        if (atime == 1){
            setImage("ETwoOne.png");
        }
        if (atime == 5){
            setImage("ETwoTwo.png");
        }
        if (atime == 10){
            setImage("ETwoThree.png");
        }
        if (atime == 15){
            setImage("ETwoFour.png");
        }
        if (atime == 20){
            x = 0;
        } 
    }
}
