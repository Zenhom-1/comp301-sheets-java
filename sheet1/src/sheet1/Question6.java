package sheet1;
import java.util.Scanner;
public class Question6 
{
    public static void q6main()
    {
        Scanner in = new Scanner(System.in);
        int a,b,c;
        System.out.print("Please Enter a:");
        a = in.nextInt();
        System.out.print("Please Enter b:");
        b = in.nextInt();
        System.out.print("Please Enter c:");
        c = in.nextInt();
        if(a>=b && a>=c)
            System.out.println("The Largest: " + a);
        else if(b>=a && b>=c)
            System.out.println("The Largest: " + b);
        else if(c>=a && c>=b)
            System.out.println("The Largest: " + c);
    }
}
