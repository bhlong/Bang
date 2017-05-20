import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TorchFlame1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TorchFlame1 extends Actor
{
    GifImage gifImage = new GifImage("fire2.gif");
    public void TorchFlame1()
    {
        GreenfootImage image = getImage();
        image.scale(1,1);
    }

    public void act() 
    {
        setImage(gifImage.getCurrentImage());
    }    
}
