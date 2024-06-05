package sheet2;
public class Question5 
{
    public static void q5main()
    {
        complex c1 = new complex(3.0,4.0);
        complex c2 = new complex(1.0,2.0);
        
        complex sum = c1.addTo(c2);
        complex product = c1.multiplyTo(c2);
        complex conjugate = c1.conjugate();

        System.out.print("Complex 1: ");
        c1.display();
        System.out.print("Complex 2: ");
        c2.display();
        System.out.print("Sum: ");
        sum.display();
        System.out.print("Product: ");
        product.display();
        System.out.print("Conjugate of Complex 1: ");
        conjugate.display();
        System.out.println("Magnitude of Complex 1: " + c1.magnitude());
    } 
}
class complex
{
    private double rel , img;

    public complex(double rel, double img) 
    {
        this.rel = rel;
        this.img = img;
    }

    public void setRel(double rel)
    {
        this.rel = rel;
    }

    public void setImg(double img)
    {
        this.img = img;
    }

    public double getRel() 
    {
        return rel;
    }

    public double getImg() 
    {
        return img;
    }
    
    public boolean IsRel()
    {
        return img == 0.0;
    }

    public boolean IsImg() 
    {
        return rel == 0.0;
    }
    
    public boolean equals(complex a)
    {
        return this.rel == a.rel && this.img == a.img; 
    }
    
    public complex addTo(complex a)
    {
        double sum_rel = this.rel + a.rel;
        double sum_img = this.img + a.img;       
        complex sum = new complex(sum_rel,sum_img);
        return sum;
    }
    
    public complex multiplyTo(complex a)
    {
        double mult_rel = this.rel * a.rel - a.img * this.img;
        double mult_img = this.rel * a.img + this.img * a.rel;
        return new complex(mult_rel , mult_img);
    }
    
    public complex conjugate()
    {
        return new complex(rel , -img);
    }
    
    public double magnitude()
    {
        return Math.sqrt(this.rel * this.rel + this.img * this.img);
    }
    
    public void display()
    {
        if(IsRel())
            System.out.println(rel);
        else if(IsImg())
            System.out.println(img + "i");
        else
            System.out.println(rel + " + " + img + "i");
    }
}
