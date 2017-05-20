import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.*;
import java.awt.Font;
/**
 * Write a description of class ExpBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExpBar extends Actor
{
    // class variables various values set
    int level = 1;
    int exp = 0;
    int expRequired = 10;
    int expBarWidth = 500;
    int expBarHeight = 15;
    int pixelPerExp = expBarWidth/expRequired;
    int x = 0;
    int counter = 1;
    Random r = new Random();
    int interval = 80;
    public ExpBar(){
        update();
    }

    /**
     * Act - do whatever the ExpBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        update();
        // change difficulty level of game according to xp 
        if(counter%interval == 0){
            if(level<=2){
                x= r.nextInt(1);
            }else if(level>2 && level <=4){
                x = r .nextInt(2);
            }else if(level>4){
                x = r .nextInt(3);
            }
            if(x==0){
                spawnISIS();
            } else if(x==1){
                spawnShooter();
            }else if(x==2){
                spawnShooter2();
            }
        }    
        counter++;
    }

    public void update(){
        // update exp bar image
        GreenfootImage myImage = new GreenfootImage(expBarWidth+2, expBarHeight+2);
        myImage.setColor(Color.WHITE);
        myImage.drawRect(0,0,expBarWidth+1, expBarHeight+1);
        myImage.setColor(Color.BLUE);
        myImage.fillRect(1,1,exp*pixelPerExp, expBarHeight);
        setImage(myImage);
    }

    private void spawnISIS(){
        // new enemy spawner (zombie)
        ISIS isis = new ISIS();
        int xLoc, yLoc;
        int h = getWorld().getHeight();
        int w = getWorld().getWidth();
        int random = r.nextInt(w*2+h*2+1);
        if(random<=w){
            yLoc = 0;
            xLoc = random;
        }else if(w<random && random<=(h+w)){
            xLoc = w;
            yLoc = random-w;
        }else if((h+w)<random && random<=(w*2+h)){
            yLoc = h;
            xLoc = w*2+h-random;
        }else {
            xLoc = 0;
            yLoc = w*2+h*2-random;
        }
        getWorld().addObject(isis, xLoc, yLoc);
    }

    private void spawnShooter(){
        // new enemy spawner (shooter)
        Shooter shooter = new Shooter();
        int xLoc, yLoc;
        int h = getWorld().getHeight();
        int w = getWorld().getWidth();
        int random = r.nextInt(w*2+h*2+1);
        if(random<=w){
            yLoc = 0;
            xLoc = random;
        }else if(w<random && random<=(h+w)){
            xLoc = w;
            yLoc = random-w;
        }else if((h+w)<random && random<=(w*2+h)){
            yLoc = h;
            xLoc = w*2+h-random;
        }else {
            xLoc = 0;
            yLoc = w*2+h*2-random;
        }
        getWorld().addObject(shooter, xLoc, yLoc);
    }

    private void spawnShooter2(){
        // new enemy spawner (shooterr)
        Shooterr shooter2 = new Shooterr();
        int xLoc, yLoc;
        int h = getWorld().getHeight();
        int w = getWorld().getWidth();
        int random = r.nextInt(w*2+h*2+1);
        if(random<=w){
            yLoc = 0;
            xLoc = random;
        }else if(w<random && random<=(h+w)){
            xLoc = w;
            yLoc = random-w;
        }else if((h+w)<random && random<=(w*2+h)){
            yLoc = h;
            xLoc = w*2+h-random;
        }else {
            xLoc = 0;
            yLoc = w*2+h*2-random;
        }
        getWorld().addObject(shooter2, xLoc, yLoc);
    }
    int increase = 10;
    public void expIncrease(int amount){
        // increase xp 
        exp = exp + amount;
        if(exp >= expRequired){
            level++;
            exp = exp-expRequired;
            expRequired = expRequired + increase;
            increase = increase +10;
            pixelPerExp = expBarWidth/expRequired;
            interval-=5;
            Greenfoot.playSound("levelup.wav");
        }
    }
}
