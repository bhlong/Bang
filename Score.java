import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    int score = 0;
    public Score(){
        setScore(0,1);
    }

    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //updating the coreboard
        World myWorld = getWorld();
        MyWorld mw = (MyWorld)myWorld;
        ExpBar exp = mw.getExpBar();
        int l = exp.level;
        setScore(score,l);
    }    
    GreenfootImage newImage = new GreenfootImage(280,100);
    public void setScore(int s, int level){
        //method for displaying the score and level
        newImage.clear();
        Font f = new Font("Times New Roman", Font.PLAIN, 20);
        newImage.setFont(f);
        newImage.setColor(Color.white);
        newImage.drawString("SCORE:" + s , 15, 25);
        newImage.drawString("LEVEL:" + level , 15, 55);
        //  newImage.drawString("BEST:" + 
        setImage(newImage);
    }

    public void increaseScore(int s){
        score+=s;
    }
}
