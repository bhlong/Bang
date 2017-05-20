import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    // instantiated required objects
    TitleName titlename = new TitleName();
    MenuTorch1 menutorch1 = new MenuTorch1();
    MenuTorch2 menutorch2 = new MenuTorch2();
    TorchFlame1 torchflame1 = new TorchFlame1();
    TorchFlame2 torchflame2 = new TorchFlame2();
    StartButton startbutton = new StartButton();
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // new world of same size, other menu page
        super(800, 600, 1,false); 
        setPaintOrder(MenuTorch1.class,MenuTorch2.class,TorchFlame1.class);
        addObject(titlename,400,300);
        addObject(new TorchFlame1(),65,67);
        addObject(new TorchFlame2(),740,67);
        addObject(menutorch1,60,250);
        addObject(menutorch2,740,250);
        addObject(startbutton, 400,550);
        // various buttons
    }
    // background music 
    static GreenfootSound menu = new GreenfootSound("menu.mp3");
    public static void stopp()    
    {    
        menu.stop();    
    }  
    // advance to next 
    public void act() 
    {
        if (Greenfoot.mouseClicked(startbutton))
        {
            Greenfoot.setWorld(new Instructions());
        }
        menu.playLoop();
    }
}
