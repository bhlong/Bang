import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menuShooter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menuShooter extends Actor
{
    int x = 0;
    /**
     * Act - do whatever the menuShooter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        animate(x++);
    }    

    public void animate(int atime){
        if (atime == 1){
            setImage("shootah2.png");
        }
        if (atime == 5){
            setImage("shootah3.png");
        }
        if (atime == 10){
            setImage("shootah4.png");
        }
        if (atime == 15){
            setImage("shootah5.png");
        }
        if (atime == 20){
            setImage("shootah6.png");
        }
        if (atime == 25){
            setImage("shootah7.png");
        }
        if (atime == 30){
            setImage("shootah8.png");
        }
        if (atime == 35){
            x = 0;
        }
    }
}
