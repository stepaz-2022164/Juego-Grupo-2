import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fondo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fondo extends World
{

    /**
     * Constructor for objects of class fondo.
     * 
     */
    monedas personaje;
    puerta puerta;
    puerta_derecha puerta_derecha;
    puerta_down puerta_down;
    puerta_up puerta_up;
    
    mosca mosca;
    
    
    public fondo(int lado)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        // Crear un objeto Enemigo
        personaje = new monedas();

        if(lado == 1){
            addObject(personaje, 0 + personaje.getImage().getWidth()/2, getHeight()/2);    
        }
        prepare();
        
    }
    private void prepare()
    {
        puerta = new puerta();
        addObject(puerta,997,317);
        puerta_derecha = new puerta_derecha();
        addObject(puerta_derecha,4,317);
        puerta_down = new puerta_down();
        addObject(puerta_down,505,0);
        puerta_up = new puerta_up();
        addObject(puerta_up,504,598);
        
        mosca = new mosca();
        addObject(mosca, 400, 200);
    }
}
