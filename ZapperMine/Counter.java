import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        displayCounter();
    }
    
    public void displayCounter() {
        
        if (Greenfoot.mouseClicked(this)) {
            
            Zapper zapper = (Zapper)getWorld().getObjects(Zapper.class).get(0);
            //level 1
            if (getWorld() instanceof Level_1) {
                
                if (Zapper.coinsEatenLvl1 == 0) {
                    
                    setImage("Coinseaten0.png");
                }
                if (Zapper.coinsEatenLvl1 == 1) {
                    
                    setImage("Coinseaten1.png");
                }
                if (Zapper.coinsEatenLvl1 == 2) {
                    
                    setImage("Coinseaten2.png");
                }
                if (Zapper.coinsEatenLvl1 == 3) {
                    
                    setImage("Coinseaten3.png");
                }
                if (Zapper.coinsEatenLvl1 == 4) {
                    
                    setImage("Coinseaten4.png");
                }
                if (Zapper.coinsEatenLvl1 == 5) {
                    
                    setImage("Coinseaten5.png");
                }
                if (Zapper.coinsEatenLvl1 == 6) {
                    
                    setImage("Coinseaten6.png");
                }
                if (Zapper.coinsEatenLvl1 == 7) {
                    
                    setImage("Coinseaten7.png");
                }
                if (Zapper.coinsEatenLvl1 == 8) {
                    
                    setImage("Coinseaten8.png");
                }
                if (Zapper.coinsEatenLvl1 == 9) {
                    
                    setImage("Coinseaten9.png");
                }
                if (Zapper.coinsEatenLvl1 == 10) {
                    
                    setImage("Coinseaten10.png");
                }
                if (Zapper.coinsEatenLvl1 == 11) {
                    
                    setImage("Coinseaten11.png");
                }
                if (Zapper.coinsEatenLvl1 == 12) {
                    
                    setImage("Coinseaten12.png");
                }
                if (Zapper.coinsEatenLvl1 == 13) {
                    
                    setImage("Coinseaten13.png");
                }
                if (Zapper.coinsEatenLvl1 == 14) {
                    
                    setImage("Coinseaten14.png");
                }
                if (Zapper.coinsEatenLvl1 == 15) {
                    
                    setImage("Coinseaten15.png");
                }
                // level 2
                if (getWorld() instanceof Level_2) {
                
                if (Zapper.coinsEatenLvl2 == 0) {
                    
                    setImage("Coinseaten0.png");
                }
                if (Zapper.coinsEatenLvl2 == 1) {
                    
                    setImage("Coinseaten1.png");
                }
                if (Zapper.coinsEatenLvl2 == 2) {
                    
                    setImage("Coinseaten2.png");
                }
                if (Zapper.coinsEatenLvl2 == 3) {
                    
                    setImage("Coinseaten3.png");
                }
                if (Zapper.coinsEatenLvl2 == 4) {
                    
                    setImage("Coinseaten4.png");
                }
                if (Zapper.coinsEatenLvl2 == 5) {
                    
                    setImage("Coinseaten5.png");
                }
                if (Zapper.coinsEatenLvl2 == 6) {
                    
                    setImage("Coinseaten6.png");
                }
                if (Zapper.coinsEatenLvl2 == 7) {
                    
                    setImage("Coinseaten7.png");
                }
                if (Zapper.coinsEatenLvl2 == 8) {
                    
                    setImage("Coinseaten8.png");
                }
                if (Zapper.coinsEatenLvl2 == 9) {
                    
                    setImage("Coinseaten9.png");
                }
                if (Zapper.coinsEatenLvl2 == 10) {
                    
                    setImage("Coinseaten10.png");
                }
                if (Zapper.coinsEatenLvl2 == 11) {
                    
                    setImage("Coinseaten11.png");
                }
                if (Zapper.coinsEatenLvl2 == 12) {
                    
                    setImage("Coinseaten12.png");
                }
                if (Zapper.coinsEatenLvl2 == 13) {
                    
                    setImage("Coinseaten13.png");
                }
                if (Zapper.coinsEatenLvl2 == 14) {
                    
                    setImage("Coinseaten14.png");
                }
                if (Zapper.coinsEatenLvl2 == 15) {
                    
                    setImage("Coinseaten15.png");
                }
                //level 3
                if (getWorld() instanceof Level_3) {
                
                if (Zapper.coinsEatenLvl3 == 0) {
                    
                    setImage("Coinseaten0.png");
                }
                if (Zapper.coinsEatenLvl3 == 1) {
                    
                    setImage("Coinseaten1.png");
                }
                if (Zapper.coinsEatenLvl3 == 2) {
                    
                    setImage("Coinseaten2.png");
                }
                if (Zapper.coinsEatenLvl3 == 3) {
                    
                    setImage("Coinseaten3.png");
                }
                if (Zapper.coinsEatenLvl3 == 4) {
                    
                    setImage("Coinseaten4.png");
                }
                if (Zapper.coinsEatenLvl3 == 5) {
                    
                    setImage("Coinseaten5.png");
                }
                if (Zapper.coinsEatenLvl3 == 6) {
                    
                    setImage("Coinseaten6.png");
                }
                if (Zapper.coinsEatenLvl3 == 7) {
                    
                    setImage("Coinseaten7.png");
                }
                if (Zapper.coinsEatenLvl3 == 8) {
                    
                    setImage("Coinseaten8.png");
                }
                if (Zapper.coinsEatenLvl3 == 9) {
                    
                    setImage("Coinseaten9.png");
                }
                if (Zapper.coinsEatenLvl3 == 10) {
                    
                    setImage("Coinseaten10.png");
                }
                if (Zapper.coinsEatenLvl3 == 11) {
                    
                    setImage("Coinseaten11.png");
                }
                if (Zapper.coinsEatenLvl3 == 12) {
                    
                    setImage("Coinseaten12.png");
                }
                if (Zapper.coinsEatenLvl3 == 13) {
                    
                    setImage("Coinseaten13.png");
                }
                if (Zapper.coinsEatenLvl3 == 14) {
                    
                    setImage("Coinseaten14.png");
                }
                if (Zapper.coinsEatenLvl3 == 15) {
                    
                    setImage("Coinseaten15.png");
                }
                // level 4 
                if (getWorld() instanceof Level_4) {
                
                if (Zapper.coinsEatenLvl4 == 0) {
                    
                    setImage("Coinseaten0.png");
                }
                if (Zapper.coinsEatenLvl4 == 1) {
                    
                    setImage("Coinseaten1.png");
                }
                if (Zapper.coinsEatenLvl4 == 2) {
                    
                    setImage("Coinseaten2.png");
                }
                if (Zapper.coinsEatenLvl4 == 3) {
                    
                    setImage("Coinseaten3.png");
                }
                if (Zapper.coinsEatenLvl4 == 4) {
                    
                    setImage("Coinseaten4.png");
                }
                if (Zapper.coinsEatenLvl4 == 5) {
                    
                    setImage("Coinseaten5.png");
                }
                if (Zapper.coinsEatenLvl4 == 6) {
                    
                    setImage("Coinseaten6.png");
                }
                if (Zapper.coinsEatenLvl4 == 7) {
                    
                    setImage("Coinseaten7.png");
                }
                if (Zapper.coinsEatenLvl4 == 8) {
                    
                    setImage("Coinseaten8.png");
                }
                if (Zapper.coinsEatenLvl4 == 9) {
                    
                    setImage("Coinseaten9.png");
                }
                if (Zapper.coinsEatenLvl4 == 10) {
                    
                    setImage("Coinseaten10.png");
                }
                if (Zapper.coinsEatenLvl4 == 11) {
                    
                    setImage("Coinseaten11.png");
                }
                if (Zapper.coinsEatenLvl4 == 12) {
                    
                    setImage("Coinseaten12.png");
                }
                if (Zapper.coinsEatenLvl4 == 13) {
                    
                    setImage("Coinseaten13.png");
                }
                if (Zapper.coinsEatenLvl4 == 14) {
                    
                    setImage("Coinseaten14.png");
                }
                if (Zapper.coinsEatenLvl4 == 15) {
                    
                    setImage("Coinseaten15.png");
                }
                
            }
        }
    }
}
}
}
}
