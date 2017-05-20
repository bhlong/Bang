import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Options here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Options extends World
{
    StartButton startbutton = new StartButton();
    optionWords optionwords = new optionWords();
    ButtonOne buttonone = new ButtonOne();
    ButtonTwo buttontwo = new ButtonTwo();
    Hero hero = new Hero();
    MyWorld world = new MyWorld();
    /**
     * Constructor for objects of class Options.
     * 
     */
    public Options()
    {    
        // Create a new world with 800x600 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addObject(optionwords,400,300);
        addObject(buttonone,200,200);
        addObject(buttontwo,200,350);
    }

    public void act() 
    {
        // option buttons
        if (Greenfoot.mouseClicked(buttonone))
        {
            world.optionPress();
            // stop music go to game
            Menu.stopp();
            Greenfoot.setWorld(world);
        }
        if (Greenfoot.mouseClicked(buttontwo))
        {
            world.optionClick();
            // stop music go to game
            Menu.stopp();
            Greenfoot.setWorld(world);
        }
    }
}
