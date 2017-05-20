import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TimeWizard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TimeWizard extends Actor
{
    public TimeWizard(){
        GreenfootImage myImage = getImage();
        myImage.scale(myImage.getWidth()/8, myImage.getHeight()/8);
        setImage(myImage);
    }
    /**
     * Act - do whatever the TimeWizard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
