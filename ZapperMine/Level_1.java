import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level_0 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level_1 extends World
{
    public static boolean isBeaten;
    public Level_1()
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
        obstacle_Horizontal8.setLocation(54,166);
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
        removeObject(obstacle_Horizontal);
        removeObject(obstacle_Vertical);
        removeObject(obstacle_Horizontal2);
        removeObject(obstacle_Vertical3);
        obstacle_Vertical4.setLocation(555,347);
        removeObject(obstacle_Vertical4);
        obstacle_Vertical8.setLocation(406,201);
        removeObject(obstacle_Vertical8);
        removeObject(obstacle_Vertical5);
        obstacle_Horizontal3.setLocation(418,29);
        removeObject(obstacle_Vertical2);
        obstacle_Vertical6.setLocation(79,157);
        removeObject(coins4);
        removeObject(coins9);
        coins.setLocation(570,90);
        removeObject(coins);
        removeObject(coins3);
        removeObject(coins11);
        removeObject(coins10);
        removeObject(coins8);
        obstacle_Vertical6.setLocation(48,73);
        obstacle_Horizontal3.setLocation(169,27);
        obstacle_Horizontal3.setLocation(227,30);
        obstacle_Horizontal3.setLocation(205,34);
        Obstacle_Horizontal obstacle_Horizontal12 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal12,301,27);
        Obstacle_Horizontal obstacle_Horizontal13 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal13,410,27);
        Obstacle_Horizontal obstacle_Horizontal14 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal14,524,27);
        Obstacle_Horizontal obstacle_Horizontal15 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal15,540,145);
        Obstacle_Horizontal obstacle_Horizontal16 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal16,430,146);
        Obstacle_Horizontal obstacle_Horizontal17 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal17,321,146);
        Obstacle_Horizontal obstacle_Horizontal18 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal18,210,148);
        obstacle_Vertical6.setLocation(27,95);
        Coins coins12 = new Coins();
        addObject(coins12,513,85);
        Coins coins13 = new Coins();
        addObject(coins13,382,88);
        Coins coins14 = new Coins();
        addObject(coins14,250,89);
        Coins coins15 = new Coins();
        addObject(coins15,146,84);
        Coins coins16 = new Coins();
        addObject(coins16,84,161);
        Obstacle_Vertical obstacle_Vertical9 = new Obstacle_Vertical();
        addObject(obstacle_Vertical9,169,205);
        Obstacle_Horizontal obstacle_Horizontal19 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal19,231,266);
        Coins coins17 = new Coins();
        addObject(coins17,235,208);
        coins8.setLocation(651,144);
        Obstacle_Horizontal obstacle_Horizontal20 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal20,651,144);
        coins8.setLocation(636,82);
        Coins coins18 = new Coins();
        addObject(coins18,641,89);
        obstacle_Horizontal20.setLocation(641,106);
        obstacle_Horizontal20.setLocation(707,136);
        obstacle_Horizontal15.setLocation(631,139);
        obstacle_Horizontal16.setLocation(508,142);
        obstacle_Horizontal17.setLocation(390,147);
        obstacle_Horizontal18.setLocation(263,156);
        obstacle_Horizontal19.setLocation(739,294);
        obstacle_Horizontal19.setLocation(280,297);
        obstacle_Vertical9.setLocation(159,218);
        obstacle_Horizontal19.setLocation(205,279);
        obstacle_Horizontal18.setLocation(224,166);
        obstacle_Horizontal17.setLocation(314,166);
        obstacle_Horizontal16.setLocation(430,166);
        obstacle_Horizontal15.setLocation(545,166);
        obstacle_Horizontal20.setLocation(650,166);
        coins17.setLocation(243,225);
        coins17.setLocation(238,224);
        coins15.setLocation(132,142);
        coins18.setLocation(674,91);
        coins12.setLocation(556,96);
        coins13.setLocation(417,85);
        obstacle_Horizontal17.setLocation(379,166);
        obstacle_Horizontal16.setLocation(479,166);
        obstacle_Horizontal15.setLocation(596,166);
        obstacle_Horizontal20.setLocation(707,166);
        obstacle_Horizontal17.setLocation(368,166);
        obstacle_Horizontal17.setLocation(346,166);
        obstacle_Horizontal17.setLocation(355,166);
        obstacle_Horizontal17.setLocation(346,166);
        coins18.setLocation(700,72);
        obstacle_Horizontal9.setLocation(112,38);
        obstacle_Horizontal9.setLocation(51,37);
        obstacle_Horizontal9.setLocation(96,44);
        obstacle_Horizontal3.setLocation(157,38);
        obstacle_Horizontal12.setLocation(293,32);
        obstacle_Horizontal13.setLocation(415,28);
        obstacle_Horizontal14.setLocation(527,30);
        coins17.setLocation(190,242);
        obstacle_Horizontal9.setLocation(35,27);
        obstacle_Horizontal12.setLocation(268,27);
        obstacle_Horizontal20.setLocation(705,173);
        obstacle_Horizontal20.setLocation(712,165);
        coins17.setLocation(227,214);
        obstacle_Horizontal19.setLocation(221,273);
        obstacle_Horizontal19.setLocation(241,284);
        coins17.setLocation(226,227);
        obstacle_Horizontal14.setLocation(506,28);
        obstacle_Horizontal14.setLocation(577,25);
        obstacle_Horizontal13.setLocation(450,35);
        obstacle_Horizontal13.setLocation(491,26);
        obstacle_Horizontal12.setLocation(351,25);
        obstacle_Horizontal3.setLocation(223,28);
        obstacle_Horizontal9.setLocation(128,26);
        obstacle_Vertical6.setLocation(19,82);
        coins15.setLocation(124,148);
        obstacle_Horizontal3.setLocation(252,26);
        obstacle_Horizontal12.setLocation(370,30);
        obstacle_Horizontal13.setLocation(513,29);
        obstacle_Horizontal14.setLocation(647,30);
        obstacle_Horizontal12.setLocation(399,24);
        obstacle_Horizontal13.setLocation(521,26);
        obstacle_Horizontal14.setLocation(619,25);
        obstacle_Horizontal14.setLocation(646,26);
        coins15.setLocation(119,161);
        coins15.setLocation(102,72);
        coins5.setLocation(84,324);
        coins6.setLocation(144,393);
        coins6.setLocation(248,489);
        coins5.setLocation(71,313);
        coins5.setLocation(73,317);
        coins18.setLocation(692,97);
        coins13.setLocation(435,100);
        coins13.setLocation(416,121);
        coins13.setLocation(394,122);
        coins13.setLocation(385,84);
        coins13.setLocation(416,96);
        coins16.setLocation(87,197);
        coins15.setLocation(100,96);
        coins16.setLocation(77,240);
        obstacle_Vertical9.setLocation(157,234);
        obstacle_Horizontal19.setLocation(205,277);
        obstacle_Horizontal19.setLocation(238,294);
        coins17.setLocation(228,220);
        coins5.setLocation(66,379);
        coins7.setLocation(169,433);
        coins6.setLocation(256,500);
        zapper.setLocation(639,545);
        zapper.setLocation(665,456); 

        obstacle_Vertical9.setLocation(150,239);
        obstacle_Horizontal19.setLocation(180,301);
        coins17.setLocation(239,233);
        zapper.setLocation(631,436);
        obstacle_Vertical9.setLocation(164,232);
        obstacle_Horizontal19.setLocation(260,289);
        obstacle_Horizontal19.setLocation(246,279);
        obstacle_Horizontal19.setLocation(253,302);
        obstacle_Horizontal19.setLocation(203,300);
        obstacle_Horizontal19.setLocation(247,313);
        Obstacle_Vertical obstacle_Vertical10 = new Obstacle_Vertical();
        addObject(obstacle_Vertical10,19,201);
        Obstacle_Vertical obstacle_Vertical11 = new Obstacle_Vertical();
        addObject(obstacle_Vertical11,20,321);
        Obstacle_Vertical obstacle_Vertical12 = new Obstacle_Vertical();
        addObject(obstacle_Vertical12,20,452);
        Obstacle_Horizontal obstacle_Horizontal21 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal21,94,522);
        coins6.setLocation(224,522);
        Obstacle_Horizontal obstacle_Horizontal22 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal22,224,522);
        Obstacle_Horizontal obstacle_Horizontal23 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal23,356,526);
        Obstacle_Horizontal obstacle_Horizontal24 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal24,492,528);
        Obstacle_Horizontal obstacle_Horizontal25 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal25,618,529);
        Obstacle_Horizontal obstacle_Horizontal26 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal26,747,530);
        coins6.setLocation(303,402);
        Obstacle_Vertical obstacle_Vertical13 = new Obstacle_Vertical();
        addObject(obstacle_Vertical13,873,463);
        Obstacle_Vertical obstacle_Vertical14 = new Obstacle_Vertical();
        addObject(obstacle_Vertical14,873,338);
        Obstacle_Vertical obstacle_Vertical15 = new Obstacle_Vertical();
        addObject(obstacle_Vertical15,874,215);
        Obstacle_Vertical obstacle_Vertical16 = new Obstacle_Vertical();
        addObject(obstacle_Vertical16,874,81);
        Obstacle_Horizontal obstacle_Horizontal27 = new Obstacle_Horizontal();
        addObject(obstacle_Horizontal27,780,22);
        coins15.setLocation(98,100);
        Fang fang = new Fang();
        addObject(fang,98,100);
        coins15.setLocation(107,127);
        removeObject(coins15);
        
    }
    

    
}
