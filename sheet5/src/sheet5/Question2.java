package sheet5;
public class Question2
{
    public static void q2main()
    {
        Point2D start = new Point2D(5,8);
        Point2D end = new Point2D(8,5);
        
        Figure F = new Figure(start , "Red");
        
        Closed_Figure CF = new Closed_Figure(start, "Blue", 10 ,15 , true);
        
        Rectangle R = new Rectangle(start, end, "Black", true);
        
        F.display();
        System.out.println("*******************************");
        CF.display();
        System.out.println("*******************************");
        R.display();
        
        
        CF=R;
        System.out.println("\n ============\n"+CF.area());
        
    }
}

class Figure
{
    private Point2D start;
    private String color;

    public Figure(Point2D start, String color)
    {
        this.start = start;
        this.color = color;
    }

    public void setStart(Point2D start)
    {
        this.start = start;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public Point2D getStart() 
    {
        return start;
    }

    public String getColor() 
    {
        return color;
    }
    
    void display()
    {
        System.out.println(start.toString() + ", Colour: " + this.color);
    }
}

class Closed_Figure extends Figure
{
    float width , height;
    boolean filled;

    public Closed_Figure(Point2D start, String color, float width, float height, boolean filled) 
    {
        super(start, color);
        this.width = width;
        this.height = height;
        this.filled = filled;
    }

    public void setWidth(float width)
    {
        this.width = width;
    }

    public void setHeight(float height)
    {
        this.height = height;
    }

    public void setFilled(boolean filled) 
    {
        this.filled = filled;
    }

    public float getWidth()
    {
        return width;
    }

    public float getHeight()
    {
        return height;
    }

    public boolean isFilled() 
    {
        return filled;
    }
    
    public float area()
    {
        return 0;
    }
    
    @Override
    public void display()
    {
        System.out.println("width : "+this.width);
        System.out.println("height : "+this.height);
        System.out.println("The Point2D : " + this.getStart().toString());
        System.out.println("color : "+this.getColor());
        System.out.println("filled : "+this.filled);
        System.out.println("area : "+this.area());
    }
    
}

class Rectangle extends Closed_Figure
{

    public Rectangle(Point2D start, Point2D end, String color, boolean filled)
    {
        super(start, color, Math.abs((float)(start.getX() - end.getX())), Math.abs((float)(start.getY() - end.getY())), filled);
    }
    
    public float area()
    {
        return this.height * this.width;
    }
    
    public void display()
    {
        System.out.println("width : "+this.width);
        System.out.println("height : "+this.height);
        System.out.println("The Point2D : " + this.getStart().toString());
        System.out.println("color : "+this.getColor());
        System.out.println("filled : "+this.filled);
        System.out.println("area : "+this.area());
    }
}