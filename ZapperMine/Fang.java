import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Fang extends Fangs
{
    GifImage fangColourBlue = new GifImage("Fang_Animation_Blue.gif");
    GifImage fangColourGreen = new GifImage("Fang_Animation_Green.gif");
    GifImage fangColourOrange = new GifImage("Fang_Animation_Orange.gif");
    public Fang() {
  
        int colourID = Greenfoot.getRandomNumber(3);
        if (colourID == 0) {
            
            setImage(fangColourBlue.getCurrentImage());
        } else if (colourID == 1) {
            
            setImage(fangColourGreen.getCurrentImage());
        } else {
            
            setImage(fangColourOrange.getCurrentImage());
        }
        
        getImage().scale(80, 80);
        
        // fix gif not moving later
    }
    
    
    public void act()
    {
        eatCoin();
        move(2);
        touchBlock();
    }
    
    public void eatCoin() {
        
        World currentWorld = getWorld();
        Actor coin = (Actor)getOneIntersectingObject(Coins.class);
        Actor silverCoin = (Actor)getOneIntersectingObject(Silver_Coin.class);
        
        if (coin != null) {
            
            currentWorld.removeObject(coin);
            if (currentWorld.getObjects(Coins.class).size() == 0) {
                
                 Greenfoot.setWorld(new Level_Lost());
            }
        }
        
        if (silverCoin != null) { // when the fangs touch a silver coin, the game is automatically over. this makes the silver coin important to protect.
            
            currentWorld.removeObject(silverCoin);
            Greenfoot.setWorld(new Level_Lost());
        }
        
    }
    
    public void touchBlock() {
        
        Actor vertical = (Actor)getOneIntersectingObject(Obstacle_Vertical.class);
        
        
        if (vertical != null) {
            
            turn(180);
        }
    }
}
