package sheet6;
public class Question2 
{
    public static void q2main()
    {
        MovablePoint test = new MovablePoint(2.5f, 2.5f, 2.0f, 2.0f);
        System.out.println("The Display: " + test);
        test.moveRight();
        test.moveUp();
        System.out.println("The Display After move : " + test);
    }
}

interface Movable
{
    void moveRight();
    void moveDown();
    void moveLeft();
    void moveUp();
}

class MovablePoint implements Movable
{
    private float x, y;
    private float xAmount, yAmount;

    public MovablePoint(float x, float y, float xAmount, float yAmount) 
    {
        this.x = x;
        this.y = y;
        this.xAmount = xAmount;
        this.yAmount = yAmount;
    }
    
    @Override
    public void moveRight()
    {
        this.x += this.xAmount;
    }
    
    @Override
    public void moveDown()
    {
        this.y += this.yAmount;
    }
    
    @Override
    public void moveLeft()
    {
        this.x -= this.xAmount;
    }
    
    @Override
    public void moveUp()
    {
        this.y -= this.yAmount;
    }

    @Override
    public String toString()
    {
        return "(" + x + " , " + y + ") Amount = (" + xAmount + " , " + yAmount + ")";
    }
}