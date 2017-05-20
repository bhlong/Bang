import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cannon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    int x = 0;
    int counter=0;
    boolean mouse = false;
    int shootInterval = 15;
    int shootCounter = 0;
    int trigger = 0;
    boolean press = false;
    boolean click = false;
    /**
     * Act - do whatever the cannon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //wasd
        if(Greenfoot.isKeyDown("w")){
            setLocation(getX(),getY()-3);
            animate(++x);
        }
        if(Greenfoot.isKeyDown("a")){
            setLocation(getX()-3,getY());
            animate(++x);
        }
        if(Greenfoot.isKeyDown("s")){
            setLocation(getX(),getY()+3);
            animate(++x);
        }
        if(Greenfoot.isKeyDown("d")){
            setLocation(getX()+3,getY());
            animate(++x);
        }
        MouseInfo mouseInfo = Greenfoot.getMouseInfo(); 
        if (mouseInfo != null) 
        {  
            turnTowards(mouseInfo.getX(), mouseInfo.getY());  //turning the hero wards the mouse
        }
        World myWorld = getWorld();
        MyWorld mw = (MyWorld)myWorld;
        if(mw.getHealthBar().health <= 0){ //hero dies when health is below or equal to 0
            mw.removeObject(this);
            mw.checkScore();
            GameOver gm = new GameOver();
            mw.addObject(gm, mw.getWidth()/2, mw.getHeight()/2);
            Restart r = new Restart();
            mw.addObject(r, mw.getWidth()/2, mw.getHeight()/2+130);
        }

        if(!mw.getObjects(Hero.class).isEmpty()) // if hero picks up a health pack, increase health
        {
            Actor v = getOneObjectAtOffset(0, 0, HealthPack.class);
            if(v!=null){
                mw.removeObject(v);
                mw.getHealthBar().increaseHealth(3);
            }
        }

        if(!mw.getObjects(Hero.class).isEmpty())// if hero picks up a hack, shoot bullett in all different directions
        {
            Actor h = getOneObjectAtOffset(0, 0, Hack.class);
            if(h!=null){
                mw.removeObject(h);
                Greenfoot.playSound("gun.wav");
                for(int i = 0 ; i<360;i+=1){
                    Bullett b = new Bullett();
                    b.setRotation(i);
                    mw.addObject(b,getX(),getY());
                }
            }
        }

        if(!mw.getObjects(Hero.class).isEmpty())//if hero picks up a timeWizard, slow down
        {
            Actor t = getOneObjectAtOffset(0, 0, TimeWizard.class);
            if(t!=null){
                mw.removeObject(t);
                SlowMotion sm = new SlowMotion();
                mw.addObject(sm,getX(),getY());
            }
        }

        //press or click option
        if(mw.press==true){
            if(mouse == false && Greenfoot.mousePressed(null)){
                mouse = true;
            } else if (mouse == true && Greenfoot.mouseClicked(null)){
                mouse = false;
            } 
            if(mouse){
                shoot(shootInterval);
            } 
        } else if(mw.click==true){
            if(Greenfoot.mouseClicked(null)){
                shoot(1);
            }
        }

        counter++;
    }    

    public void shoot(int interval){
        World myWorld = getWorld();
        MyWorld mw = (MyWorld)myWorld;
        if (!mw.getObjects(Hero.class).isEmpty())
        {
            if(shootCounter%interval == 0){
                Bullet fk = new Bullet();
                fk.setRotation(getRotation());
                getWorld().addObject(fk, getX(),getY());
                fk.move(30);
                Greenfoot.playSound("gun.wav");
                shootCounter++;
            } else{
                shootCounter++;
            }
        }
    }

    public void animate(int atime){
        if (atime == 1){
            setImage("HeroTwo.png");
        }
        if (atime == 5){
            setImage("HeroThree.png");
        }
        if (atime == 10){
            setImage("HeroFour.png");
        }
        if (atime == 15){
            setImage("HeroFive.png");
        }
        if (atime == 20){
            setImage("HeroSix.png");
        }
        if (atime == 25){
            setImage("HeroSeven.png");
        }
        if (atime == 30){
            setImage("HeroEight.png");
        }
        if (atime == 35){
            x = 0;
        } 
    }
}
