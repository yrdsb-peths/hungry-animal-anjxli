import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        // Create elephant object
        Elephant e = new Elephant();
        addObject(e, 300, 350);
        //Create a label
        scoreLabel = new Label(0, 100);
        addObject(scoreLabel, 300, 200);
        
        spawnFries();
    }
    
    //increase score as the elephant eats the fries
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    
    public void spawnFries()
    {
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        Fries fries = new Fries();
        addObject(fries, x, y);
        
    }
}
