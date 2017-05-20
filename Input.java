import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class asdf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Input extends Actor
{
    // read existing high score
    Queue <String> queue = new Queue<String>();
    String word = "";
    public Input(){
        try {
            Scanner in = new Scanner(new File("highScore.txt"));
            while(in.hasNext()) {
                word = in.next();
                queue.enqueue(word);
            }
        } catch (IOException e) {
            System.out.println("Error occurred.");
        }
        // current high score output
        setHigh(word);
    }

    public void act() {
        
    }

    public void setHigh(String word){
        // word image
        GreenfootImage newImage = new GreenfootImage(280,100);
        newImage.clear();
        Font f = new Font("Times New Roman", Font.PLAIN, 20);
        newImage.setFont(f);
        newImage.setColor(Color.white);
        newImage.drawString("BEST:" + word , 15, 75);
        setImage(newImage);
    }

    public boolean check() {  
        // check if high score exists or not
        if(queue.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}