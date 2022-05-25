import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Game World
 * 
 * @author Anjali Vathanakumaran
 * @version May 2022
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    int level = 1;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        // Create elephant object
        
        TitleScreen titlescn = new TitleScreen();
        Greenfoot.setWorld(titlescn);
        if(Greenfoot.isKeyDown("space"))
        {
            Elephant e = new Elephant();
            addObject(e, 300, 350);
            //Create a label
            scoreLabel = new Label(0, 100);
            addObject(scoreLabel, 50, 50);
            
            spawnFries();
        }
    }
    //end game when the fries aren't eaten
    public void gameOver()
    {
        Label gameOverLabel = new Label ("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
        
    }
    
    
    //increase score as the elephant eats the fries
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        if(score % 5 == 0);
        {
            level++;
        }
    }
    
    public void spawnFries()
    {
        Fries fries = new Fries();
        fries.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        
        addObject(fries, x, y);
        
    }
    
}
