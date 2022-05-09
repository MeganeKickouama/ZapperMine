import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level_3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level_3 extends World
{
    public static boolean isBeaten; 
    /**
     * Constructor for objects of class Level_3.
     * 
     */
    public Level_3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 555, 1); 
        isBeaten = false;
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Obstacle_Horizontal obstacle_Horizontal = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal,440,39);
        Obstacle_Horizontal obstacle_Horizontal2 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal2,442,152);
        Obstacle_Horizontal obstacle_Horizontal3 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal3,441,272);
        Obstacle_Horizontal obstacle_Horizontal4 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal4,443,394);
        Obstacle_Horizontal obstacle_Horizontal5 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal5,437,508);

        Silver_Coin silver_Coin = new Silver_Coin();
        addObject(silver_Coin,440,96);
        Silver_Coin silver_Coin2 = new Silver_Coin();
        addObject(silver_Coin2,439,451);
        Obstacle_Vertical obstacle_Vertical = new Obstacle_Vertical();
        addObject(obstacle_Vertical,443,210);
        Obstacle_Vertical obstacle_Vertical2 = new Obstacle_Vertical();
        addObject(obstacle_Vertical2,439,333);
        Coins coins = new Coins();
        addObject(coins,542,218);
        Coins coins2 = new Coins();
        addObject(coins2,336,215);
        Coins coins3 = new Coins();
        addObject(coins3,339,341);
        Coins coins4 = new Coins();
        addObject(coins4,542,344);
        Obstacle_Horizontal obstacle_Horizontal6 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal6,293,40);
        Obstacle_Horizontal obstacle_Horizontal7 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal7,592,36);
        Obstacle_Horizontal obstacle_Horizontal8 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal8,569,507);
        Obstacle_Horizontal obstacle_Horizontal9 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal9,305,508);
        Obstacle_Vertical obstacle_Vertical3 = new Obstacle_Vertical();
        addObject(obstacle_Vertical3,859,89);
        Obstacle_Vertical obstacle_Vertical4 = new Obstacle_Vertical();
        addObject(obstacle_Vertical4,859,209);
        Obstacle_Vertical obstacle_Vertical5 = new Obstacle_Vertical();
        addObject(obstacle_Vertical5,858,333);
        Obstacle_Vertical obstacle_Vertical6 = new Obstacle_Vertical();
        addObject(obstacle_Vertical6,858,458);
        Obstacle_Vertical obstacle_Vertical7 = new Obstacle_Vertical();
        addObject(obstacle_Vertical7,50,86);
        Obstacle_Vertical obstacle_Vertical8 = new Obstacle_Vertical();
        addObject(obstacle_Vertical8,50,205);
        Obstacle_Vertical obstacle_Vertical9 = new Obstacle_Vertical();
        addObject(obstacle_Vertical9,52,324);
        Obstacle_Vertical obstacle_Vertical10 = new Obstacle_Vertical();
        addObject(obstacle_Vertical10,52,446);
        Fang fang = new Fang();
        addObject(fang,117,99);
        Fang fang2 = new Fang();
        addObject(fang2,775,461);
        Zapper zapper = new Zapper();
        addObject(zapper,118,456);
        Coins coins5 = new Coins();
        addObject(coins5,693,219);
        Coins coins6 = new Coins();
        addObject(coins6,600,103);
        Coins coins7 = new Coins();
        addObject(coins7,299,102);
        Coins coins8 = new Coins();
        addObject(coins8,194,214);
        Coins coins9 = new Coins();
        addObject(coins9,699,342);
        Coins coins10 = new Coins();
        addObject(coins10,184,331);
        Coins coins11 = new Coins();
        addObject(coins11,303,449);
        Coins coins12 = new Coins();
        addObject(coins12,598,447);
    }
    
}
