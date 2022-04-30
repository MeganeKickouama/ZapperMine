import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level_4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level_4 extends World
{

    public static  boolean isBeaten; 
    public Level_4()
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
        // top horizontal bars
        Obstacle_Horizontal obstacle_Horizontal = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal,110,36);
        Obstacle_Horizontal obstacle_Horizontal2 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal2,244,36);
        Obstacle_Horizontal obstacle_Horizontal3 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal3,371,35);
        Obstacle_Horizontal obstacle_Horizontal4 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal4,505,35);
        Obstacle_Horizontal obstacle_Horizontal5 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal5,647,33);
        Obstacle_Horizontal obstacle_Horizontal6 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal6,785,30);
        // below top horizontal bars
        Obstacle_Horizontal obstacle_Horizontal7 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal7,781,178);
        Obstacle_Horizontal obstacle_Horizontal8 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal8,649,178);
        Obstacle_Horizontal obstacle_Horizontal9 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal9,505,177);
        Obstacle_Horizontal obstacle_Horizontal10 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal10,372,178);
        Obstacle_Horizontal obstacle_Horizontal11 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal11,240,178);

        // two vertical bars at top left
        Obstacle_Vertical obstacle_Vertical = new Obstacle_Vertical();
        addObject(obstacle_Vertical,43,123);
        Obstacle_Vertical obstacle_Vertical2 = new Obstacle_Vertical();
        addObject(obstacle_Vertical2,42,236);
        // middle horizontal bars
        Obstacle_Horizontal obstacle_Horizontal12 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal12,86,313);
        Obstacle_Horizontal obstacle_Horizontal13 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal13,215,313);
        Obstacle_Horizontal obstacle_Horizontal14 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal14,353,310);
        Obstacle_Horizontal obstacle_Horizontal15 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal15,494,309);
        Obstacle_Horizontal obstacle_Horizontal16 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal16,646,308);
        // three vertical botton right bars
        Obstacle_Vertical obstacle_Vertical3 = new Obstacle_Vertical();
        addObject(obstacle_Vertical3,846,246);
        Obstacle_Vertical obstacle_Vertical4 = new Obstacle_Vertical();
        addObject(obstacle_Vertical4,848,366);
        Obstacle_Vertical obstacle_Vertical5 = new Obstacle_Vertical();
        addObject(obstacle_Vertical5,847,481);
        // zapper, silver coin and boos fang
        Zapper zapper = new Zapper();
        addObject(zapper,67,475);
        Boss_Fang boss_Fang = new Boss_Fang();
        addObject(boss_Fang,134,102);
        Silver_Coin silver_Coin = new Silver_Coin();
        addObject(silver_Coin,804,100);
        zapper.setLocation(131,462);
        // 
    }
}
