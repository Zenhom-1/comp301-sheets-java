package sheet5;
public class Question1 
{
    public static void q1main()
    {
        Point2D [] p2D = new Point2D[5];
        p2D[0] = new Point2D(10,11);
        p2D[1] = new Point2D(3,4);
        p2D[2] = new Point2D(6,7);
        p2D[3] = new Point3D(3,4,5);
        p2D[4] = new Point3D(3,4,5);
        
        System.out.println("element 1: " + p2D[1].toString());
        System.out.println("element 2: " + p2D[2].toString());
        System.out.println("element 3: " + p2D[2].toString());
        System.out.println("element 4: " + p2D[3].toString());
        System.out.println("element 5: " + p2D[4].toString());
        
        System.out.println("=======================================");
        
        double d1,d2,d3,d4;
        boolean b1,b2,b3,b4;
        
        d1 = p2D[0].distance(p2D[1]);
        d2 = p2D[1].distance(p2D[2]);
        d3 = p2D[2].distance(p2D[3]);
        d4 = p2D[3].distance(p2D[4]);
        
        b1 = p2D[0].equals(p2D[1]);
        b2 = p2D[1].equals(p2D[2]);
        b3 = p2D[2].equals(p2D[3]);
        b4 = p2D[3].equals(p2D[4]);
        
        System.out.println("The Distance between elemant 1 and 2: " +d1);
        System.out.println("The Distance between elemant 2 and 3: " +d2);
        System.out.println("The Distance between elemant 3 and 4: " +d3);
        System.out.println("The Distance between elemant 4 and 5: " +d4);
        
        System.out.println("============================");
        
        System.out.println("The elemant 1 is equal 2: " +b1);
        System.out.println("The elemant 2 is equal 3: " +b2);
        System.out.println("The elemant 3 is equal 4: " +b3);
        System.out.println("The elemant 4 is equal 5: " +b4);
    }
}

class Point2D
{
    private double x,y;

    public Point2D(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public double getX() 
    {
        return x;
    }

    public double getY() 
    {
        return y;
    }
    
    public void set_XY(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    
    public double[] get_XY()
    {
        double result[] = new double[2];
        result[0] = getX();
        result[1] =  getY();
        return result;
    }
    
    public double distance(Point2D b)
    {
        double x1,x2,y1,y2;
        x1 = this.x;
        x2 = b.x;
        y1 = this.y;
        y2 = b.y;
        double sum_X , sum_Y;
        sum_X = x1 - x2;
        sum_Y = y1 - y2;
        return Math.sqrt(Math.pow(sum_X, 2) + Math.pow(sum_Y, 2));
    }
    
    public double distance(double a, double b)
    {
        double x1,y1;
        x1 = this.x;
        y1 = this.y;
        double sum_X , sum_Y;
        sum_X = x1 - a;
        sum_Y = y1 - b;
        return Math.sqrt(Math.pow(sum_X, 2) + Math.pow(sum_Y, 2));
    }
    
    public boolean equals(Point2D b)
    {
        return this.x == b.x && this.y == b.y;
    }

    @Override
    public String toString()
    {
        return "(" + x + " , " + y + ')';
    }
}

class Point3D extends Point2D
{
    private double z;

    public Point3D(double x, double y, double z) 
    {
        super(x, y);
        this.z = z;
    }

    public void setZ(double z)
    {
        this.z = z;
    }

    public double getZ()
    {
        return z;
    }
    
    public void set_XYZ(double x, double y, double z)
    {
        this.setX(x);
        this.setY(y);
        this.z = z;
    }
    
    public double[] get_XYZ()
    {
        double result[] = new double[3];
        result[0] = getX();
        result[1] = getY();
        result[2] = getZ();
        return result;
    }
    
    public double distance(Point3D b)
    {
        double x1,x2,y1,y2,z1,z2;
        x1 = this.getX();
        x2 = b.getX();
        y1 = this.getY();
        y2 = b.getY();
        z1 = this.getZ();
        z2 = b.getZ();
        double sum_X , sum_Y , sum_Z;
        sum_X = x1 - x2;
        sum_Y = y1 - y2;
        sum_Z = z1 - z2;
        return Math.sqrt(Math.pow(sum_X, 2) + Math.pow(sum_Y, 2) + Math.pow(sum_Z, 2));
    }
    
    public double distance(double a, double b, double c)
    {
        double x1,y1,z1;
        x1 = this.getX();
        y1 = this.getY();
        z1 = this.getZ();
        double sum_X , sum_Y , sum_Z;
        sum_X = x1 - a;
        sum_Y = y1 - b;
        sum_Z = z1 - c;
        return Math.sqrt(Math.pow(sum_X, 2) + Math.pow(sum_Y, 2) + Math.pow(sum_Z, 2));
    }
    
    public boolean equals(Point3D b)
    {
        return this.getX() == b.getX() && this.getY() == b.getY() && this.getZ() == b.getZ();
    }

    @Override
    public String toString()
    {
        return "(" + getX() + " , " + getY() + " , " + getZ() +')';
    }
    
    
}