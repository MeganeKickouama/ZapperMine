import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obstacle_Horizontal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obstacle_Horizontal extends Blocks
{
    public static int dragLevel1;
    
    public Obstacle_Horizontal() {
        
        dragLevel1 = 3;
    }
    public void act()
    {
        // Add your action code here.
        killZapper();
        transitionToLevelLost();
        dragBlock();
    }
    
    public void dragBlock() {
        
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (canStillDrag1()) {
            if (Greenfoot.mouseDragged(this)) {
                
                setLocation(mouse.getX(), mouse.getY());
                return;
                // make block highlighted
            }
            
            if (Greenfoot.mouseDragEnded(this)) {
                
                dragLevel1--;
            }
        } // else display "zero available drags"
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
    
    public void transitionToLevelLost() {
        
        if (isZapperDead()) {
            Greenfoot.setWorld(new Level_Lost());
        }
    }

    /* LEVEL BOOSTERS */ 
    
    public boolean canStillDrag1() {
        if (dragLevel1 > 0) {
            return true;
        } else return false;
    }
    
}
