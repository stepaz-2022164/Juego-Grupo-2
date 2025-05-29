import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    monedas monedas;
    puerta puerta;
    puerta_derecha puerta_derecha;
    puerta_down puerta_down;
    puerta_up puerta_up;
    
    
    public boolean salaganada = true;

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        monedas = new monedas();
        addObject(monedas,280,186);
        puerta = new puerta();
        addObject(puerta,997,317);
        monedas.setLocation(504,298);
        puerta_derecha = new puerta_derecha();
        addObject(puerta_derecha,4,317);
        puerta_down = new puerta_down();
        addObject(puerta_down,505,0);
        puerta_up = new puerta_up();
        addObject(puerta_up,504,598);
    }

    public void act()
    {
        detectarBordes();
    }
    public void detectarBordes()
    {
        int x = monedas.getX();
        int y = monedas.getY();
        int mitadAncho = monedas.getImage().getWidth() / 2;
        int mitadAlto = monedas.getImage().getHeight() / 2;

        if(salaganada){
            monedas.puedesalir = true;
           if (x - mitadAncho <= 0) {
            //Toca el borde izquierdo"
            } else if (x + mitadAncho >= getWidth()) {
            //Toca el borde derecho
            Greenfoot.setWorld(new fondo(1)); 
            }else if (y - mitadAlto <= 0) {
            //Toca el borde superior
            } else if (y + mitadAlto >= getHeight()) {
            //Toca el borde inferior
            
        } 
        puerta.setImage("lift-open.png");
            puerta_derecha.setImage("lift-open.png");
            puerta_down.setImage("lift-open.png");
            puerta_up.setImage("lift-open.png");
        }
        
    }
}
