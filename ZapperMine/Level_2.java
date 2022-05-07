import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level_2 extends World
{
    public static boolean isBeaten; 
    /**
     * Constructor for objects of class Level_2.
     * 
     */
    public Level_2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 555, 1); 
        prepare();
        isBeaten = false;
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Obstacle_Vertical obstacle_Vertical = new Obstacle_Vertical();
        addObject(obstacle_Vertical,524,254);
        Obstacle_Vertical obstacle_Vertical2 = new Obstacle_Vertical();
        addObject(obstacle_Vertical2,380,252);
        Obstacle_Horizontal obstacle_Horizontal = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal,456,182);
        Obstacle_Horizontal obstacle_Horizontal2 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal2,455,323);
        Silver_Coin silver_Coin = new Silver_Coin();
        addObject(silver_Coin,448,256);
        Obstacle_Horizontal obstacle_Horizontal3 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal3,598,184);
        Obstacle_Horizontal obstacle_Horizontal4 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal4,593,322);
        Obstacle_Horizontal obstacle_Horizontal5 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal5,303,186);
        Obstacle_Horizontal obstacle_Horizontal6 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal6,316,322);
        Obstacle_Vertical obstacle_Vertical3 = new Obstacle_Vertical();
        addObject(obstacle_Vertical3,855,75);
        Obstacle_Vertical obstacle_Vertical4 = new Obstacle_Vertical();
        addObject(obstacle_Vertical4,857,197);
        Obstacle_Vertical obstacle_Vertical5 = new Obstacle_Vertical();
        addObject(obstacle_Vertical5,857,320);
        Obstacle_Vertical obstacle_Vertical6 = new Obstacle_Vertical();
        addObject(obstacle_Vertical6,856,448);
        Obstacle_Horizontal obstacle_Horizontal7 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal7,771,28);
        Obstacle_Horizontal obstacle_Horizontal8 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal8,641,27);
        Obstacle_Horizontal obstacle_Horizontal9 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal9,504,27);
        Obstacle_Horizontal obstacle_Horizontal10 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal10,372,27);
        Obstacle_Horizontal obstacle_Horizontal11 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal11,244,26);
        Obstacle_Horizontal obstacle_Horizontal12 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal12,108,26);
        Obstacle_Vertical obstacle_Vertical7 = new Obstacle_Vertical();
        addObject(obstacle_Vertical7,43,109);
        Obstacle_Vertical obstacle_Vertical8 = new Obstacle_Vertical();
        addObject(obstacle_Vertical8,45,237);
        Obstacle_Vertical obstacle_Vertical9 = new Obstacle_Vertical();
        addObject(obstacle_Vertical9,44,365);
        Obstacle_Vertical obstacle_Vertical10 = new Obstacle_Vertical();
        addObject(obstacle_Vertical10,44,483);
        Zapper zapper = new Zapper();
        addObject(zapper,762,469);
        Obstacle_Horizontal obstacle_Horizontal13 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal13,138,518);
        Obstacle_Horizontal obstacle_Horizontal14 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal14,278,517);
        Obstacle_Horizontal obstacle_Horizontal15 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal15,430,516);
        Obstacle_Horizontal obstacle_Horizontal16 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal16,570,516);
        Fang fang = new Fang();
        addObject(fang,133,105);
        Fang fang2 = new Fang();
        addObject(fang2,776,257);
        Fang fang3 = new Fang();
        addObject(fang3,127,452);
        Coins coins = new Coins();
        addObject(coins,665,253);
        Coins coins2 = new Coins();
        addObject(coins2,771,116);
        Coins coins3 = new Coins();
        addObject(coins3,628,110);
        Coins coins4 = new Coins();
        addObject(coins4,480,109);
        Coins coins5 = new Coins();
        addObject(coins5,349,108);
        Coins coins6 = new Coins();
        addObject(coins6,230,108);
        Coins coins7 = new Coins();
        addObject(coins7,127,209);
        Coins coins8 = new Coins();
        addObject(coins8,122,328);
        Coins coins9 = new Coins();
        addObject(coins9,246,451);
        Coins coins10 = new Coins();
        addObject(coins10,405,453);
        Coins coins11 = new Coins();
        addObject(coins11,523,456);
        Coins coins12 = new Coins();
        addObject(coins12,656,460);
        obstacle_Vertical.setLocation(530,219);
        removeObject(obstacle_Vertical);
        Silver_Coin silver_Coin2 = new Silver_Coin();
        addObject(silver_Coin2,708,111);
        removeObject(coins2);
        silver_Coin2.setLocation(748,96);
        removeObject(coins6);
        fang.setLocation(243,106);
        fang.setLocation(263,116);
    }
    public void started() {
        
    }
    public void stopped() {
        
    }
}
