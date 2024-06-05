package sheet3;
import java.util.Arrays;
import java.util.Scanner;
public class Question3
{
    public static void swap(Rectangle_WRAPPER RW1, Rectangle_WRAPPER RW2)
    {
        Rectangle temp = RW1.R;
        RW1.R = RW2.R;
        RW2.R=temp;
    }
    
    public static void q3main()
    {
        Scanner in = new Scanner(System.in);
        Rectangle []R = new Rectangle[5];
        
        for(int i = 0; i < R.length ; i++)
        {
            System.out.print("Please Enter Length "+ (i+1) +": " );
            double length = in.nextDouble();
            System.out.print("Please Enter width "+ (i+1) +": " );
            double width = in.nextDouble();
            R[i] = new Rectangle(length, width);          
        }
        
        for (int i = 0; i < R.length; i++)
        {
            if(R[i].getArea()>1500)
                System.out.println(R[i].toString());
        }
        
        System.out.println("=================================");
        
        Rectangle_WRAPPER []RW = new Rectangle_WRAPPER[R.length];
        for (int i = 0; i < R.length; i++)
        {
            RW[i] = new Rectangle_WRAPPER(R[i]);    
        }
        
        for (int i = 0; i < R.length; i++)
        {
            for (int j = i+1; j < R.length; j++) 
            {
                if (R[i].getLength() == R[j].getLength() && R[i].getWidth() != R[j].getWidth())
                    swap(RW[i], RW[j]);
            }
        }    
            System.out.println(Arrays.toString(RW));

    }
}
class Rectangle
{
    private double length, width;

    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) 
    {
        this.length = length;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getLength() 
    {
        return length;
    }

    public double getWidth() 
    {
        return width;
    }
    
    public double getPerimeter()
    {
        return (length + width) * 2;
    }
    
    public double getArea()
    {
        return length * width;
    }

    @Override
    public String toString()
    {
        return "Perimeter=" + this.getPerimeter() + ", Area=" + this.getArea() + "\n";
    }

}

class Rectangle_WRAPPER
{
    Rectangle R;

    public Rectangle_WRAPPER(Rectangle R) 
    {
        this.R = R;
    }

    @Override
    public String toString()
    {
        return R.toString();
    }
    
    
}