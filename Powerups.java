import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Powerups here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Powerups extends World
{
    StartButton startbutton = new StartButton();
    PowerupWords powerups = new PowerupWords();
    MenuHealth health = new MenuHealth();
    MenuTimeWizard timeWizard = new MenuTimeWizard();
    MenuHack hack = new MenuHack();
    /**
     * Constructor for objects of class Powerups.
     * 
     */
    public Powerups()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1,false); 
        addObject(powerups,400,300);
        addObject(health, 250, 175);
        addObject(timeWizard, 250, 270);
        addObject(hack, 250, 360);
        addObject(startbutton,400,550);
    }

    public void act() 
    {
        if (Greenfoot.mouseClicked(startbutton))
        {
            Greenfoot.setWorld(new Options());
        }

    }
}
