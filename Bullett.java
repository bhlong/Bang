import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class fankeh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullett extends Actor
{
    Random r = new Random();
    int viagra = 0;
    /**
     * Act - do whatever the fankeh wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //Bullet that doesn't kill the hero
        World myWorld = getWorld();
        MyWorld mw = (MyWorld)myWorld;
        move(20);
        ISIS ISISkilled = (ISIS)getOneObjectAtOffset(0, 0, ISIS.class);
        Shooter shooterKilled = (Shooter)getOneObjectAtOffset(0, 0, Shooter.class);
        Shooterr shooter2Killed = (Shooterr)getOneObjectAtOffset(0, 0, Shooterr.class);
        if(ISISkilled !=null || shooterKilled!=null || shooter2Killed!=null){
            if(ISISkilled!=null){
                mw.addObject(new Splat(), getX(), getY());
                viagra = r.nextInt(10)+1;
                if(viagra%10==0){
                    HealthPack hp = new HealthPack();
                    getWorld().addObject(hp, getX(), getY());
                }
                mw.removeObject(ISISkilled);
                mw.removeObject(this);
                mw.getExpBar().expIncrease(1);
                mw.getScore().increaseScore(10);
                Greenfoot.playSound("scream.mp3");
            }
            if(shooterKilled!=null){
                shooterKilled.decreaseHealth(1);
                mw.removeObject(this);
            }
            if(shooter2Killed!=null){
                shooter2Killed.decreaseHealth(1);
                mw.removeObject(this);
            }
        }else{
            if(getX() < 1 || getX() > getWorld().getWidth() - 1){
                mw.removeObject(this);
            }else if(getY() < 1 || getY() > getWorld().getHeight() - 1){
                mw.removeObject(this);
            }
        }
    }    
}
