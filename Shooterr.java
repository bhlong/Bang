import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Shooter2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shooterr extends Actor
{
    // class variables
    int x = 0;
    int counter = 1;
    int hp = 3;
    /**
     * Act - do whatever the Shooterr wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        World myWorld = getWorld();
        MyWorld mw = (MyWorld)myWorld;
        Hero cn = mw.getHero();
        double distance = 0;
        int hack=0;
        Random r = new Random();
        if (!mw.getObjects(Hero.class).isEmpty())
        {
            // move towards hero
            distance = findDistanceBetween(cn, this);
            turnTowards(cn.getX(), cn.getY());
            if(distance>400){
                animate (++x);
                move(1); 
                counter = 1;
            }else if (distance<=400){
                setImage("ETwoOne.png");
                if(counter%200==0){
                    Missile m = new Missile();
                    m.setRotation(getRotation());
                    getWorld().addObject(m, getX(),getY());
                    m.move(10);
                }
                counter++;
            }
        }
        // death scenario
        if(hp <= 0){
            mw.addObject(new Splat(), getX(), getY());
            hack = r.nextInt(20)+1;
            if(hack%20==0){
                Hack h = new Hack();
                getWorld().addObject(h, getX(), getY());
            }
            mw.removeObject(this);
            mw.getExpBar().expIncrease(10);
            mw.getScore().increaseScore(100);
            Greenfoot.playSound("scream.mp3");
        }
    }    
    // distance between actor and hero
    public double findDistanceBetween(Actor a1, Actor a2)
    {
        return Math.sqrt(Math.pow(a1.getX() - a2.getX(), 2) + Math.pow(a1.getY() - a2.getY(), 2));
    }
    // shooterr health
    public void decreaseHealth(int amount){
        World myWorld = getWorld();
        MyWorld mw = (MyWorld)myWorld;
        hp-=amount;
    }
    // animations
    public void animate(int atime){
        if (atime == 1){
            setImage("ETwoOne.png");
        }
        if (atime == 5){
            setImage("ETwoTwo.png");
        }
        if (atime == 10){
            setImage("ETwoThree.png");
        }
        if (atime == 15){
            setImage("ETwoFour.png");
        }
        if (atime == 20){
            x = 0;
        } 
    }
}

