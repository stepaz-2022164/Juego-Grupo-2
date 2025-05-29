import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mosca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mosca extends Actor
{
    /**
     * Act - do whatever the mosca wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        // Add your action code here.
        monedas jugador = (monedas) getWorld().getObjects(monedas.class).get(0);
        int jugadorX = jugador.getX();
        int jugadorY = jugador.getY();
        turnTowards(jugadorX, jugadorY);
            
        move(2);

    }
}
