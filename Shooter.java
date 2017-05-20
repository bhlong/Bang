import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Shooter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shooter extends Actor
{
    // class variables
    int counter = 1;
    int hp = 2;
    Random r = new Random();
    int x = 0;
    /**
     * Act - do whatever the Shooter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        World myWorld = getWorld();
        MyWorld mw = (MyWorld)myWorld;
        Hero cn = mw.getHero();
        double distance = 0;
        int timeWizard =0;
        // move actor towards hero
        if (!mw.getObjects(Hero.class).isEmpty())
        {
            distance = findDistanceBetween(cn, this);
            turnTowards(cn.getX(), cn.getY());
            if(distance>300){
                move(1); 
                animate(++x);
                counter = 1;
            }else if (distance<=300){
                setImage("shootah8.png");
                if(counter%100==0){
                    Bullet b = new Bullet();
                    b.setRotation(getRotation());
                    getWorld().addObject(b, getX(),getY());
                    b.move(30);
                }
                counter++;
            }
        }
        // death scenario
        if(hp <= 0){
            mw.addObject(new Splat(), getX(), getY());
            timeWizard = r.nextInt(10)+1;
            if(timeWizard%10==0){
                TimeWizard tw = new TimeWizard();
                getWorld().addObject(tw, getX(), getY());
            }
            mw.removeObject(this);
            mw.getExpBar().expIncrease(5);
            mw.getScore().increaseScore(50);
            Greenfoot.playSound("scream.mp3");
        }
    }    
    // distance between actor and hero
    public double findDistanceBetween(Actor a1, Actor a2)
    {
        return Math.sqrt(Math.pow(a1.getX() - a2.getX(), 2) + Math.pow(a1.getY() - a2.getY(), 2));
    }
    // shooter health
    public void decreaseHealth(int amount){
        World myWorld = getWorld();
        MyWorld mw = (MyWorld)myWorld;
        hp-=amount;
    }
    // animations
    public void animate(int atime){
        if (atime == 1){
            setImage("shootah2.png");
        }
        if (atime == 5){
            setImage("shootah3.png");
        }
        if (atime == 10){
            setImage("shootah4.png");
        }
        if (atime == 15){
            setImage("shootah5.png");
        }
        if (atime == 20){
            setImage("shootah6.png");
        }
        if (atime == 25){
            setImage("shootah7.png");
        }
        if (atime == 30){
            setImage("shootah8.png");
        }
        if (atime == 35){
            x = 0;
        }
    }
}
