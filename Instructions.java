import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends World
{
    InstructionWords instructions = new InstructionWords();
    StartButton startbutton = new StartButton();
    /**
     * Constructor for objects of class Instructions.
     * 
     */
    public Instructions()
    {    
        // output instructions and start button
        super(800, 600, 1,false); 
        addObject(instructions,400,300);
        addObject(startbutton, 400,550);
    }

    public void act() 
    {
        if (Greenfoot.mouseClicked(startbutton))
        {
            Greenfoot.setWorld(new Enemies());
        }

    }
}
