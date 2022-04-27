import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obstacle_Horizontal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obstacle_Horizontal extends Blocks
{
    static int dragLevel1 = 1;
    public void act()
    {
        // Add your action code here.
        killZapper();
        transitionToLevelWon();
        dragBlock();
    }
    
    public void dragBlock() {
        
        MouseInfo mouse = Greenfoot.getMouseInfo();
        while (dragLevel1 > 0) {
            if (Greenfoot.mouseDragged(this)) {
            
            setLocation(mouse.getX(), mouse.getY());
            dragLevel1--;
            }
        }
    }
    
    public void killZapper() {
            
            World currentWorld = getWorld();
            Actor zapper = (Actor)getOneIntersectingObject(Zapper.class);
            
            if (zapper != null) {
                currentWorld.removeObject(zapper);
                
            }
            
        }
        
    public boolean isZapperDead() {
        
        World world = getWorld();
        int zapperCount = world.getObjects(Zapper.class).size();
        
        if (zapperCount == 0) {
            return true;
        } else return false;
    }
    
    public void transitionToLevelWon() {
        
        if (isZapperDead()) {
            Greenfoot.setWorld(new Level_Won());
        }
    }

    /* LEVEL BOOSTERS */ 
    
    public boolean canStillDrag() {
        if (dragLevel1 > 0) {
            return true;
        } else return false;
    }
    
}
