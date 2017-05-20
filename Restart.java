import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Restart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Restart extends Actor
{
    public Restart()
    {
        // set image
        GreenfootImage myImage = getImage();
        myImage.scale(myImage.getWidth()/4, myImage.getHeight()/4);
        setImage(myImage);
    }
    /**
     * Act - do whatever the Restart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // reset if clicked
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Options());
        }
    }    
}