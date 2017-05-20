import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class Block here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Block extends Actor
{
    GreenfootImage newImage = new GreenfootImage(280,100);
    public Block(){
        ScoreBoard();
    }

    /**
     * Act - do whatever the Block wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        ScoreBoard();
    }

    public void ScoreBoard(){ // display the hp and exp
        newImage.clear();
        Font f = new Font("Times New Roman", Font.PLAIN, 20);
        newImage.setFont(f);
        newImage.setColor(Color.white);
        newImage.drawString("HP:" , 15, 25);
        newImage.drawString("EXP:" , 15, 55);
        setImage(newImage);
    }
}
