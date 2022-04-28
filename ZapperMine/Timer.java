import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
    public class Timer extends Actor {
    
        private int time=10000;
        /**
         * Act - do whatever the Timer wants to do. This method is called whenever
         * the 'Act' or 'Run' button gets pressed in the environment.
         */
        public void act()
        {
            // Add your action code here.
            countTime();
            showText(""+time,50,50);
        }
        public void countTime(){
            time--;
        if(time==0){
            //transfer for the gameoverscreen
            Greenfoot.stop();
            }
        }
        public void showText(String s, int x, int y){
            GreenfootImage img = new GreenfootImage(50, 20);
            Font font = new Font(20);
            img.setFont(font);
            img.drawString(s, x, y);
            img.setFont(new Font("Calibri", 20));
        }
    }
