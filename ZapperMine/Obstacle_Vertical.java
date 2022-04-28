import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obstacle_Vertical here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obstacle_Vertical extends Blocks
{
    public void act()
    {
        // Add your action code here.
        killZapper();
        transitionToLevelLost();
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (Greenfoot.mouseDragged(this)) {
            
            setLocation(mouse.getX(), mouse.getY());
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
    
    public void transitionToLevelLost() {
        
        if (isZapperDead()) {
            Greenfoot.setWorld(new Level_Lost());
        }
    }

    
}
