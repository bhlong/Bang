import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explosion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion extends Actor
{
    int counter = 0;
    /**
     * Act - do whatever the Explosion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(counter==0){
            setImage("exp2.png");
        }
        if(counter==2){
            setImage("exp3.png");
        }
        if(counter==4){
            setImage("exp4.png");
        }
        if(counter==6){
            setImage("exp5.png");
        }
        if(counter==8){
            setImage("exp6.png");
        }
        if(counter==10){
            setImage("exp7.png");
        }
        if(counter==12){
            setImage("exp8.png");
        }
        if(counter==14){
            setImage("exp9.png");
        }
        if(counter==16){
            setImage("exp10.png");
        }
        if(counter==18){
            setImage("exp11.png");
        }
        if(counter==20){
            setImage("exp12.png");
        }
        if(counter==22){
            setImage("exp13.png");
        }
        if(counter==24){
            setImage("exp14.png");
        }
        if(counter==26){
            setImage("exp15.png");
        }
        if(counter==28){
            setImage("exp16.png");
        }
        if(counter==30){
            setImage("exp17.png");
        }
        if(counter==32){
            setImage("exp18.png");
        }
        if(counter==34){
            setImage("exp19.png");
        }
        if(counter==36){
            setImage("exp20.png");
        }
        if(counter==38){
            setImage("exp21.png");
        }
        if(counter==40){
            setImage("exp22.png");
        }
        if(counter==42){
            setImage("exp23.png");
        }
        if(counter==44){
            setImage("exp24.png");
        }
        if(counter==46){
            setImage("exp25.png");
        }
        if(counter==48){
            getWorld().removeObject(this);
        }
        counter++;
    }    
}
