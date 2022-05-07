import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Play_Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play_Button extends Buttons
{
    /**
     * Act - do whatever the Play_Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        MouseInfo mouse = Greenfoot.getMouseInfo();
        
        if (Greenfoot.mouseMoved(this)) {
            setImage("Playh.png");
        } 
        if (Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this)) {
            setImage("Play.png");
        }
        
        if (Greenfoot.mouseClicked(this)) {
            
            getWorld().stopped();
            if (Level_1.isBeaten == true) {
                
                Level_2 lvl2 = new Level_2();
                Greenfoot.setWorld(lvl2);
                getWorld().stopped();
                } else if (Level_2.isBeaten == true)  {
                    
                Level_3 lvl3 = new Level_3();
                Greenfoot.setWorld(lvl3);
                
                } else if (Level_3.isBeaten == true)  {
                    
                Level_4 lvl4 = new Level_4();
                Greenfoot.setWorld(lvl4);
                
                } else {
                Level_1 lvl1 = new Level_1();
                Greenfoot.setWorld(lvl1);
            }
        }
    }
}
