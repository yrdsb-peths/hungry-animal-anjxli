import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen
 * 
 * @author (Anjali Vathanakumaran) 
 * @version (May 2022)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Feed the Elephant", 50);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(titleLabel, getWidth()/2, getHeight()/2);
    }
    // sends user back to the main world act
    public void act()
    {
        //start the game when the user presses space bar
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
}
