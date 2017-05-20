import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    HealthBar hp = new HealthBar();
    ExpBar exp = new ExpBar();
    Hero cannon = new Hero();
    Block block = new Block();
    Score score = new Score();
    Input input = new Input();
    Boolean press = false;
    Boolean click = false;
    // instantiate all required objects
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 800x600 cells with a cell size of 1x1 pixels.
        super(800, 600, 1,false); 
        prepare();
        setPaintOrder(GameOver.class,Restart.class,ExpBar.class,HealthBar.class,Block.class,Score.class,Input.class,Explosion.class,Hero.class,Missile.class,Bullet.class,ISIS.class,Shooter.class,Shooterr.class,HealthPack.class,TimeWizard.class,Hack.class,Splat.class);
    }

    GreenfootSound bgm = new GreenfootSound("bgm0.mp3");
    public void act(){
        if(Greenfoot.isKeyDown("R")){
            Greenfoot.setWorld(new MyWorld());
        }
        bgm.playLoop();
    }
    
    // get updated info 
    public HealthBar getHealthBar(){
        return hp;
    }

    public ExpBar getExpBar(){
        return exp;
    }

    public Hero getHero(){
        return cannon;
    }

    public Block getBlock(){
        return block;
    }

    public Score getScore(){
        return score;
    }
    // regarding holding or clicking for shooting
    public void optionPress(){
        press = true;
    }
    
    public void optionClick(){
        click = true;
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        // add instantiated objects
        addObject(cannon,getWidth()/2,getHeight()/2);
        addObject(block,150,60);
        addObject(hp,330,29);
        addObject(exp,330,58);
        addObject(score,780,60);
        addObject(input,780,70);
    }
    // high score check and output 
    public void checkScore(){
        Input input = new Input();
        Score sc = getScore();
        // check if empty or not
        if(input.check() == true){
            String txtScore = Integer.toString(sc.score);
            write(txtScore);
        }
        else{
            String word = "";
            try {
                Scanner in = new Scanner(new File("highScore.txt"));
                while(in.hasNext()) {
                    word = in.next();
                }
            } catch (IOException e) {
                System.out.println("Error occurred.");
            }
            int num = Integer.parseInt(word);
            // compare to tell whether score higher or lower than highscore
            if(num < sc.score){
                String txtScore = Integer.toString(sc.score);
                write(txtScore);
            }
        }
    }
    // write new high score to file
    public static void write(String content) {
        try {
            File file = new File("highScore.txt");
            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
