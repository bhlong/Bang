import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemies extends World
{
    // instantiate required objects
    EnemyWords enemywords = new EnemyWords();
    StartButton startbutton = new StartButton();
    menuISIS isis = new menuISIS();
    menuShooterr shooterr = new menuShooterr();
    menuShooter shooter = new menuShooter();
    /**
     * Constructor for objects of class Enemies.
     * 
     */
    public Enemies()
    {    
        // Create a new world with 800x600 cells with a cell size of 1x1 pixels.
        super(800, 600, 1,false); 
        addObject(enemywords, 400, 300);
        addObject(startbutton,400,550);
        addObject(isis, 200,150);
        addObject(shooterr,200,400);
        addObject(shooter,200,275);
        // show enemies 
    }

    public void act() 
    {
        if (Greenfoot.mouseClicked(startbutton))
        {
            Greenfoot.setWorld(new Powerups());
        }

    }
}
