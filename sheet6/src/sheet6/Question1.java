package sheet6;
public class Question1 
{
    public static void q1main()
    {
        Geometric_Object [] arr = new Geometric_Object [3];
        
        arr[0] = new Circle("Red" , true , 5.2f);
        arr[1] = new Rectangle("Yellow" , true , 5.0f , 4.0f);
        arr[2] = new Square("Blue" , true , 6.0f);
        
        for(int i = 0; i < 3 ; i++)
        {
            if(arr[i].getArea() > 20)
            {
                System.out.println("The information of geometric objects: " + arr[i]);
                System.out.println("The Area: " + arr[i].getArea());
                System.out.println("The Perimeter: " + arr[i].getPerimeter());
                System.out.println("\n================================================\n");
            }
        }
    }
}

abstract class Geometric_Object implements Comparable<Geometric_Object>
{
    private String color;
    private boolean filled;

    public Geometric_Object(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) 
    {
        this.color = color;
    }

    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }

    public String getColor()
    {
        return color;
    }

    public boolean getFilled()
    {
        return filled;
    }

    @Override
    public int compareTo(Geometric_Object o) {
        // Compare based on the area
        return Double.compare(this.getArea(), o.getArea());
    }
    
    @Override
    public String toString() 
    {
        return "GeometricObject{" + "color=" + color + ", filled=" + filled + '}';
    }
    
    public abstract float getArea();
    public abstract float getPerimeter();
}

class Circle extends Geometric_Object
{
    private float radius;

    public Circle(String color, boolean filled, float radius)
    {
        super(color, filled);
        this.radius = radius;
    }

    public void setRadius(float radius) 
    {
        this.radius = radius;
    }

    public float getRadius() 
    {
        return radius;
    }

    @Override
    public String toString()
    {
        return  super.toString()+ "\n" + "Circle{" + "radius=" + radius + '}' + "\n";
    }
    
    @Override
    public float getArea()
    {
        return (float) (3.14f * Math.pow(this.getRadius(), 2));
    }
    
    @Override
    public float getPerimeter()
    {
        return (2 * 3.14f * this.getRadius());
    }
}

class Rectangle extends Geometric_Object
{
    private float length, width;

    public Rectangle(String color, boolean filled, float length, float width)
    {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public void setLength(float length) 
    {
        this.length = length;
    }

    public void setWidth(float width) 
    {
        this.width = width;
    }

    public float getLength()
    {
        return length;
    }

    public float getWidth() 
    {
        return width;
    }

    @Override
    public String toString()
    {
        return super.toString()+ "\n" + "Rectangle{" + "length=" + length + ", width=" + width + '}' + "\n";
    }
    
    @Override
    public float getArea()
    {
        return this.getLength() * this.getWidth();
    }
    
    @Override
    public float getPerimeter()
    {
        return (this.getLength() + this.getWidth()) * 2;
    }
}

class Square extends Rectangle
{
    public Square(String color, boolean filled, float side)
    {
        super(color, filled, side, side);
    }
    
    public void setSide(float side) 
    {
        super.setWidth(side);
        super.setLength(side);
    }

    public float getSide()
    {
        return super.getLength();  // or super.getWidth(); because length = width = side.
    }
    
    @Override
    public String toString()
    {
        return super.toString()+ "\n" + "Square{" + "Side=" + this.getSide() + '}' + "\n";
    }
}