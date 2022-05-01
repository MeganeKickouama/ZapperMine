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
        //displayCounter2();
    }
    
    /*public void displayCounter2() {
         
        Zapper zapper = (Zapper)getWorld().getObjects(Zapper.class).get(0);
            
        if (getWorld() instanceof Level_1) {
                
        } else if (getWorld() instanceof Level_2) {
            
            switch (Zapper.coinsEatenLvl1) {
                case 0:  setImage("Cointseaten0.png");
                case 1:  setImage("Cointseaten1.png");
                case 2:  setImage("Cointseaten2.png");
                case 3:  setImage("Cointseaten3.png");
                case 4:  setImage("Cointseaten4.png");
                case 5:  setImage("Cointseaten5.png");
                case 6:  setImage("Cointseaten6.png");
                case 7:  setImage("Cointseaten7.png");
                case 8:  setImage("Cointseaten8.png");
                case 9:  setImage("Cointseaten9.png");
                case 10: setImage("Cointseaten10.png");
                case 11: setImage("Cointseaten11.png");
                case 12: setImage("Cointseaten12.png");
                case 13: setImage("Cointseaten13.png");
                case 14: setImage("Cointseaten14.png");
                case 15: setImage("Cointseaten15.png");
                default: setImage("Cointseaten0.png");
            }
                
        } else if (getWorld() instanceof Level_3) {
                
        } else if (getWorld() instanceof Level_4) {
                
        } else {};
        
    }*/
    
    public void displayCounter() {
        
        if (Greenfoot.mouseClicked(this)) {
            
            Zapper zapper = (Zapper)getWorld().getObjects(Zapper.class).get(0);
            //level 1
            if (getWorld() instanceof Level_1) {
                
                if (Zapper.coinsEatenLvl1 == 0) {
                    
                    setImage("Coinseaten0.png");
                }
                else if (Zapper.coinsEatenLvl1 == 1) {
                    
                    setImage("Coinseaten1.png");
                }
                 else if (Zapper.coinsEatenLvl1 == 2) {
                   
                    setImage("Coinseaten2.png");
                }
                else if (Zapper.coinsEatenLvl1 == 3) {
                    
                    setImage("Coinseaten3.png");
                }
                else if (Zapper.coinsEatenLvl1 == 4) {
                    
                    setImage("Coinseaten4.png");
                }
                else if (Zapper.coinsEatenLvl1 == 5) {
                    
                    setImage("Coinseaten5.png");
                }
                else if (Zapper.coinsEatenLvl1 == 6) {
                    
                    setImage("Coinseaten6.png");
                }
                else if (Zapper.coinsEatenLvl1 == 7) {
                    
                    setImage("Coinseaten7.png");
                }
                else if (Zapper.coinsEatenLvl1 == 8) {
                    
                    setImage("Coinseaten8.png");
                }
                else if (Zapper.coinsEatenLvl1 == 9) {
                    
                    setImage("Coinseaten9.png");
                }
                else if (Zapper.coinsEatenLvl1 == 10) {
                    
                    setImage("Coinseaten10.png");
                }
                else if (Zapper.coinsEatenLvl1 == 11) {
                    
                    setImage("Coinseaten11.png");
                }
                else if (Zapper.coinsEatenLvl1 == 12) {
                    
                    setImage("Coinseaten12.png");
                }
                else if (Zapper.coinsEatenLvl1 == 13) {
                    
                    setImage("Coinseaten13.png");
                }
                else if (Zapper.coinsEatenLvl1 == 14) {
                    
                    setImage("Coinseaten14.png");
                }
                else if (Zapper.coinsEatenLvl1 == 15) {
                    
                    setImage("Coinseaten15.png");
                } else {};
                // level 2
                if (getWorld() instanceof Level_2) {
                
                if (Zapper.coinsEatenLvl2 == 0) {
                    
                    setImage("Coinseaten0.png");
                }
                else if (Zapper.coinsEatenLvl2 == 1) {
                    
                    setImage("Coinseaten1.png");
                }
                else if (Zapper.coinsEatenLvl2 == 2) {
                    
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
