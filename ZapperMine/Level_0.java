import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level_0 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level_0 extends World
{

    /**
     * Constructor for objects of class Level_0.
     * 
     */
    public Level_0()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Obstacle_Horizontal obstacle_Horizontal = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal,557,56);
        Obstacle_Vertical obstacle_Vertical = new Obstacle_Vertical();
        addObject(obstacle_Vertical,598,100);
        obstacle_Vertical.setLocation(600,124);
        Obstacle_Horizontal obstacle_Horizontal2 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal2,561,141);
        Coins coins = new Coins();
        addObject(coins,552,100);
        Obstacle_Horizontal obstacle_Horizontal3 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal3,372,60);
        obstacle_Horizontal3.setLocation(399,55);
        Obstacle_Vertical obstacle_Vertical2 = new Obstacle_Vertical();
        addObject(obstacle_Vertical2,330,101);
        Obstacle_Vertical obstacle_Vertical3 = new Obstacle_Vertical();
        addObject(obstacle_Vertical3,519,184);
        Obstacle_Horizontal obstacle_Horizontal4 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal4,611,319);
        Obstacle_Vertical obstacle_Vertical4 = new Obstacle_Vertical();
        addObject(obstacle_Vertical4,562,365);
        Obstacle_Horizontal obstacle_Horizontal5 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal5,483,490);
        Zapper zapper = new Zapper();
        addObject(zapper,624,404);
        obstacle_Vertical4.setLocation(569,349);
        obstacle_Vertical4.setLocation(553,334);
        Obstacle_Vertical obstacle_Vertical5 = new Obstacle_Vertical();
        addObject(obstacle_Vertical5,449,275);
        Obstacle_Horizontal obstacle_Horizontal6 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal6,471,231);
        obstacle_Vertical5.setLocation(425,266);
        obstacle_Horizontal6.setLocation(514,232);
        obstacle_Vertical5.setLocation(435,264);
        Coins coins2 = new Coins();
        addObject(coins2,594,225);
        obstacle_Vertical2.setLocation(335,153);
        Obstacle_Horizontal obstacle_Horizontal7 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal7,335,153);
        Coins coins3 = new Coins();
        addObject(coins3,371,106);
        Obstacle_Horizontal obstacle_Horizontal8 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal8,151,156);
        Obstacle_Horizontal obstacle_Horizontal9 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal9,89,37);
        Obstacle_Vertical obstacle_Vertical6 = new Obstacle_Vertical();
        addObject(obstacle_Vertical6,30,81);
        obstacle_Vertical6.setLocation(36,88);
        Coins coins4 = new Coins();
        addObject(coins4,81,92);
        coins4.setLocation(92,106);
        Obstacle_Horizontal obstacle_Horizontal10 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal10,194,37);
        obstacle_Horizontal10.setLocation(213,43);
        obstacle_Horizontal8.setLocation(78,139);
        obstacle_Horizontal3.setLocation(389,67);
        obstacle_Horizontal3.setLocation(415,40);
        obstacle_Vertical2.setLocation(348,124);
        obstacle_Horizontal.setLocation(576,53);
        coins.setLocation(479,79);
        obstacle_Horizontal.setLocation(574,37);
        obstacle_Vertical.setLocation(621,55);
        obstacle_Horizontal2.setLocation(564,125);
        coins.setLocation(579,69);
        obstacle_Vertical.setLocation(504,95);
        obstacle_Horizontal2.setLocation(550,139);
        coins.setLocation(559,79);
        obstacle_Vertical.setLocation(629,97);
        obstacle_Horizontal.setLocation(601,40);
        Obstacle_Horizontal obstacle_Horizontal11 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal11,383,329);
        obstacle_Horizontal11.setLocation(402,333);
        Obstacle_Vertical obstacle_Vertical7 = new Obstacle_Vertical();
        addObject(obstacle_Vertical7,333,317);
        Coins coins5 = new Coins();
        addObject(coins5,59,300);
        Coins coins6 = new Coins();
        addObject(coins6,132,356);
        Coins coins7 = new Coins();
        addObject(coins7,183,440);
        Coins coins8 = new Coins();
        addObject(coins8,205,241);
        obstacle_Horizontal7.setLocation(283,166);
        obstacle_Vertical2.setLocation(380,151);
        obstacle_Vertical2.setLocation(358,80);
        obstacle_Vertical3.setLocation(522,183);
        obstacle_Horizontal6.setLocation(506,247);
        obstacle_Vertical3.setLocation(523,210);
        obstacle_Vertical7.setLocation(337,328);
        coins3.setLocation(427,100);
        obstacle_Horizontal6.setLocation(455,253);
        obstacle_Vertical5.setLocation(437,304);
        obstacle_Horizontal11.setLocation(362,334);
        obstacle_Horizontal6.setLocation(504,262);
        obstacle_Vertical4.setLocation(552,359);
        obstacle_Horizontal4.setLocation(608,332);
        zapper.setLocation(638,445);
        obstacle_Horizontal6.setLocation(477,259);
        obstacle_Horizontal2.setLocation(548,143);
        obstacle_Horizontal2.setLocation(570,153);
        obstacle_Horizontal.setLocation(607,33);
        obstacle_Horizontal.setLocation(600,46);
        coins.setLocation(513,109);
        obstacle_Vertical2.setLocation(359,74);
        obstacle_Vertical2.setLocation(368,112);
        obstacle_Horizontal8.setLocation(51,123);
        obstacle_Horizontal8.setLocation(54,160);
        obstacle_Vertical6.setLocation(68,122);
        obstacle_Vertical6.setLocation(26,110);
        coins4.setLocation(82,95);
        obstacle_Horizontal10.setLocation(186,38);
        obstacle_Horizontal8.setLocation(109,166);
        obstacle_Vertical7.setLocation(344,328);
        removeObject(obstacle_Vertical7);
        obstacle_Horizontal11.setLocation(406,352);
        obstacle_Horizontal10.setLocation(240,48);
        obstacle_Horizontal10.setLocation(278,22);
        obstacle_Horizontal10.setLocation(231,44);
        obstacle_Vertical4.setLocation(554,359);
        obstacle_Vertical4.setLocation(551,363);
        obstacle_Horizontal5.setLocation(488,493);
        removeObject(obstacle_Horizontal5);
        obstacle_Vertical4.setLocation(549,358);
        obstacle_Horizontal4.setLocation(614,314);
        obstacle_Vertical4.setLocation(587,321);
        obstacle_Horizontal6.setLocation(509,258);
        obstacle_Vertical2.setLocation(370,70);
        obstacle_Horizontal7.setLocation(312,153);
        obstacle_Horizontal10.setLocation(258,40);
        removeObject(obstacle_Horizontal10);
        obstacle_Horizontal8.setLocation(118,162);
        removeObject(obstacle_Horizontal8);
        obstacle_Horizontal9.setLocation(91,27);
        obstacle_Vertical6.setLocation(47,99);
        obstacle_Vertical2.setLocation(328,95);
        obstacle_Horizontal7.setLocation(301,143);
        removeObject(obstacle_Horizontal7);
        obstacle_Horizontal3.setLocation(405,37);
        obstacle_Horizontal.setLocation(594,26);
        obstacle_Vertical.setLocation(653,80);
        obstacle_Horizontal2.setLocation(629,154);
        obstacle_Vertical4.setLocation(544,335);
        obstacle_Horizontal4.setLocation(589,319);
        removeObject(obstacle_Horizontal4);
        obstacle_Horizontal6.setLocation(545,264);
        removeObject(coins2);
        obstacle_Vertical3.setLocation(527,262);
        obstacle_Horizontal6.setLocation(551,265);
        removeObject(obstacle_Horizontal6);
        obstacle_Horizontal11.setLocation(435,360);
        removeObject(obstacle_Horizontal11);
        obstacle_Vertical5.setLocation(413,298);
        obstacle_Vertical5.setLocation(421,303);
        obstacle_Vertical3.setLocation(551,228);
        Obstacle_Vertical obstacle_Vertical8 = new Obstacle_Vertical();
        addObject(obstacle_Vertical8,421,229);
        obstacle_Vertical2.setLocation(239,85);
        obstacle_Horizontal3.setLocation(391,29);
        coins3.setLocation(489,241);
        coins.setLocation(565,86);
        Coins coins9 = new Coins();
        addObject(coins9,319,101);
        Coins coins10 = new Coins();
        addObject(coins10,484,376);
        Coins coins11 = new Coins();
        addObject(coins11,640,230);
        obstacle_Vertical5.setLocation(400,370);
        obstacle_Vertical4.setLocation(549,344);
        obstacle_Vertical8.setLocation(400,190); // here
        obstacle_Vertical5.setLocation(419,309);
        obstacle_Vertical5.setLocation(402,302);
    }
}
