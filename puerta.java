import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class puerta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class puerta extends Actor
{
    /**
     * Act - do whatever the puerta wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public puerta(){
       GreenfootImage img = getImage(); 
        img.scale(20, 200);              
        setImage(img);   
        
    }
    public void act()
    {
       GreenfootImage img = getImage(); 
        img.scale(20, 200);              
        setImage(img);  
    }
}
