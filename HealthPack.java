import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthPack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthPack extends Actor
{
    public HealthPack(){
        // set health pack image
        GreenfootImage myImage = getImage();
        myImage.scale(myImage.getWidth()/2, myImage.getHeight()/2);
        setImage(myImage);
    }

    /**
     * Act - do whatever the HealthPack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

    }    
}
