import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Soldier here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ISIS extends Actor
{
    int x = 0;
    Random r = new Random();
    int viagra = 0;
    /**
     * Act - do whatever the Soldier wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        World myWorld = getWorld();
        MyWorld mw = (MyWorld)myWorld;
        Hero c = (Hero)getOneIntersectingObject(Hero.class);
        int level = mw.getExpBar().level;
        if(c==null){
            if(mw.getHealthBar().health >0){
                Hero cn = mw.getHero();
                turnTowards(cn.getX(), cn.getY()); //moves towards the hero
                if(level <4){
                    move(1); 
                } else{
                    move(2); 
                }
                animate(++x);
            }
        }else{ // if ISIS touches the hero, it explodes and deals damage
            Explosion explosion = new Explosion();
            mw.addObject(explosion,getX(),getY());
            mw.removeObject(this);
            mw.getHealthBar().loseHealth(3);
            Greenfoot.playSound("explosion.wav");
        }
    }    
    
    public void animate(int atime){

        if (atime == 1){
            setImage("EOneTwo.png");

        }
        if (atime == 5){
            setImage("EOneThree.png");

        }
        if (atime == 10){
            setImage("EOneFour.png");

        }
        if (atime == 15){
            x = 0;
        } 
    }
}
