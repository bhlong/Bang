import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TorchFlame2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TorchFlame2 extends Actor
{
    GifImage gifImage = new GifImage("fire2.gif");
    public void TorchFlame2()
    {
        GreenfootImage image = getImage();
        image.scale(1,1);
    }

    public void act() 
    {
        setImage(gifImage.getCurrentImage());
    }    
}
