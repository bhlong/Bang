import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class splat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Splat extends Actor
{
    // set splat image
    int counter = 0;
    public Splat()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/4, image.getHeight()/4);
        setImage(image);
    }
    /**
     * Act - do whatever the splat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // remove splat through virtual janitor after specific amount of time
        if(counter==800){
            getWorld().removeObject(this);
        }
        counter++;
    }    
}
