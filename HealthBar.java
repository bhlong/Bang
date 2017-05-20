import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class HealthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBar extends Actor
{
    // class variables, sets a few values
    int health = 20;
    int healthLimit = 20;
    int healthBarWidth = 500;
    int healthBarHeight = 15;
    int pixelsPerHealth = (int)healthBarWidth/health;
    public HealthBar(){
        update();
    }

    /**
     * Act - do whatever the HealthBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        update();
    }    

    public void update(){
        // update health bar
        setImage(new GreenfootImage(healthBarWidth + 2, healthBarHeight + 2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.WHITE);
        myImage.drawRect(0,0,healthBarWidth+1, healthBarHeight+1);
        myImage.setColor(Color.RED);
        myImage.fillRect(1,1,health*pixelsPerHealth,healthBarHeight);
    }

    public void loseHealth(int damage){
        // decrease health
        health = health-damage;
    }
    
    public void increaseHealth(int heal){
        // increase health, cannot go over limit
        if((health + heal)>healthLimit ){
            health = healthLimit;
        }else {
            health = health + heal;
        }
    }
}
