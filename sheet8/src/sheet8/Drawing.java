package sheet8;

import java.awt.Color;
import java.awt.Point;

public class Drawing 
{
    Color c;
    String type;
    Point start, end;  
    boolean filled;

    public Drawing(Color c, String type, Point start, Point end, boolean filled) 
    {
        this.c = c;
        this.type = type;
        this.start = start;
        this.end = end;
        this.filled = filled;
    }

    public void setC(Color c) 
    {
        this.c = c;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setStart(Point start)
    {
        this.start = start;
    }

    public void setEnd(Point end) 
    {
        this.end = end;
    }

    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }

    public Color getC() 
    {
        return c;
    }

    public String getType() 
    {
        return type;
    }

    public Point getStart()
    {
        return start;
    }

    public Point getEnd() 
    {
        return end;
    }

    public boolean isFilled()
    {
        return filled;
    }
    
    
    
}
